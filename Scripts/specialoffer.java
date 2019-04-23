// ORM class for table 'specialoffer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 31 20:34:40 PST 2014
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

public class specialoffer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer SpecialOfferID;
  public Integer get_SpecialOfferID() {
    return SpecialOfferID;
  }
  public void set_SpecialOfferID(Integer SpecialOfferID) {
    this.SpecialOfferID = SpecialOfferID;
  }
  public specialoffer with_SpecialOfferID(Integer SpecialOfferID) {
    this.SpecialOfferID = SpecialOfferID;
    return this;
  }
  private String Description;
  public String get_Description() {
    return Description;
  }
  public void set_Description(String Description) {
    this.Description = Description;
  }
  public specialoffer with_Description(String Description) {
    this.Description = Description;
    return this;
  }
  private Double DiscountPct;
  public Double get_DiscountPct() {
    return DiscountPct;
  }
  public void set_DiscountPct(Double DiscountPct) {
    this.DiscountPct = DiscountPct;
  }
  public specialoffer with_DiscountPct(Double DiscountPct) {
    this.DiscountPct = DiscountPct;
    return this;
  }
  private String Type;
  public String get_Type() {
    return Type;
  }
  public void set_Type(String Type) {
    this.Type = Type;
  }
  public specialoffer with_Type(String Type) {
    this.Type = Type;
    return this;
  }
  private String Category;
  public String get_Category() {
    return Category;
  }
  public void set_Category(String Category) {
    this.Category = Category;
  }
  public specialoffer with_Category(String Category) {
    this.Category = Category;
    return this;
  }
  private java.sql.Timestamp StartDate;
  public java.sql.Timestamp get_StartDate() {
    return StartDate;
  }
  public void set_StartDate(java.sql.Timestamp StartDate) {
    this.StartDate = StartDate;
  }
  public specialoffer with_StartDate(java.sql.Timestamp StartDate) {
    this.StartDate = StartDate;
    return this;
  }
  private java.sql.Timestamp EndDate;
  public java.sql.Timestamp get_EndDate() {
    return EndDate;
  }
  public void set_EndDate(java.sql.Timestamp EndDate) {
    this.EndDate = EndDate;
  }
  public specialoffer with_EndDate(java.sql.Timestamp EndDate) {
    this.EndDate = EndDate;
    return this;
  }
  private Integer MinQty;
  public Integer get_MinQty() {
    return MinQty;
  }
  public void set_MinQty(Integer MinQty) {
    this.MinQty = MinQty;
  }
  public specialoffer with_MinQty(Integer MinQty) {
    this.MinQty = MinQty;
    return this;
  }
  private Integer MaxQty;
  public Integer get_MaxQty() {
    return MaxQty;
  }
  public void set_MaxQty(Integer MaxQty) {
    this.MaxQty = MaxQty;
  }
  public specialoffer with_MaxQty(Integer MaxQty) {
    this.MaxQty = MaxQty;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable rowguid;
  public org.apache.hadoop.io.BytesWritable get_rowguid() {
    return rowguid;
  }
  public void set_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
    this.rowguid = rowguid;
  }
  public specialoffer with_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
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
  public specialoffer with_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof specialoffer)) {
      return false;
    }
    specialoffer that = (specialoffer) o;
    boolean equal = true;
    equal = equal && (this.SpecialOfferID == null ? that.SpecialOfferID == null : this.SpecialOfferID.equals(that.SpecialOfferID));
    equal = equal && (this.Description == null ? that.Description == null : this.Description.equals(that.Description));
    equal = equal && (this.DiscountPct == null ? that.DiscountPct == null : this.DiscountPct.equals(that.DiscountPct));
    equal = equal && (this.Type == null ? that.Type == null : this.Type.equals(that.Type));
    equal = equal && (this.Category == null ? that.Category == null : this.Category.equals(that.Category));
    equal = equal && (this.StartDate == null ? that.StartDate == null : this.StartDate.equals(that.StartDate));
    equal = equal && (this.EndDate == null ? that.EndDate == null : this.EndDate.equals(that.EndDate));
    equal = equal && (this.MinQty == null ? that.MinQty == null : this.MinQty.equals(that.MinQty));
    equal = equal && (this.MaxQty == null ? that.MaxQty == null : this.MaxQty.equals(that.MaxQty));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof specialoffer)) {
      return false;
    }
    specialoffer that = (specialoffer) o;
    boolean equal = true;
    equal = equal && (this.SpecialOfferID == null ? that.SpecialOfferID == null : this.SpecialOfferID.equals(that.SpecialOfferID));
    equal = equal && (this.Description == null ? that.Description == null : this.Description.equals(that.Description));
    equal = equal && (this.DiscountPct == null ? that.DiscountPct == null : this.DiscountPct.equals(that.DiscountPct));
    equal = equal && (this.Type == null ? that.Type == null : this.Type.equals(that.Type));
    equal = equal && (this.Category == null ? that.Category == null : this.Category.equals(that.Category));
    equal = equal && (this.StartDate == null ? that.StartDate == null : this.StartDate.equals(that.StartDate));
    equal = equal && (this.EndDate == null ? that.EndDate == null : this.EndDate.equals(that.EndDate));
    equal = equal && (this.MinQty == null ? that.MinQty == null : this.MinQty.equals(that.MinQty));
    equal = equal && (this.MaxQty == null ? that.MaxQty == null : this.MaxQty.equals(that.MaxQty));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.SpecialOfferID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Description = JdbcWritableBridge.readString(2, __dbResults);
    this.DiscountPct = JdbcWritableBridge.readDouble(3, __dbResults);
    this.Type = JdbcWritableBridge.readString(4, __dbResults);
    this.Category = JdbcWritableBridge.readString(5, __dbResults);
    this.StartDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.EndDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.MinQty = JdbcWritableBridge.readInteger(8, __dbResults);
    this.MaxQty = JdbcWritableBridge.readInteger(9, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(10, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.SpecialOfferID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Description = JdbcWritableBridge.readString(2, __dbResults);
    this.DiscountPct = JdbcWritableBridge.readDouble(3, __dbResults);
    this.Type = JdbcWritableBridge.readString(4, __dbResults);
    this.Category = JdbcWritableBridge.readString(5, __dbResults);
    this.StartDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.EndDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.MinQty = JdbcWritableBridge.readInteger(8, __dbResults);
    this.MaxQty = JdbcWritableBridge.readInteger(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(SpecialOfferID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Description, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(DiscountPct, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Type, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Category, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(StartDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EndDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(MinQty, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(MaxQty, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 10 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(SpecialOfferID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Description, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(DiscountPct, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Type, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Category, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(StartDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EndDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(MinQty, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(MaxQty, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 10 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 11 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.SpecialOfferID = null;
    } else {
    this.SpecialOfferID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Description = null;
    } else {
    this.Description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DiscountPct = null;
    } else {
    this.DiscountPct = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Type = null;
    } else {
    this.Type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Category = null;
    } else {
    this.Category = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.StartDate = null;
    } else {
    this.StartDate = new Timestamp(__dataIn.readLong());
    this.StartDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EndDate = null;
    } else {
    this.EndDate = new Timestamp(__dataIn.readLong());
    this.EndDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.MinQty = null;
    } else {
    this.MinQty = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.MaxQty = null;
    } else {
    this.MaxQty = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.SpecialOfferID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SpecialOfferID);
    }
    if (null == this.Description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Description);
    }
    if (null == this.DiscountPct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.DiscountPct);
    }
    if (null == this.Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Type);
    }
    if (null == this.Category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Category);
    }
    if (null == this.StartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.StartDate.getTime());
    __dataOut.writeInt(this.StartDate.getNanos());
    }
    if (null == this.EndDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EndDate.getTime());
    __dataOut.writeInt(this.EndDate.getNanos());
    }
    if (null == this.MinQty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.MinQty);
    }
    if (null == this.MaxQty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.MaxQty);
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
    if (null == this.SpecialOfferID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SpecialOfferID);
    }
    if (null == this.Description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Description);
    }
    if (null == this.DiscountPct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.DiscountPct);
    }
    if (null == this.Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Type);
    }
    if (null == this.Category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Category);
    }
    if (null == this.StartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.StartDate.getTime());
    __dataOut.writeInt(this.StartDate.getNanos());
    }
    if (null == this.EndDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EndDate.getTime());
    __dataOut.writeInt(this.EndDate.getNanos());
    }
    if (null == this.MinQty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.MinQty);
    }
    if (null == this.MaxQty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.MaxQty);
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
    __sb.append(FieldFormatter.escapeAndEnclose(SpecialOfferID==null?"null":"" + SpecialOfferID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Description==null?"null":Description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DiscountPct==null?"null":"" + DiscountPct, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Type==null?"null":Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Category==null?"null":Category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StartDate==null?"null":"" + StartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EndDate==null?"null":"" + EndDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MinQty==null?"null":"" + MinQty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MaxQty==null?"null":"" + MaxQty, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(SpecialOfferID==null?"null":"" + SpecialOfferID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Description==null?"null":Description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DiscountPct==null?"null":"" + DiscountPct, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Type==null?"null":Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Category==null?"null":Category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StartDate==null?"null":"" + StartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EndDate==null?"null":"" + EndDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MinQty==null?"null":"" + MinQty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MaxQty==null?"null":"" + MaxQty, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SpecialOfferID = null; } else {
      this.SpecialOfferID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Description = null; } else {
      this.Description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DiscountPct = null; } else {
      this.DiscountPct = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Type = null; } else {
      this.Type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Category = null; } else {
      this.Category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StartDate = null; } else {
      this.StartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EndDate = null; } else {
      this.EndDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MinQty = null; } else {
      this.MinQty = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MaxQty = null; } else {
      this.MaxQty = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SpecialOfferID = null; } else {
      this.SpecialOfferID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Description = null; } else {
      this.Description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DiscountPct = null; } else {
      this.DiscountPct = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Type = null; } else {
      this.Type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Category = null; } else {
      this.Category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StartDate = null; } else {
      this.StartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EndDate = null; } else {
      this.EndDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MinQty = null; } else {
      this.MinQty = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MaxQty = null; } else {
      this.MaxQty = Integer.valueOf(__cur_str);
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
    specialoffer o = (specialoffer) super.clone();
    o.StartDate = (o.StartDate != null) ? (java.sql.Timestamp) o.StartDate.clone() : null;
    o.EndDate = (o.EndDate != null) ? (java.sql.Timestamp) o.EndDate.clone() : null;
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
    return o;
  }

  public void clone0(specialoffer o) throws CloneNotSupportedException {
    o.StartDate = (o.StartDate != null) ? (java.sql.Timestamp) o.StartDate.clone() : null;
    o.EndDate = (o.EndDate != null) ? (java.sql.Timestamp) o.EndDate.clone() : null;
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("SpecialOfferID", this.SpecialOfferID);
    __sqoop$field_map.put("Description", this.Description);
    __sqoop$field_map.put("DiscountPct", this.DiscountPct);
    __sqoop$field_map.put("Type", this.Type);
    __sqoop$field_map.put("Category", this.Category);
    __sqoop$field_map.put("StartDate", this.StartDate);
    __sqoop$field_map.put("EndDate", this.EndDate);
    __sqoop$field_map.put("MinQty", this.MinQty);
    __sqoop$field_map.put("MaxQty", this.MaxQty);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("SpecialOfferID", this.SpecialOfferID);
    __sqoop$field_map.put("Description", this.Description);
    __sqoop$field_map.put("DiscountPct", this.DiscountPct);
    __sqoop$field_map.put("Type", this.Type);
    __sqoop$field_map.put("Category", this.Category);
    __sqoop$field_map.put("StartDate", this.StartDate);
    __sqoop$field_map.put("EndDate", this.EndDate);
    __sqoop$field_map.put("MinQty", this.MinQty);
    __sqoop$field_map.put("MaxQty", this.MaxQty);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("SpecialOfferID".equals(__fieldName)) {
      this.SpecialOfferID = (Integer) __fieldVal;
    }
    else    if ("Description".equals(__fieldName)) {
      this.Description = (String) __fieldVal;
    }
    else    if ("DiscountPct".equals(__fieldName)) {
      this.DiscountPct = (Double) __fieldVal;
    }
    else    if ("Type".equals(__fieldName)) {
      this.Type = (String) __fieldVal;
    }
    else    if ("Category".equals(__fieldName)) {
      this.Category = (String) __fieldVal;
    }
    else    if ("StartDate".equals(__fieldName)) {
      this.StartDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("EndDate".equals(__fieldName)) {
      this.EndDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("MinQty".equals(__fieldName)) {
      this.MinQty = (Integer) __fieldVal;
    }
    else    if ("MaxQty".equals(__fieldName)) {
      this.MaxQty = (Integer) __fieldVal;
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
    if ("SpecialOfferID".equals(__fieldName)) {
      this.SpecialOfferID = (Integer) __fieldVal;
      return true;
    }
    else    if ("Description".equals(__fieldName)) {
      this.Description = (String) __fieldVal;
      return true;
    }
    else    if ("DiscountPct".equals(__fieldName)) {
      this.DiscountPct = (Double) __fieldVal;
      return true;
    }
    else    if ("Type".equals(__fieldName)) {
      this.Type = (String) __fieldVal;
      return true;
    }
    else    if ("Category".equals(__fieldName)) {
      this.Category = (String) __fieldVal;
      return true;
    }
    else    if ("StartDate".equals(__fieldName)) {
      this.StartDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("EndDate".equals(__fieldName)) {
      this.EndDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("MinQty".equals(__fieldName)) {
      this.MinQty = (Integer) __fieldVal;
      return true;
    }
    else    if ("MaxQty".equals(__fieldName)) {
      this.MaxQty = (Integer) __fieldVal;
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
