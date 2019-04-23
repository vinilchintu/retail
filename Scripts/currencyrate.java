// ORM class for table 'currencyrate'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 31 17:29:34 PST 2014
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

public class currencyrate extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer CurrencyRateID;
  public Integer get_CurrencyRateID() {
    return CurrencyRateID;
  }
  public void set_CurrencyRateID(Integer CurrencyRateID) {
    this.CurrencyRateID = CurrencyRateID;
  }
  public currencyrate with_CurrencyRateID(Integer CurrencyRateID) {
    this.CurrencyRateID = CurrencyRateID;
    return this;
  }
  private java.sql.Timestamp CurrencyRateDate;
  public java.sql.Timestamp get_CurrencyRateDate() {
    return CurrencyRateDate;
  }
  public void set_CurrencyRateDate(java.sql.Timestamp CurrencyRateDate) {
    this.CurrencyRateDate = CurrencyRateDate;
  }
  public currencyrate with_CurrencyRateDate(java.sql.Timestamp CurrencyRateDate) {
    this.CurrencyRateDate = CurrencyRateDate;
    return this;
  }
  private String FromCurrencyCode;
  public String get_FromCurrencyCode() {
    return FromCurrencyCode;
  }
  public void set_FromCurrencyCode(String FromCurrencyCode) {
    this.FromCurrencyCode = FromCurrencyCode;
  }
  public currencyrate with_FromCurrencyCode(String FromCurrencyCode) {
    this.FromCurrencyCode = FromCurrencyCode;
    return this;
  }
  private String ToCurrencyCode;
  public String get_ToCurrencyCode() {
    return ToCurrencyCode;
  }
  public void set_ToCurrencyCode(String ToCurrencyCode) {
    this.ToCurrencyCode = ToCurrencyCode;
  }
  public currencyrate with_ToCurrencyCode(String ToCurrencyCode) {
    this.ToCurrencyCode = ToCurrencyCode;
    return this;
  }
  private Double AverageRate;
  public Double get_AverageRate() {
    return AverageRate;
  }
  public void set_AverageRate(Double AverageRate) {
    this.AverageRate = AverageRate;
  }
  public currencyrate with_AverageRate(Double AverageRate) {
    this.AverageRate = AverageRate;
    return this;
  }
  private Double EndOfDayRate;
  public Double get_EndOfDayRate() {
    return EndOfDayRate;
  }
  public void set_EndOfDayRate(Double EndOfDayRate) {
    this.EndOfDayRate = EndOfDayRate;
  }
  public currencyrate with_EndOfDayRate(Double EndOfDayRate) {
    this.EndOfDayRate = EndOfDayRate;
    return this;
  }
  private java.sql.Timestamp ModifiedDate;
  public java.sql.Timestamp get_ModifiedDate() {
    return ModifiedDate;
  }
  public void set_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
  }
  public currencyrate with_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof currencyrate)) {
      return false;
    }
    currencyrate that = (currencyrate) o;
    boolean equal = true;
    equal = equal && (this.CurrencyRateID == null ? that.CurrencyRateID == null : this.CurrencyRateID.equals(that.CurrencyRateID));
    equal = equal && (this.CurrencyRateDate == null ? that.CurrencyRateDate == null : this.CurrencyRateDate.equals(that.CurrencyRateDate));
    equal = equal && (this.FromCurrencyCode == null ? that.FromCurrencyCode == null : this.FromCurrencyCode.equals(that.FromCurrencyCode));
    equal = equal && (this.ToCurrencyCode == null ? that.ToCurrencyCode == null : this.ToCurrencyCode.equals(that.ToCurrencyCode));
    equal = equal && (this.AverageRate == null ? that.AverageRate == null : this.AverageRate.equals(that.AverageRate));
    equal = equal && (this.EndOfDayRate == null ? that.EndOfDayRate == null : this.EndOfDayRate.equals(that.EndOfDayRate));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof currencyrate)) {
      return false;
    }
    currencyrate that = (currencyrate) o;
    boolean equal = true;
    equal = equal && (this.CurrencyRateID == null ? that.CurrencyRateID == null : this.CurrencyRateID.equals(that.CurrencyRateID));
    equal = equal && (this.CurrencyRateDate == null ? that.CurrencyRateDate == null : this.CurrencyRateDate.equals(that.CurrencyRateDate));
    equal = equal && (this.FromCurrencyCode == null ? that.FromCurrencyCode == null : this.FromCurrencyCode.equals(that.FromCurrencyCode));
    equal = equal && (this.ToCurrencyCode == null ? that.ToCurrencyCode == null : this.ToCurrencyCode.equals(that.ToCurrencyCode));
    equal = equal && (this.AverageRate == null ? that.AverageRate == null : this.AverageRate.equals(that.AverageRate));
    equal = equal && (this.EndOfDayRate == null ? that.EndOfDayRate == null : this.EndOfDayRate.equals(that.EndOfDayRate));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CurrencyRateID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.CurrencyRateDate = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.FromCurrencyCode = JdbcWritableBridge.readString(3, __dbResults);
    this.ToCurrencyCode = JdbcWritableBridge.readString(4, __dbResults);
    this.AverageRate = JdbcWritableBridge.readDouble(5, __dbResults);
    this.EndOfDayRate = JdbcWritableBridge.readDouble(6, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CurrencyRateID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.CurrencyRateDate = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.FromCurrencyCode = JdbcWritableBridge.readString(3, __dbResults);
    this.ToCurrencyCode = JdbcWritableBridge.readString(4, __dbResults);
    this.AverageRate = JdbcWritableBridge.readDouble(5, __dbResults);
    this.EndOfDayRate = JdbcWritableBridge.readDouble(6, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
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
    JdbcWritableBridge.writeInteger(CurrencyRateID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CurrencyRateDate, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FromCurrencyCode, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ToCurrencyCode, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(AverageRate, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(EndOfDayRate, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 7 + __off, 93, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(CurrencyRateID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CurrencyRateDate, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FromCurrencyCode, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ToCurrencyCode, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(AverageRate, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(EndOfDayRate, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 7 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CurrencyRateID = null;
    } else {
    this.CurrencyRateID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CurrencyRateDate = null;
    } else {
    this.CurrencyRateDate = new Timestamp(__dataIn.readLong());
    this.CurrencyRateDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FromCurrencyCode = null;
    } else {
    this.FromCurrencyCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ToCurrencyCode = null;
    } else {
    this.ToCurrencyCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AverageRate = null;
    } else {
    this.AverageRate = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.EndOfDayRate = null;
    } else {
    this.EndOfDayRate = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.ModifiedDate = null;
    } else {
    this.ModifiedDate = new Timestamp(__dataIn.readLong());
    this.ModifiedDate.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CurrencyRateID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CurrencyRateID);
    }
    if (null == this.CurrencyRateDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CurrencyRateDate.getTime());
    __dataOut.writeInt(this.CurrencyRateDate.getNanos());
    }
    if (null == this.FromCurrencyCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FromCurrencyCode);
    }
    if (null == this.ToCurrencyCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ToCurrencyCode);
    }
    if (null == this.AverageRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.AverageRate);
    }
    if (null == this.EndOfDayRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.EndOfDayRate);
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
    if (null == this.CurrencyRateID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CurrencyRateID);
    }
    if (null == this.CurrencyRateDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CurrencyRateDate.getTime());
    __dataOut.writeInt(this.CurrencyRateDate.getNanos());
    }
    if (null == this.FromCurrencyCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FromCurrencyCode);
    }
    if (null == this.ToCurrencyCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ToCurrencyCode);
    }
    if (null == this.AverageRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.AverageRate);
    }
    if (null == this.EndOfDayRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.EndOfDayRate);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyRateID==null?"null":"" + CurrencyRateID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyRateDate==null?"null":"" + CurrencyRateDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FromCurrencyCode==null?"null":FromCurrencyCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ToCurrencyCode==null?"null":ToCurrencyCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AverageRate==null?"null":"" + AverageRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EndOfDayRate==null?"null":"" + EndOfDayRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ModifiedDate==null?"null":"" + ModifiedDate, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyRateID==null?"null":"" + CurrencyRateID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyRateDate==null?"null":"" + CurrencyRateDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FromCurrencyCode==null?"null":FromCurrencyCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ToCurrencyCode==null?"null":ToCurrencyCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AverageRate==null?"null":"" + AverageRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EndOfDayRate==null?"null":"" + EndOfDayRate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyRateID = null; } else {
      this.CurrencyRateID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyRateDate = null; } else {
      this.CurrencyRateDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FromCurrencyCode = null; } else {
      this.FromCurrencyCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ToCurrencyCode = null; } else {
      this.ToCurrencyCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AverageRate = null; } else {
      this.AverageRate = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EndOfDayRate = null; } else {
      this.EndOfDayRate = Double.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyRateID = null; } else {
      this.CurrencyRateID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyRateDate = null; } else {
      this.CurrencyRateDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FromCurrencyCode = null; } else {
      this.FromCurrencyCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ToCurrencyCode = null; } else {
      this.ToCurrencyCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AverageRate = null; } else {
      this.AverageRate = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EndOfDayRate = null; } else {
      this.EndOfDayRate = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ModifiedDate = null; } else {
      this.ModifiedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    currencyrate o = (currencyrate) super.clone();
    o.CurrencyRateDate = (o.CurrencyRateDate != null) ? (java.sql.Timestamp) o.CurrencyRateDate.clone() : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
    return o;
  }

  public void clone0(currencyrate o) throws CloneNotSupportedException {
    o.CurrencyRateDate = (o.CurrencyRateDate != null) ? (java.sql.Timestamp) o.CurrencyRateDate.clone() : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CurrencyRateID", this.CurrencyRateID);
    __sqoop$field_map.put("CurrencyRateDate", this.CurrencyRateDate);
    __sqoop$field_map.put("FromCurrencyCode", this.FromCurrencyCode);
    __sqoop$field_map.put("ToCurrencyCode", this.ToCurrencyCode);
    __sqoop$field_map.put("AverageRate", this.AverageRate);
    __sqoop$field_map.put("EndOfDayRate", this.EndOfDayRate);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CurrencyRateID", this.CurrencyRateID);
    __sqoop$field_map.put("CurrencyRateDate", this.CurrencyRateDate);
    __sqoop$field_map.put("FromCurrencyCode", this.FromCurrencyCode);
    __sqoop$field_map.put("ToCurrencyCode", this.ToCurrencyCode);
    __sqoop$field_map.put("AverageRate", this.AverageRate);
    __sqoop$field_map.put("EndOfDayRate", this.EndOfDayRate);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CurrencyRateID".equals(__fieldName)) {
      this.CurrencyRateID = (Integer) __fieldVal;
    }
    else    if ("CurrencyRateDate".equals(__fieldName)) {
      this.CurrencyRateDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("FromCurrencyCode".equals(__fieldName)) {
      this.FromCurrencyCode = (String) __fieldVal;
    }
    else    if ("ToCurrencyCode".equals(__fieldName)) {
      this.ToCurrencyCode = (String) __fieldVal;
    }
    else    if ("AverageRate".equals(__fieldName)) {
      this.AverageRate = (Double) __fieldVal;
    }
    else    if ("EndOfDayRate".equals(__fieldName)) {
      this.EndOfDayRate = (Double) __fieldVal;
    }
    else    if ("ModifiedDate".equals(__fieldName)) {
      this.ModifiedDate = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("CurrencyRateID".equals(__fieldName)) {
      this.CurrencyRateID = (Integer) __fieldVal;
      return true;
    }
    else    if ("CurrencyRateDate".equals(__fieldName)) {
      this.CurrencyRateDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("FromCurrencyCode".equals(__fieldName)) {
      this.FromCurrencyCode = (String) __fieldVal;
      return true;
    }
    else    if ("ToCurrencyCode".equals(__fieldName)) {
      this.ToCurrencyCode = (String) __fieldVal;
      return true;
    }
    else    if ("AverageRate".equals(__fieldName)) {
      this.AverageRate = (Double) __fieldVal;
      return true;
    }
    else    if ("EndOfDayRate".equals(__fieldName)) {
      this.EndOfDayRate = (Double) __fieldVal;
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
