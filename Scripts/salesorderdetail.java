// ORM class for table 'salesorderdetail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 31 18:32:09 PST 2014
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class salesorderdetail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer SalesOrderID;
  public Integer get_SalesOrderID() {
    return SalesOrderID;
  }
  public void set_SalesOrderID(Integer SalesOrderID) {
    this.SalesOrderID = SalesOrderID;
  }
  public salesorderdetail with_SalesOrderID(Integer SalesOrderID) {
    this.SalesOrderID = SalesOrderID;
    return this;
  }
  private Integer SalesOrderDetailID;
  public Integer get_SalesOrderDetailID() {
    return SalesOrderDetailID;
  }
  public void set_SalesOrderDetailID(Integer SalesOrderDetailID) {
    this.SalesOrderDetailID = SalesOrderDetailID;
  }
  public salesorderdetail with_SalesOrderDetailID(Integer SalesOrderDetailID) {
    this.SalesOrderDetailID = SalesOrderDetailID;
    return this;
  }
  private String CarrierTrackingNumber;
  public String get_CarrierTrackingNumber() {
    return CarrierTrackingNumber;
  }
  public void set_CarrierTrackingNumber(String CarrierTrackingNumber) {
    this.CarrierTrackingNumber = CarrierTrackingNumber;
  }
  public salesorderdetail with_CarrierTrackingNumber(String CarrierTrackingNumber) {
    this.CarrierTrackingNumber = CarrierTrackingNumber;
    return this;
  }
  private Integer OrderQty;
  public Integer get_OrderQty() {
    return OrderQty;
  }
  public void set_OrderQty(Integer OrderQty) {
    this.OrderQty = OrderQty;
  }
  public salesorderdetail with_OrderQty(Integer OrderQty) {
    this.OrderQty = OrderQty;
    return this;
  }
  private Integer ProductID;
  public Integer get_ProductID() {
    return ProductID;
  }
  public void set_ProductID(Integer ProductID) {
    this.ProductID = ProductID;
  }
  public salesorderdetail with_ProductID(Integer ProductID) {
    this.ProductID = ProductID;
    return this;
  }
  private Integer SpecialOfferID;
  public Integer get_SpecialOfferID() {
    return SpecialOfferID;
  }
  public void set_SpecialOfferID(Integer SpecialOfferID) {
    this.SpecialOfferID = SpecialOfferID;
  }
  public salesorderdetail with_SpecialOfferID(Integer SpecialOfferID) {
    this.SpecialOfferID = SpecialOfferID;
    return this;
  }
  private Double UnitPrice;
  public Double get_UnitPrice() {
    return UnitPrice;
  }
  public void set_UnitPrice(Double UnitPrice) {
    this.UnitPrice = UnitPrice;
  }
  public salesorderdetail with_UnitPrice(Double UnitPrice) {
    this.UnitPrice = UnitPrice;
    return this;
  }
  private Double UnitPriceDiscount;
  public Double get_UnitPriceDiscount() {
    return UnitPriceDiscount;
  }
  public void set_UnitPriceDiscount(Double UnitPriceDiscount) {
    this.UnitPriceDiscount = UnitPriceDiscount;
  }
  public salesorderdetail with_UnitPriceDiscount(Double UnitPriceDiscount) {
    this.UnitPriceDiscount = UnitPriceDiscount;
    return this;
  }
  private Double LineTotal;
  public Double get_LineTotal() {
    return LineTotal;
  }
  public void set_LineTotal(Double LineTotal) {
    this.LineTotal = LineTotal;
  }
  public salesorderdetail with_LineTotal(Double LineTotal) {
    this.LineTotal = LineTotal;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable rowguid;
  public org.apache.hadoop.io.BytesWritable get_rowguid() {
    return rowguid;
  }
  public void set_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
    this.rowguid = rowguid;
  }
  public salesorderdetail with_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
    this.rowguid = rowguid;
    return this;
  }
  private java.sql.Timestamp ModifiedDate;
  public java.sql.Timestamp get_ModifiedDate() {
    return ModifiedDate;
  }
  public void set_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
  }
  public salesorderdetail with_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof salesorderdetail)) {
      return false;
    }
    salesorderdetail that = (salesorderdetail) o;
    boolean equal = true;
    equal = equal && (this.SalesOrderID == null ? that.SalesOrderID == null : this.SalesOrderID.equals(that.SalesOrderID));
    equal = equal && (this.SalesOrderDetailID == null ? that.SalesOrderDetailID == null : this.SalesOrderDetailID.equals(that.SalesOrderDetailID));
    equal = equal && (this.CarrierTrackingNumber == null ? that.CarrierTrackingNumber == null : this.CarrierTrackingNumber.equals(that.CarrierTrackingNumber));
    equal = equal && (this.OrderQty == null ? that.OrderQty == null : this.OrderQty.equals(that.OrderQty));
    equal = equal && (this.ProductID == null ? that.ProductID == null : this.ProductID.equals(that.ProductID));
    equal = equal && (this.SpecialOfferID == null ? that.SpecialOfferID == null : this.SpecialOfferID.equals(that.SpecialOfferID));
    equal = equal && (this.UnitPrice == null ? that.UnitPrice == null : this.UnitPrice.equals(that.UnitPrice));
    equal = equal && (this.UnitPriceDiscount == null ? that.UnitPriceDiscount == null : this.UnitPriceDiscount.equals(that.UnitPriceDiscount));
    equal = equal && (this.LineTotal == null ? that.LineTotal == null : this.LineTotal.equals(that.LineTotal));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof salesorderdetail)) {
      return false;
    }
    salesorderdetail that = (salesorderdetail) o;
    boolean equal = true;
    equal = equal && (this.SalesOrderID == null ? that.SalesOrderID == null : this.SalesOrderID.equals(that.SalesOrderID));
    equal = equal && (this.SalesOrderDetailID == null ? that.SalesOrderDetailID == null : this.SalesOrderDetailID.equals(that.SalesOrderDetailID));
    equal = equal && (this.CarrierTrackingNumber == null ? that.CarrierTrackingNumber == null : this.CarrierTrackingNumber.equals(that.CarrierTrackingNumber));
    equal = equal && (this.OrderQty == null ? that.OrderQty == null : this.OrderQty.equals(that.OrderQty));
    equal = equal && (this.ProductID == null ? that.ProductID == null : this.ProductID.equals(that.ProductID));
    equal = equal && (this.SpecialOfferID == null ? that.SpecialOfferID == null : this.SpecialOfferID.equals(that.SpecialOfferID));
    equal = equal && (this.UnitPrice == null ? that.UnitPrice == null : this.UnitPrice.equals(that.UnitPrice));
    equal = equal && (this.UnitPriceDiscount == null ? that.UnitPriceDiscount == null : this.UnitPriceDiscount.equals(that.UnitPriceDiscount));
    equal = equal && (this.LineTotal == null ? that.LineTotal == null : this.LineTotal.equals(that.LineTotal));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.SalesOrderID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.SalesOrderDetailID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.CarrierTrackingNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.OrderQty = JdbcWritableBridge.readInteger(4, __dbResults);
    this.ProductID = JdbcWritableBridge.readInteger(5, __dbResults);
    this.SpecialOfferID = JdbcWritableBridge.readInteger(6, __dbResults);
    this.UnitPrice = JdbcWritableBridge.readDouble(7, __dbResults);
    this.UnitPriceDiscount = JdbcWritableBridge.readDouble(8, __dbResults);
    this.LineTotal = JdbcWritableBridge.readDouble(9, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(10, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.SalesOrderID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.SalesOrderDetailID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.CarrierTrackingNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.OrderQty = JdbcWritableBridge.readInteger(4, __dbResults);
    this.ProductID = JdbcWritableBridge.readInteger(5, __dbResults);
    this.SpecialOfferID = JdbcWritableBridge.readInteger(6, __dbResults);
    this.UnitPrice = JdbcWritableBridge.readDouble(7, __dbResults);
    this.UnitPriceDiscount = JdbcWritableBridge.readDouble(8, __dbResults);
    this.LineTotal = JdbcWritableBridge.readDouble(9, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(10, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(SalesOrderID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesOrderDetailID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CarrierTrackingNumber, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(OrderQty, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductID, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SpecialOfferID, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPrice, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPriceDiscount, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(LineTotal, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 10 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(SalesOrderID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesOrderDetailID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CarrierTrackingNumber, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(OrderQty, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductID, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SpecialOfferID, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPrice, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPriceDiscount, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(LineTotal, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 10 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 11 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.SalesOrderID = null;
    } else {
    this.SalesOrderID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SalesOrderDetailID = null;
    } else {
    this.SalesOrderDetailID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CarrierTrackingNumber = null;
    } else {
    this.CarrierTrackingNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OrderQty = null;
    } else {
    this.OrderQty = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductID = null;
    } else {
    this.ProductID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SpecialOfferID = null;
    } else {
    this.SpecialOfferID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.UnitPrice = null;
    } else {
    this.UnitPrice = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.UnitPriceDiscount = null;
    } else {
    this.UnitPriceDiscount = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.LineTotal = null;
    } else {
    this.LineTotal = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.rowguid = null;
    } else {
    this.rowguid = new BytesWritable();
    this.rowguid.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ModifiedDate = null;
    } else {
    this.ModifiedDate = new Timestamp(__dataIn.readLong());
    this.ModifiedDate.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.SalesOrderID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesOrderID);
    }
    if (null == this.SalesOrderDetailID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesOrderDetailID);
    }
    if (null == this.CarrierTrackingNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarrierTrackingNumber);
    }
    if (null == this.OrderQty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OrderQty);
    }
    if (null == this.ProductID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductID);
    }
    if (null == this.SpecialOfferID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SpecialOfferID);
    }
    if (null == this.UnitPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPrice);
    }
    if (null == this.UnitPriceDiscount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPriceDiscount);
    }
    if (null == this.LineTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.LineTotal);
    }
    if (null == this.rowguid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.rowguid.write(__dataOut);
    }
    if (null == this.ModifiedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ModifiedDate.getTime());
    __dataOut.writeInt(this.ModifiedDate.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.SalesOrderID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesOrderID);
    }
    if (null == this.SalesOrderDetailID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesOrderDetailID);
    }
    if (null == this.CarrierTrackingNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarrierTrackingNumber);
    }
    if (null == this.OrderQty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OrderQty);
    }
    if (null == this.ProductID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductID);
    }
    if (null == this.SpecialOfferID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SpecialOfferID);
    }
    if (null == this.UnitPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPrice);
    }
    if (null == this.UnitPriceDiscount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPriceDiscount);
    }
    if (null == this.LineTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.LineTotal);
    }
    if (null == this.rowguid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.rowguid.write(__dataOut);
    }
    if (null == this.ModifiedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ModifiedDate.getTime());
    __dataOut.writeInt(this.ModifiedDate.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderID==null?"null":"" + SalesOrderID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderDetailID==null?"null":"" + SalesOrderDetailID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarrierTrackingNumber==null?"null":CarrierTrackingNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderQty==null?"null":"" + OrderQty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductID==null?"null":"" + ProductID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpecialOfferID==null?"null":"" + SpecialOfferID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPrice==null?"null":"" + UnitPrice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPriceDiscount==null?"null":"" + UnitPriceDiscount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LineTotal==null?"null":"" + LineTotal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rowguid==null?"null":"" + rowguid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ModifiedDate==null?"null":"" + ModifiedDate, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderID==null?"null":"" + SalesOrderID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderDetailID==null?"null":"" + SalesOrderDetailID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarrierTrackingNumber==null?"null":CarrierTrackingNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderQty==null?"null":"" + OrderQty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductID==null?"null":"" + ProductID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpecialOfferID==null?"null":"" + SpecialOfferID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPrice==null?"null":"" + UnitPrice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPriceDiscount==null?"null":"" + UnitPriceDiscount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LineTotal==null?"null":"" + LineTotal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rowguid==null?"null":"" + rowguid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ModifiedDate==null?"null":"" + ModifiedDate, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesOrderID = null; } else {
      this.SalesOrderID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesOrderDetailID = null; } else {
      this.SalesOrderDetailID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CarrierTrackingNumber = null; } else {
      this.CarrierTrackingNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderQty = null; } else {
      this.OrderQty = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductID = null; } else {
      this.ProductID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SpecialOfferID = null; } else {
      this.SpecialOfferID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPrice = null; } else {
      this.UnitPrice = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPriceDiscount = null; } else {
      this.UnitPriceDiscount = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LineTotal = null; } else {
      this.LineTotal = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rowguid = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.rowguid = new BytesWritable(byteVal);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ModifiedDate = null; } else {
      this.ModifiedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesOrderID = null; } else {
      this.SalesOrderID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesOrderDetailID = null; } else {
      this.SalesOrderDetailID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CarrierTrackingNumber = null; } else {
      this.CarrierTrackingNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderQty = null; } else {
      this.OrderQty = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductID = null; } else {
      this.ProductID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SpecialOfferID = null; } else {
      this.SpecialOfferID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPrice = null; } else {
      this.UnitPrice = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPriceDiscount = null; } else {
      this.UnitPriceDiscount = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LineTotal = null; } else {
      this.LineTotal = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rowguid = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.rowguid = new BytesWritable(byteVal);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ModifiedDate = null; } else {
      this.ModifiedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    salesorderdetail o = (salesorderdetail) super.clone();
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
    return o;
  }

  public void clone0(salesorderdetail o) throws CloneNotSupportedException {
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("SalesOrderID", this.SalesOrderID);
    __sqoop$field_map.put("SalesOrderDetailID", this.SalesOrderDetailID);
    __sqoop$field_map.put("CarrierTrackingNumber", this.CarrierTrackingNumber);
    __sqoop$field_map.put("OrderQty", this.OrderQty);
    __sqoop$field_map.put("ProductID", this.ProductID);
    __sqoop$field_map.put("SpecialOfferID", this.SpecialOfferID);
    __sqoop$field_map.put("UnitPrice", this.UnitPrice);
    __sqoop$field_map.put("UnitPriceDiscount", this.UnitPriceDiscount);
    __sqoop$field_map.put("LineTotal", this.LineTotal);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("SalesOrderID", this.SalesOrderID);
    __sqoop$field_map.put("SalesOrderDetailID", this.SalesOrderDetailID);
    __sqoop$field_map.put("CarrierTrackingNumber", this.CarrierTrackingNumber);
    __sqoop$field_map.put("OrderQty", this.OrderQty);
    __sqoop$field_map.put("ProductID", this.ProductID);
    __sqoop$field_map.put("SpecialOfferID", this.SpecialOfferID);
    __sqoop$field_map.put("UnitPrice", this.UnitPrice);
    __sqoop$field_map.put("UnitPriceDiscount", this.UnitPriceDiscount);
    __sqoop$field_map.put("LineTotal", this.LineTotal);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("SalesOrderID".equals(__fieldName)) {
      this.SalesOrderID = (Integer) __fieldVal;
    }
    else    if ("SalesOrderDetailID".equals(__fieldName)) {
      this.SalesOrderDetailID = (Integer) __fieldVal;
    }
    else    if ("CarrierTrackingNumber".equals(__fieldName)) {
      this.CarrierTrackingNumber = (String) __fieldVal;
    }
    else    if ("OrderQty".equals(__fieldName)) {
      this.OrderQty = (Integer) __fieldVal;
    }
    else    if ("ProductID".equals(__fieldName)) {
      this.ProductID = (Integer) __fieldVal;
    }
    else    if ("SpecialOfferID".equals(__fieldName)) {
      this.SpecialOfferID = (Integer) __fieldVal;
    }
    else    if ("UnitPrice".equals(__fieldName)) {
      this.UnitPrice = (Double) __fieldVal;
    }
    else    if ("UnitPriceDiscount".equals(__fieldName)) {
      this.UnitPriceDiscount = (Double) __fieldVal;
    }
    else    if ("LineTotal".equals(__fieldName)) {
      this.LineTotal = (Double) __fieldVal;
    }
    else    if ("rowguid".equals(__fieldName)) {
      this.rowguid = (org.apache.hadoop.io.BytesWritable) __fieldVal;
    }
    else    if ("ModifiedDate".equals(__fieldName)) {
      this.ModifiedDate = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("SalesOrderID".equals(__fieldName)) {
      this.SalesOrderID = (Integer) __fieldVal;
      return true;
    }
    else    if ("SalesOrderDetailID".equals(__fieldName)) {
      this.SalesOrderDetailID = (Integer) __fieldVal;
      return true;
    }
    else    if ("CarrierTrackingNumber".equals(__fieldName)) {
      this.CarrierTrackingNumber = (String) __fieldVal;
      return true;
    }
    else    if ("OrderQty".equals(__fieldName)) {
      this.OrderQty = (Integer) __fieldVal;
      return true;
    }
    else    if ("ProductID".equals(__fieldName)) {
      this.ProductID = (Integer) __fieldVal;
      return true;
    }
    else    if ("SpecialOfferID".equals(__fieldName)) {
      this.SpecialOfferID = (Integer) __fieldVal;
      return true;
    }
    else    if ("UnitPrice".equals(__fieldName)) {
      this.UnitPrice = (Double) __fieldVal;
      return true;
    }
    else    if ("UnitPriceDiscount".equals(__fieldName)) {
      this.UnitPriceDiscount = (Double) __fieldVal;
      return true;
    }
    else    if ("LineTotal".equals(__fieldName)) {
      this.LineTotal = (Double) __fieldVal;
      return true;
    }
    else    if ("rowguid".equals(__fieldName)) {
      this.rowguid = (org.apache.hadoop.io.BytesWritable) __fieldVal;
      return true;
    }
    else    if ("ModifiedDate".equals(__fieldName)) {
      this.ModifiedDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
