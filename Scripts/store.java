// ORM class for table 'store'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 31 19:57:42 PST 2014
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

public class store extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer CustomerID;
  public Integer get_CustomerID() {
    return CustomerID;
  }
  public void set_CustomerID(Integer CustomerID) {
    this.CustomerID = CustomerID;
  }
  public store with_CustomerID(Integer CustomerID) {
    this.CustomerID = CustomerID;
    return this;
  }
  private String Name;
  public String get_Name() {
    return Name;
  }
  public void set_Name(String Name) {
    this.Name = Name;
  }
  public store with_Name(String Name) {
    this.Name = Name;
    return this;
  }
  private Integer SalesPersonID;
  public Integer get_SalesPersonID() {
    return SalesPersonID;
  }
  public void set_SalesPersonID(Integer SalesPersonID) {
    this.SalesPersonID = SalesPersonID;
  }
  public store with_SalesPersonID(Integer SalesPersonID) {
    this.SalesPersonID = SalesPersonID;
    return this;
  }
  private String Demographics;
  public String get_Demographics() {
    return Demographics;
  }
  public void set_Demographics(String Demographics) {
    this.Demographics = Demographics;
  }
  public store with_Demographics(String Demographics) {
    this.Demographics = Demographics;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable rowguid;
  public org.apache.hadoop.io.BytesWritable get_rowguid() {
    return rowguid;
  }
  public void set_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
    this.rowguid = rowguid;
  }
  public store with_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
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
  public store with_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof store)) {
      return false;
    }
    store that = (store) o;
    boolean equal = true;
    equal = equal && (this.CustomerID == null ? that.CustomerID == null : this.CustomerID.equals(that.CustomerID));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.SalesPersonID == null ? that.SalesPersonID == null : this.SalesPersonID.equals(that.SalesPersonID));
    equal = equal && (this.Demographics == null ? that.Demographics == null : this.Demographics.equals(that.Demographics));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof store)) {
      return false;
    }
    store that = (store) o;
    boolean equal = true;
    equal = equal && (this.CustomerID == null ? that.CustomerID == null : this.CustomerID.equals(that.CustomerID));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.SalesPersonID == null ? that.SalesPersonID == null : this.SalesPersonID.equals(that.SalesPersonID));
    equal = equal && (this.Demographics == null ? that.Demographics == null : this.Demographics.equals(that.Demographics));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CustomerID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Name = JdbcWritableBridge.readString(2, __dbResults);
    this.SalesPersonID = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Demographics = JdbcWritableBridge.readString(4, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(5, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CustomerID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Name = JdbcWritableBridge.readString(2, __dbResults);
    this.SalesPersonID = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Demographics = JdbcWritableBridge.readString(4, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(5, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
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
    JdbcWritableBridge.writeInteger(CustomerID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesPersonID, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Demographics, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 5 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 6 + __off, 93, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(CustomerID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesPersonID, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Demographics, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 5 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 6 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CustomerID = null;
    } else {
    this.CustomerID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Name = null;
    } else {
    this.Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SalesPersonID = null;
    } else {
    this.SalesPersonID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Demographics = null;
    } else {
    this.Demographics = Text.readString(__dataIn);
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
    if (null == this.CustomerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CustomerID);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.SalesPersonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesPersonID);
    }
    if (null == this.Demographics) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Demographics);
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
    if (null == this.CustomerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CustomerID);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.SalesPersonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesPersonID);
    }
    if (null == this.Demographics) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Demographics);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerID==null?"null":"" + CustomerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesPersonID==null?"null":"" + SalesPersonID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Demographics==null?"null":Demographics, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerID==null?"null":"" + CustomerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesPersonID==null?"null":"" + SalesPersonID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Demographics==null?"null":Demographics, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CustomerID = null; } else {
      this.CustomerID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesPersonID = null; } else {
      this.SalesPersonID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Demographics = null; } else {
      this.Demographics = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CustomerID = null; } else {
      this.CustomerID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesPersonID = null; } else {
      this.SalesPersonID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Demographics = null; } else {
      this.Demographics = __cur_str;
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
    store o = (store) super.clone();
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
    return o;
  }

  public void clone0(store o) throws CloneNotSupportedException {
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CustomerID", this.CustomerID);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("SalesPersonID", this.SalesPersonID);
    __sqoop$field_map.put("Demographics", this.Demographics);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CustomerID", this.CustomerID);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("SalesPersonID", this.SalesPersonID);
    __sqoop$field_map.put("Demographics", this.Demographics);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CustomerID".equals(__fieldName)) {
      this.CustomerID = (Integer) __fieldVal;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
    }
    else    if ("SalesPersonID".equals(__fieldName)) {
      this.SalesPersonID = (Integer) __fieldVal;
    }
    else    if ("Demographics".equals(__fieldName)) {
      this.Demographics = (String) __fieldVal;
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
    if ("CustomerID".equals(__fieldName)) {
      this.CustomerID = (Integer) __fieldVal;
      return true;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
      return true;
    }
    else    if ("SalesPersonID".equals(__fieldName)) {
      this.SalesPersonID = (Integer) __fieldVal;
      return true;
    }
    else    if ("Demographics".equals(__fieldName)) {
      this.Demographics = (String) __fieldVal;
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
