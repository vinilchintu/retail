// ORM class for table 'salesperson'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 31 16:56:19 PST 2014
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

public class salesperson extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer SalesPersonID;
  public Integer get_SalesPersonID() {
    return SalesPersonID;
  }
  public void set_SalesPersonID(Integer SalesPersonID) {
    this.SalesPersonID = SalesPersonID;
  }
  public salesperson with_SalesPersonID(Integer SalesPersonID) {
    this.SalesPersonID = SalesPersonID;
    return this;
  }
  private Integer TerritoryID;
  public Integer get_TerritoryID() {
    return TerritoryID;
  }
  public void set_TerritoryID(Integer TerritoryID) {
    this.TerritoryID = TerritoryID;
  }
  public salesperson with_TerritoryID(Integer TerritoryID) {
    this.TerritoryID = TerritoryID;
    return this;
  }
  private Double SalesQuota;
  public Double get_SalesQuota() {
    return SalesQuota;
  }
  public void set_SalesQuota(Double SalesQuota) {
    this.SalesQuota = SalesQuota;
  }
  public salesperson with_SalesQuota(Double SalesQuota) {
    this.SalesQuota = SalesQuota;
    return this;
  }
  private Double Bonus;
  public Double get_Bonus() {
    return Bonus;
  }
  public void set_Bonus(Double Bonus) {
    this.Bonus = Bonus;
  }
  public salesperson with_Bonus(Double Bonus) {
    this.Bonus = Bonus;
    return this;
  }
  private Double CommissionPct;
  public Double get_CommissionPct() {
    return CommissionPct;
  }
  public void set_CommissionPct(Double CommissionPct) {
    this.CommissionPct = CommissionPct;
  }
  public salesperson with_CommissionPct(Double CommissionPct) {
    this.CommissionPct = CommissionPct;
    return this;
  }
  private Double SalesYTD;
  public Double get_SalesYTD() {
    return SalesYTD;
  }
  public void set_SalesYTD(Double SalesYTD) {
    this.SalesYTD = SalesYTD;
  }
  public salesperson with_SalesYTD(Double SalesYTD) {
    this.SalesYTD = SalesYTD;
    return this;
  }
  private Double SalesLastYear;
  public Double get_SalesLastYear() {
    return SalesLastYear;
  }
  public void set_SalesLastYear(Double SalesLastYear) {
    this.SalesLastYear = SalesLastYear;
  }
  public salesperson with_SalesLastYear(Double SalesLastYear) {
    this.SalesLastYear = SalesLastYear;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable rowguid;
  public org.apache.hadoop.io.BytesWritable get_rowguid() {
    return rowguid;
  }
  public void set_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
    this.rowguid = rowguid;
  }
  public salesperson with_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
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
  public salesperson with_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof salesperson)) {
      return false;
    }
    salesperson that = (salesperson) o;
    boolean equal = true;
    equal = equal && (this.SalesPersonID == null ? that.SalesPersonID == null : this.SalesPersonID.equals(that.SalesPersonID));
    equal = equal && (this.TerritoryID == null ? that.TerritoryID == null : this.TerritoryID.equals(that.TerritoryID));
    equal = equal && (this.SalesQuota == null ? that.SalesQuota == null : this.SalesQuota.equals(that.SalesQuota));
    equal = equal && (this.Bonus == null ? that.Bonus == null : this.Bonus.equals(that.Bonus));
    equal = equal && (this.CommissionPct == null ? that.CommissionPct == null : this.CommissionPct.equals(that.CommissionPct));
    equal = equal && (this.SalesYTD == null ? that.SalesYTD == null : this.SalesYTD.equals(that.SalesYTD));
    equal = equal && (this.SalesLastYear == null ? that.SalesLastYear == null : this.SalesLastYear.equals(that.SalesLastYear));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof salesperson)) {
      return false;
    }
    salesperson that = (salesperson) o;
    boolean equal = true;
    equal = equal && (this.SalesPersonID == null ? that.SalesPersonID == null : this.SalesPersonID.equals(that.SalesPersonID));
    equal = equal && (this.TerritoryID == null ? that.TerritoryID == null : this.TerritoryID.equals(that.TerritoryID));
    equal = equal && (this.SalesQuota == null ? that.SalesQuota == null : this.SalesQuota.equals(that.SalesQuota));
    equal = equal && (this.Bonus == null ? that.Bonus == null : this.Bonus.equals(that.Bonus));
    equal = equal && (this.CommissionPct == null ? that.CommissionPct == null : this.CommissionPct.equals(that.CommissionPct));
    equal = equal && (this.SalesYTD == null ? that.SalesYTD == null : this.SalesYTD.equals(that.SalesYTD));
    equal = equal && (this.SalesLastYear == null ? that.SalesLastYear == null : this.SalesLastYear.equals(that.SalesLastYear));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.SalesPersonID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.TerritoryID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.SalesQuota = JdbcWritableBridge.readDouble(3, __dbResults);
    this.Bonus = JdbcWritableBridge.readDouble(4, __dbResults);
    this.CommissionPct = JdbcWritableBridge.readDouble(5, __dbResults);
    this.SalesYTD = JdbcWritableBridge.readDouble(6, __dbResults);
    this.SalesLastYear = JdbcWritableBridge.readDouble(7, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(8, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.SalesPersonID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.TerritoryID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.SalesQuota = JdbcWritableBridge.readDouble(3, __dbResults);
    this.Bonus = JdbcWritableBridge.readDouble(4, __dbResults);
    this.CommissionPct = JdbcWritableBridge.readDouble(5, __dbResults);
    this.SalesYTD = JdbcWritableBridge.readDouble(6, __dbResults);
    this.SalesLastYear = JdbcWritableBridge.readDouble(7, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(8, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(SalesPersonID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TerritoryID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesQuota, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Bonus, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(CommissionPct, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesYTD, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesLastYear, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 8 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(SalesPersonID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TerritoryID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesQuota, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Bonus, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(CommissionPct, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesYTD, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesLastYear, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 8 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.SalesPersonID = null;
    } else {
    this.SalesPersonID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TerritoryID = null;
    } else {
    this.TerritoryID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SalesQuota = null;
    } else {
    this.SalesQuota = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Bonus = null;
    } else {
    this.Bonus = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.CommissionPct = null;
    } else {
    this.CommissionPct = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.SalesYTD = null;
    } else {
    this.SalesYTD = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.SalesLastYear = null;
    } else {
    this.SalesLastYear = Double.valueOf(__dataIn.readDouble());
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
    if (null == this.SalesPersonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesPersonID);
    }
    if (null == this.TerritoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TerritoryID);
    }
    if (null == this.SalesQuota) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.SalesQuota);
    }
    if (null == this.Bonus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Bonus);
    }
    if (null == this.CommissionPct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.CommissionPct);
    }
    if (null == this.SalesYTD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.SalesYTD);
    }
    if (null == this.SalesLastYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.SalesLastYear);
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
    if (null == this.SalesPersonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesPersonID);
    }
    if (null == this.TerritoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TerritoryID);
    }
    if (null == this.SalesQuota) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.SalesQuota);
    }
    if (null == this.Bonus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Bonus);
    }
    if (null == this.CommissionPct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.CommissionPct);
    }
    if (null == this.SalesYTD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.SalesYTD);
    }
    if (null == this.SalesLastYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.SalesLastYear);
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
    __sb.append(FieldFormatter.escapeAndEnclose(SalesPersonID==null?"null":"" + SalesPersonID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TerritoryID==null?"null":"" + TerritoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesQuota==null?"null":"" + SalesQuota, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Bonus==null?"null":"" + Bonus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CommissionPct==null?"null":"" + CommissionPct, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesYTD==null?"null":"" + SalesYTD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesLastYear==null?"null":"" + SalesLastYear, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(SalesPersonID==null?"null":"" + SalesPersonID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TerritoryID==null?"null":"" + TerritoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesQuota==null?"null":"" + SalesQuota, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Bonus==null?"null":"" + Bonus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CommissionPct==null?"null":"" + CommissionPct, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesYTD==null?"null":"" + SalesYTD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesLastYear==null?"null":"" + SalesLastYear, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesPersonID = null; } else {
      this.SalesPersonID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TerritoryID = null; } else {
      this.TerritoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesQuota = null; } else {
      this.SalesQuota = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Bonus = null; } else {
      this.Bonus = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CommissionPct = null; } else {
      this.CommissionPct = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesYTD = null; } else {
      this.SalesYTD = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesLastYear = null; } else {
      this.SalesLastYear = Double.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesPersonID = null; } else {
      this.SalesPersonID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TerritoryID = null; } else {
      this.TerritoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesQuota = null; } else {
      this.SalesQuota = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Bonus = null; } else {
      this.Bonus = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CommissionPct = null; } else {
      this.CommissionPct = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesYTD = null; } else {
      this.SalesYTD = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesLastYear = null; } else {
      this.SalesLastYear = Double.valueOf(__cur_str);
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
    salesperson o = (salesperson) super.clone();
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
    return o;
  }

  public void clone0(salesperson o) throws CloneNotSupportedException {
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("SalesPersonID", this.SalesPersonID);
    __sqoop$field_map.put("TerritoryID", this.TerritoryID);
    __sqoop$field_map.put("SalesQuota", this.SalesQuota);
    __sqoop$field_map.put("Bonus", this.Bonus);
    __sqoop$field_map.put("CommissionPct", this.CommissionPct);
    __sqoop$field_map.put("SalesYTD", this.SalesYTD);
    __sqoop$field_map.put("SalesLastYear", this.SalesLastYear);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("SalesPersonID", this.SalesPersonID);
    __sqoop$field_map.put("TerritoryID", this.TerritoryID);
    __sqoop$field_map.put("SalesQuota", this.SalesQuota);
    __sqoop$field_map.put("Bonus", this.Bonus);
    __sqoop$field_map.put("CommissionPct", this.CommissionPct);
    __sqoop$field_map.put("SalesYTD", this.SalesYTD);
    __sqoop$field_map.put("SalesLastYear", this.SalesLastYear);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("SalesPersonID".equals(__fieldName)) {
      this.SalesPersonID = (Integer) __fieldVal;
    }
    else    if ("TerritoryID".equals(__fieldName)) {
      this.TerritoryID = (Integer) __fieldVal;
    }
    else    if ("SalesQuota".equals(__fieldName)) {
      this.SalesQuota = (Double) __fieldVal;
    }
    else    if ("Bonus".equals(__fieldName)) {
      this.Bonus = (Double) __fieldVal;
    }
    else    if ("CommissionPct".equals(__fieldName)) {
      this.CommissionPct = (Double) __fieldVal;
    }
    else    if ("SalesYTD".equals(__fieldName)) {
      this.SalesYTD = (Double) __fieldVal;
    }
    else    if ("SalesLastYear".equals(__fieldName)) {
      this.SalesLastYear = (Double) __fieldVal;
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
    if ("SalesPersonID".equals(__fieldName)) {
      this.SalesPersonID = (Integer) __fieldVal;
      return true;
    }
    else    if ("TerritoryID".equals(__fieldName)) {
      this.TerritoryID = (Integer) __fieldVal;
      return true;
    }
    else    if ("SalesQuota".equals(__fieldName)) {
      this.SalesQuota = (Double) __fieldVal;
      return true;
    }
    else    if ("Bonus".equals(__fieldName)) {
      this.Bonus = (Double) __fieldVal;
      return true;
    }
    else    if ("CommissionPct".equals(__fieldName)) {
      this.CommissionPct = (Double) __fieldVal;
      return true;
    }
    else    if ("SalesYTD".equals(__fieldName)) {
      this.SalesYTD = (Double) __fieldVal;
      return true;
    }
    else    if ("SalesLastYear".equals(__fieldName)) {
      this.SalesLastYear = (Double) __fieldVal;
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
