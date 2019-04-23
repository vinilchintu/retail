// ORM class for table 'salesterritory'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 31 17:24:01 PST 2014
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

public class salesterritory extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer TerritoryID;
  public Integer get_TerritoryID() {
    return TerritoryID;
  }
  public void set_TerritoryID(Integer TerritoryID) {
    this.TerritoryID = TerritoryID;
  }
  public salesterritory with_TerritoryID(Integer TerritoryID) {
    this.TerritoryID = TerritoryID;
    return this;
  }
  private String Name;
  public String get_Name() {
    return Name;
  }
  public void set_Name(String Name) {
    this.Name = Name;
  }
  public salesterritory with_Name(String Name) {
    this.Name = Name;
    return this;
  }
  private String CountryRegionCode;
  public String get_CountryRegionCode() {
    return CountryRegionCode;
  }
  public void set_CountryRegionCode(String CountryRegionCode) {
    this.CountryRegionCode = CountryRegionCode;
  }
  public salesterritory with_CountryRegionCode(String CountryRegionCode) {
    this.CountryRegionCode = CountryRegionCode;
    return this;
  }
  private String Group;
  public String get_Group() {
    return Group;
  }
  public void set_Group(String Group) {
    this.Group = Group;
  }
  public salesterritory with_Group(String Group) {
    this.Group = Group;
    return this;
  }
  private Double SalesYTD;
  public Double get_SalesYTD() {
    return SalesYTD;
  }
  public void set_SalesYTD(Double SalesYTD) {
    this.SalesYTD = SalesYTD;
  }
  public salesterritory with_SalesYTD(Double SalesYTD) {
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
  public salesterritory with_SalesLastYear(Double SalesLastYear) {
    this.SalesLastYear = SalesLastYear;
    return this;
  }
  private Double CostYTD;
  public Double get_CostYTD() {
    return CostYTD;
  }
  public void set_CostYTD(Double CostYTD) {
    this.CostYTD = CostYTD;
  }
  public salesterritory with_CostYTD(Double CostYTD) {
    this.CostYTD = CostYTD;
    return this;
  }
  private Double CostLastYear;
  public Double get_CostLastYear() {
    return CostLastYear;
  }
  public void set_CostLastYear(Double CostLastYear) {
    this.CostLastYear = CostLastYear;
  }
  public salesterritory with_CostLastYear(Double CostLastYear) {
    this.CostLastYear = CostLastYear;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable rowguid;
  public org.apache.hadoop.io.BytesWritable get_rowguid() {
    return rowguid;
  }
  public void set_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
    this.rowguid = rowguid;
  }
  public salesterritory with_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
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
  public salesterritory with_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof salesterritory)) {
      return false;
    }
    salesterritory that = (salesterritory) o;
    boolean equal = true;
    equal = equal && (this.TerritoryID == null ? that.TerritoryID == null : this.TerritoryID.equals(that.TerritoryID));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.CountryRegionCode == null ? that.CountryRegionCode == null : this.CountryRegionCode.equals(that.CountryRegionCode));
    equal = equal && (this.Group == null ? that.Group == null : this.Group.equals(that.Group));
    equal = equal && (this.SalesYTD == null ? that.SalesYTD == null : this.SalesYTD.equals(that.SalesYTD));
    equal = equal && (this.SalesLastYear == null ? that.SalesLastYear == null : this.SalesLastYear.equals(that.SalesLastYear));
    equal = equal && (this.CostYTD == null ? that.CostYTD == null : this.CostYTD.equals(that.CostYTD));
    equal = equal && (this.CostLastYear == null ? that.CostLastYear == null : this.CostLastYear.equals(that.CostLastYear));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof salesterritory)) {
      return false;
    }
    salesterritory that = (salesterritory) o;
    boolean equal = true;
    equal = equal && (this.TerritoryID == null ? that.TerritoryID == null : this.TerritoryID.equals(that.TerritoryID));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.CountryRegionCode == null ? that.CountryRegionCode == null : this.CountryRegionCode.equals(that.CountryRegionCode));
    equal = equal && (this.Group == null ? that.Group == null : this.Group.equals(that.Group));
    equal = equal && (this.SalesYTD == null ? that.SalesYTD == null : this.SalesYTD.equals(that.SalesYTD));
    equal = equal && (this.SalesLastYear == null ? that.SalesLastYear == null : this.SalesLastYear.equals(that.SalesLastYear));
    equal = equal && (this.CostYTD == null ? that.CostYTD == null : this.CostYTD.equals(that.CostYTD));
    equal = equal && (this.CostLastYear == null ? that.CostLastYear == null : this.CostLastYear.equals(that.CostLastYear));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.TerritoryID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Name = JdbcWritableBridge.readString(2, __dbResults);
    this.CountryRegionCode = JdbcWritableBridge.readString(3, __dbResults);
    this.Group = JdbcWritableBridge.readString(4, __dbResults);
    this.SalesYTD = JdbcWritableBridge.readDouble(5, __dbResults);
    this.SalesLastYear = JdbcWritableBridge.readDouble(6, __dbResults);
    this.CostYTD = JdbcWritableBridge.readDouble(7, __dbResults);
    this.CostLastYear = JdbcWritableBridge.readDouble(8, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(9, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.TerritoryID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Name = JdbcWritableBridge.readString(2, __dbResults);
    this.CountryRegionCode = JdbcWritableBridge.readString(3, __dbResults);
    this.Group = JdbcWritableBridge.readString(4, __dbResults);
    this.SalesYTD = JdbcWritableBridge.readDouble(5, __dbResults);
    this.SalesLastYear = JdbcWritableBridge.readDouble(6, __dbResults);
    this.CostYTD = JdbcWritableBridge.readDouble(7, __dbResults);
    this.CostLastYear = JdbcWritableBridge.readDouble(8, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(9, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(TerritoryID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CountryRegionCode, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Group, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesYTD, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesLastYear, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(CostYTD, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(CostLastYear, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 9 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 10 + __off, 93, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(TerritoryID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CountryRegionCode, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Group, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesYTD, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(SalesLastYear, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(CostYTD, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(CostLastYear, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 9 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 10 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.TerritoryID = null;
    } else {
    this.TerritoryID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Name = null;
    } else {
    this.Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CountryRegionCode = null;
    } else {
    this.CountryRegionCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Group = null;
    } else {
    this.Group = Text.readString(__dataIn);
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
        this.CostYTD = null;
    } else {
    this.CostYTD = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.CostLastYear = null;
    } else {
    this.CostLastYear = Double.valueOf(__dataIn.readDouble());
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
    if (null == this.TerritoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TerritoryID);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.CountryRegionCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryRegionCode);
    }
    if (null == this.Group) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Group);
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
    if (null == this.CostYTD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.CostYTD);
    }
    if (null == this.CostLastYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.CostLastYear);
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
    if (null == this.TerritoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TerritoryID);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.CountryRegionCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryRegionCode);
    }
    if (null == this.Group) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Group);
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
    if (null == this.CostYTD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.CostYTD);
    }
    if (null == this.CostLastYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.CostLastYear);
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
    __sb.append(FieldFormatter.escapeAndEnclose(TerritoryID==null?"null":"" + TerritoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CountryRegionCode==null?"null":CountryRegionCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Group==null?"null":Group, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesYTD==null?"null":"" + SalesYTD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesLastYear==null?"null":"" + SalesLastYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CostYTD==null?"null":"" + CostYTD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CostLastYear==null?"null":"" + CostLastYear, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(TerritoryID==null?"null":"" + TerritoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CountryRegionCode==null?"null":CountryRegionCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Group==null?"null":Group, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesYTD==null?"null":"" + SalesYTD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesLastYear==null?"null":"" + SalesLastYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CostYTD==null?"null":"" + CostYTD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CostLastYear==null?"null":"" + CostLastYear, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TerritoryID = null; } else {
      this.TerritoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CountryRegionCode = null; } else {
      this.CountryRegionCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Group = null; } else {
      this.Group = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CostYTD = null; } else {
      this.CostYTD = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CostLastYear = null; } else {
      this.CostLastYear = Double.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TerritoryID = null; } else {
      this.TerritoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CountryRegionCode = null; } else {
      this.CountryRegionCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Group = null; } else {
      this.Group = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CostYTD = null; } else {
      this.CostYTD = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CostLastYear = null; } else {
      this.CostLastYear = Double.valueOf(__cur_str);
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
    salesterritory o = (salesterritory) super.clone();
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
    return o;
  }

  public void clone0(salesterritory o) throws CloneNotSupportedException {
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("TerritoryID", this.TerritoryID);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("CountryRegionCode", this.CountryRegionCode);
    __sqoop$field_map.put("Group", this.Group);
    __sqoop$field_map.put("SalesYTD", this.SalesYTD);
    __sqoop$field_map.put("SalesLastYear", this.SalesLastYear);
    __sqoop$field_map.put("CostYTD", this.CostYTD);
    __sqoop$field_map.put("CostLastYear", this.CostLastYear);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("TerritoryID", this.TerritoryID);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("CountryRegionCode", this.CountryRegionCode);
    __sqoop$field_map.put("Group", this.Group);
    __sqoop$field_map.put("SalesYTD", this.SalesYTD);
    __sqoop$field_map.put("SalesLastYear", this.SalesLastYear);
    __sqoop$field_map.put("CostYTD", this.CostYTD);
    __sqoop$field_map.put("CostLastYear", this.CostLastYear);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("TerritoryID".equals(__fieldName)) {
      this.TerritoryID = (Integer) __fieldVal;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
    }
    else    if ("CountryRegionCode".equals(__fieldName)) {
      this.CountryRegionCode = (String) __fieldVal;
    }
    else    if ("Group".equals(__fieldName)) {
      this.Group = (String) __fieldVal;
    }
    else    if ("SalesYTD".equals(__fieldName)) {
      this.SalesYTD = (Double) __fieldVal;
    }
    else    if ("SalesLastYear".equals(__fieldName)) {
      this.SalesLastYear = (Double) __fieldVal;
    }
    else    if ("CostYTD".equals(__fieldName)) {
      this.CostYTD = (Double) __fieldVal;
    }
    else    if ("CostLastYear".equals(__fieldName)) {
      this.CostLastYear = (Double) __fieldVal;
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
    if ("TerritoryID".equals(__fieldName)) {
      this.TerritoryID = (Integer) __fieldVal;
      return true;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
      return true;
    }
    else    if ("CountryRegionCode".equals(__fieldName)) {
      this.CountryRegionCode = (String) __fieldVal;
      return true;
    }
    else    if ("Group".equals(__fieldName)) {
      this.Group = (String) __fieldVal;
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
    else    if ("CostYTD".equals(__fieldName)) {
      this.CostYTD = (Double) __fieldVal;
      return true;
    }
    else    if ("CostLastYear".equals(__fieldName)) {
      this.CostLastYear = (Double) __fieldVal;
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
