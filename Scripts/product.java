// ORM class for table 'product'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 31 20:20:16 PST 2014
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

public class product extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer ProductID;
  public Integer get_ProductID() {
    return ProductID;
  }
  public void set_ProductID(Integer ProductID) {
    this.ProductID = ProductID;
  }
  public product with_ProductID(Integer ProductID) {
    this.ProductID = ProductID;
    return this;
  }
  private String Name;
  public String get_Name() {
    return Name;
  }
  public void set_Name(String Name) {
    this.Name = Name;
  }
  public product with_Name(String Name) {
    this.Name = Name;
    return this;
  }
  private String ProductNumber;
  public String get_ProductNumber() {
    return ProductNumber;
  }
  public void set_ProductNumber(String ProductNumber) {
    this.ProductNumber = ProductNumber;
  }
  public product with_ProductNumber(String ProductNumber) {
    this.ProductNumber = ProductNumber;
    return this;
  }
  private Boolean MakeFlag;
  public Boolean get_MakeFlag() {
    return MakeFlag;
  }
  public void set_MakeFlag(Boolean MakeFlag) {
    this.MakeFlag = MakeFlag;
  }
  public product with_MakeFlag(Boolean MakeFlag) {
    this.MakeFlag = MakeFlag;
    return this;
  }
  private Boolean FinishedGoodsFlag;
  public Boolean get_FinishedGoodsFlag() {
    return FinishedGoodsFlag;
  }
  public void set_FinishedGoodsFlag(Boolean FinishedGoodsFlag) {
    this.FinishedGoodsFlag = FinishedGoodsFlag;
  }
  public product with_FinishedGoodsFlag(Boolean FinishedGoodsFlag) {
    this.FinishedGoodsFlag = FinishedGoodsFlag;
    return this;
  }
  private String Color;
  public String get_Color() {
    return Color;
  }
  public void set_Color(String Color) {
    this.Color = Color;
  }
  public product with_Color(String Color) {
    this.Color = Color;
    return this;
  }
  private Integer SafetyStockLevel;
  public Integer get_SafetyStockLevel() {
    return SafetyStockLevel;
  }
  public void set_SafetyStockLevel(Integer SafetyStockLevel) {
    this.SafetyStockLevel = SafetyStockLevel;
  }
  public product with_SafetyStockLevel(Integer SafetyStockLevel) {
    this.SafetyStockLevel = SafetyStockLevel;
    return this;
  }
  private Integer ReorderPoint;
  public Integer get_ReorderPoint() {
    return ReorderPoint;
  }
  public void set_ReorderPoint(Integer ReorderPoint) {
    this.ReorderPoint = ReorderPoint;
  }
  public product with_ReorderPoint(Integer ReorderPoint) {
    this.ReorderPoint = ReorderPoint;
    return this;
  }
  private Double StandardCost;
  public Double get_StandardCost() {
    return StandardCost;
  }
  public void set_StandardCost(Double StandardCost) {
    this.StandardCost = StandardCost;
  }
  public product with_StandardCost(Double StandardCost) {
    this.StandardCost = StandardCost;
    return this;
  }
  private Double ListPrice;
  public Double get_ListPrice() {
    return ListPrice;
  }
  public void set_ListPrice(Double ListPrice) {
    this.ListPrice = ListPrice;
  }
  public product with_ListPrice(Double ListPrice) {
    this.ListPrice = ListPrice;
    return this;
  }
  private String Size;
  public String get_Size() {
    return Size;
  }
  public void set_Size(String Size) {
    this.Size = Size;
  }
  public product with_Size(String Size) {
    this.Size = Size;
    return this;
  }
  private String SizeUnitMeasureCode;
  public String get_SizeUnitMeasureCode() {
    return SizeUnitMeasureCode;
  }
  public void set_SizeUnitMeasureCode(String SizeUnitMeasureCode) {
    this.SizeUnitMeasureCode = SizeUnitMeasureCode;
  }
  public product with_SizeUnitMeasureCode(String SizeUnitMeasureCode) {
    this.SizeUnitMeasureCode = SizeUnitMeasureCode;
    return this;
  }
  private String WeightUnitMeasureCode;
  public String get_WeightUnitMeasureCode() {
    return WeightUnitMeasureCode;
  }
  public void set_WeightUnitMeasureCode(String WeightUnitMeasureCode) {
    this.WeightUnitMeasureCode = WeightUnitMeasureCode;
  }
  public product with_WeightUnitMeasureCode(String WeightUnitMeasureCode) {
    this.WeightUnitMeasureCode = WeightUnitMeasureCode;
    return this;
  }
  private java.math.BigDecimal Weight;
  public java.math.BigDecimal get_Weight() {
    return Weight;
  }
  public void set_Weight(java.math.BigDecimal Weight) {
    this.Weight = Weight;
  }
  public product with_Weight(java.math.BigDecimal Weight) {
    this.Weight = Weight;
    return this;
  }
  private Integer DaysToManufacture;
  public Integer get_DaysToManufacture() {
    return DaysToManufacture;
  }
  public void set_DaysToManufacture(Integer DaysToManufacture) {
    this.DaysToManufacture = DaysToManufacture;
  }
  public product with_DaysToManufacture(Integer DaysToManufacture) {
    this.DaysToManufacture = DaysToManufacture;
    return this;
  }
  private String ProductLine;
  public String get_ProductLine() {
    return ProductLine;
  }
  public void set_ProductLine(String ProductLine) {
    this.ProductLine = ProductLine;
  }
  public product with_ProductLine(String ProductLine) {
    this.ProductLine = ProductLine;
    return this;
  }
  private String Class;
  public String get_Class() {
    return Class;
  }
  public void set_Class(String Class) {
    this.Class = Class;
  }
  public product with_Class(String Class) {
    this.Class = Class;
    return this;
  }
  private String Style;
  public String get_Style() {
    return Style;
  }
  public void set_Style(String Style) {
    this.Style = Style;
  }
  public product with_Style(String Style) {
    this.Style = Style;
    return this;
  }
  private Integer ProductSubcategoryID;
  public Integer get_ProductSubcategoryID() {
    return ProductSubcategoryID;
  }
  public void set_ProductSubcategoryID(Integer ProductSubcategoryID) {
    this.ProductSubcategoryID = ProductSubcategoryID;
  }
  public product with_ProductSubcategoryID(Integer ProductSubcategoryID) {
    this.ProductSubcategoryID = ProductSubcategoryID;
    return this;
  }
  private Integer ProductModelID;
  public Integer get_ProductModelID() {
    return ProductModelID;
  }
  public void set_ProductModelID(Integer ProductModelID) {
    this.ProductModelID = ProductModelID;
  }
  public product with_ProductModelID(Integer ProductModelID) {
    this.ProductModelID = ProductModelID;
    return this;
  }
  private java.sql.Timestamp SellStartDate;
  public java.sql.Timestamp get_SellStartDate() {
    return SellStartDate;
  }
  public void set_SellStartDate(java.sql.Timestamp SellStartDate) {
    this.SellStartDate = SellStartDate;
  }
  public product with_SellStartDate(java.sql.Timestamp SellStartDate) {
    this.SellStartDate = SellStartDate;
    return this;
  }
  private java.sql.Timestamp SellEndDate;
  public java.sql.Timestamp get_SellEndDate() {
    return SellEndDate;
  }
  public void set_SellEndDate(java.sql.Timestamp SellEndDate) {
    this.SellEndDate = SellEndDate;
  }
  public product with_SellEndDate(java.sql.Timestamp SellEndDate) {
    this.SellEndDate = SellEndDate;
    return this;
  }
  private java.sql.Timestamp DiscontinuedDate;
  public java.sql.Timestamp get_DiscontinuedDate() {
    return DiscontinuedDate;
  }
  public void set_DiscontinuedDate(java.sql.Timestamp DiscontinuedDate) {
    this.DiscontinuedDate = DiscontinuedDate;
  }
  public product with_DiscontinuedDate(java.sql.Timestamp DiscontinuedDate) {
    this.DiscontinuedDate = DiscontinuedDate;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable rowguid;
  public org.apache.hadoop.io.BytesWritable get_rowguid() {
    return rowguid;
  }
  public void set_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
    this.rowguid = rowguid;
  }
  public product with_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
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
  public product with_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof product)) {
      return false;
    }
    product that = (product) o;
    boolean equal = true;
    equal = equal && (this.ProductID == null ? that.ProductID == null : this.ProductID.equals(that.ProductID));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.ProductNumber == null ? that.ProductNumber == null : this.ProductNumber.equals(that.ProductNumber));
    equal = equal && (this.MakeFlag == null ? that.MakeFlag == null : this.MakeFlag.equals(that.MakeFlag));
    equal = equal && (this.FinishedGoodsFlag == null ? that.FinishedGoodsFlag == null : this.FinishedGoodsFlag.equals(that.FinishedGoodsFlag));
    equal = equal && (this.Color == null ? that.Color == null : this.Color.equals(that.Color));
    equal = equal && (this.SafetyStockLevel == null ? that.SafetyStockLevel == null : this.SafetyStockLevel.equals(that.SafetyStockLevel));
    equal = equal && (this.ReorderPoint == null ? that.ReorderPoint == null : this.ReorderPoint.equals(that.ReorderPoint));
    equal = equal && (this.StandardCost == null ? that.StandardCost == null : this.StandardCost.equals(that.StandardCost));
    equal = equal && (this.ListPrice == null ? that.ListPrice == null : this.ListPrice.equals(that.ListPrice));
    equal = equal && (this.Size == null ? that.Size == null : this.Size.equals(that.Size));
    equal = equal && (this.SizeUnitMeasureCode == null ? that.SizeUnitMeasureCode == null : this.SizeUnitMeasureCode.equals(that.SizeUnitMeasureCode));
    equal = equal && (this.WeightUnitMeasureCode == null ? that.WeightUnitMeasureCode == null : this.WeightUnitMeasureCode.equals(that.WeightUnitMeasureCode));
    equal = equal && (this.Weight == null ? that.Weight == null : this.Weight.equals(that.Weight));
    equal = equal && (this.DaysToManufacture == null ? that.DaysToManufacture == null : this.DaysToManufacture.equals(that.DaysToManufacture));
    equal = equal && (this.ProductLine == null ? that.ProductLine == null : this.ProductLine.equals(that.ProductLine));
    equal = equal && (this.Class == null ? that.Class == null : this.Class.equals(that.Class));
    equal = equal && (this.Style == null ? that.Style == null : this.Style.equals(that.Style));
    equal = equal && (this.ProductSubcategoryID == null ? that.ProductSubcategoryID == null : this.ProductSubcategoryID.equals(that.ProductSubcategoryID));
    equal = equal && (this.ProductModelID == null ? that.ProductModelID == null : this.ProductModelID.equals(that.ProductModelID));
    equal = equal && (this.SellStartDate == null ? that.SellStartDate == null : this.SellStartDate.equals(that.SellStartDate));
    equal = equal && (this.SellEndDate == null ? that.SellEndDate == null : this.SellEndDate.equals(that.SellEndDate));
    equal = equal && (this.DiscontinuedDate == null ? that.DiscontinuedDate == null : this.DiscontinuedDate.equals(that.DiscontinuedDate));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof product)) {
      return false;
    }
    product that = (product) o;
    boolean equal = true;
    equal = equal && (this.ProductID == null ? that.ProductID == null : this.ProductID.equals(that.ProductID));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.ProductNumber == null ? that.ProductNumber == null : this.ProductNumber.equals(that.ProductNumber));
    equal = equal && (this.MakeFlag == null ? that.MakeFlag == null : this.MakeFlag.equals(that.MakeFlag));
    equal = equal && (this.FinishedGoodsFlag == null ? that.FinishedGoodsFlag == null : this.FinishedGoodsFlag.equals(that.FinishedGoodsFlag));
    equal = equal && (this.Color == null ? that.Color == null : this.Color.equals(that.Color));
    equal = equal && (this.SafetyStockLevel == null ? that.SafetyStockLevel == null : this.SafetyStockLevel.equals(that.SafetyStockLevel));
    equal = equal && (this.ReorderPoint == null ? that.ReorderPoint == null : this.ReorderPoint.equals(that.ReorderPoint));
    equal = equal && (this.StandardCost == null ? that.StandardCost == null : this.StandardCost.equals(that.StandardCost));
    equal = equal && (this.ListPrice == null ? that.ListPrice == null : this.ListPrice.equals(that.ListPrice));
    equal = equal && (this.Size == null ? that.Size == null : this.Size.equals(that.Size));
    equal = equal && (this.SizeUnitMeasureCode == null ? that.SizeUnitMeasureCode == null : this.SizeUnitMeasureCode.equals(that.SizeUnitMeasureCode));
    equal = equal && (this.WeightUnitMeasureCode == null ? that.WeightUnitMeasureCode == null : this.WeightUnitMeasureCode.equals(that.WeightUnitMeasureCode));
    equal = equal && (this.Weight == null ? that.Weight == null : this.Weight.equals(that.Weight));
    equal = equal && (this.DaysToManufacture == null ? that.DaysToManufacture == null : this.DaysToManufacture.equals(that.DaysToManufacture));
    equal = equal && (this.ProductLine == null ? that.ProductLine == null : this.ProductLine.equals(that.ProductLine));
    equal = equal && (this.Class == null ? that.Class == null : this.Class.equals(that.Class));
    equal = equal && (this.Style == null ? that.Style == null : this.Style.equals(that.Style));
    equal = equal && (this.ProductSubcategoryID == null ? that.ProductSubcategoryID == null : this.ProductSubcategoryID.equals(that.ProductSubcategoryID));
    equal = equal && (this.ProductModelID == null ? that.ProductModelID == null : this.ProductModelID.equals(that.ProductModelID));
    equal = equal && (this.SellStartDate == null ? that.SellStartDate == null : this.SellStartDate.equals(that.SellStartDate));
    equal = equal && (this.SellEndDate == null ? that.SellEndDate == null : this.SellEndDate.equals(that.SellEndDate));
    equal = equal && (this.DiscontinuedDate == null ? that.DiscontinuedDate == null : this.DiscontinuedDate.equals(that.DiscontinuedDate));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ProductID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Name = JdbcWritableBridge.readString(2, __dbResults);
    this.ProductNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.MakeFlag = JdbcWritableBridge.readBoolean(4, __dbResults);
    this.FinishedGoodsFlag = JdbcWritableBridge.readBoolean(5, __dbResults);
    this.Color = JdbcWritableBridge.readString(6, __dbResults);
    this.SafetyStockLevel = JdbcWritableBridge.readInteger(7, __dbResults);
    this.ReorderPoint = JdbcWritableBridge.readInteger(8, __dbResults);
    this.StandardCost = JdbcWritableBridge.readDouble(9, __dbResults);
    this.ListPrice = JdbcWritableBridge.readDouble(10, __dbResults);
    this.Size = JdbcWritableBridge.readString(11, __dbResults);
    this.SizeUnitMeasureCode = JdbcWritableBridge.readString(12, __dbResults);
    this.WeightUnitMeasureCode = JdbcWritableBridge.readString(13, __dbResults);
    this.Weight = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DaysToManufacture = JdbcWritableBridge.readInteger(15, __dbResults);
    this.ProductLine = JdbcWritableBridge.readString(16, __dbResults);
    this.Class = JdbcWritableBridge.readString(17, __dbResults);
    this.Style = JdbcWritableBridge.readString(18, __dbResults);
    this.ProductSubcategoryID = JdbcWritableBridge.readInteger(19, __dbResults);
    this.ProductModelID = JdbcWritableBridge.readInteger(20, __dbResults);
    this.SellStartDate = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.SellEndDate = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.DiscontinuedDate = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(24, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(25, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ProductID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Name = JdbcWritableBridge.readString(2, __dbResults);
    this.ProductNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.MakeFlag = JdbcWritableBridge.readBoolean(4, __dbResults);
    this.FinishedGoodsFlag = JdbcWritableBridge.readBoolean(5, __dbResults);
    this.Color = JdbcWritableBridge.readString(6, __dbResults);
    this.SafetyStockLevel = JdbcWritableBridge.readInteger(7, __dbResults);
    this.ReorderPoint = JdbcWritableBridge.readInteger(8, __dbResults);
    this.StandardCost = JdbcWritableBridge.readDouble(9, __dbResults);
    this.ListPrice = JdbcWritableBridge.readDouble(10, __dbResults);
    this.Size = JdbcWritableBridge.readString(11, __dbResults);
    this.SizeUnitMeasureCode = JdbcWritableBridge.readString(12, __dbResults);
    this.WeightUnitMeasureCode = JdbcWritableBridge.readString(13, __dbResults);
    this.Weight = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DaysToManufacture = JdbcWritableBridge.readInteger(15, __dbResults);
    this.ProductLine = JdbcWritableBridge.readString(16, __dbResults);
    this.Class = JdbcWritableBridge.readString(17, __dbResults);
    this.Style = JdbcWritableBridge.readString(18, __dbResults);
    this.ProductSubcategoryID = JdbcWritableBridge.readInteger(19, __dbResults);
    this.ProductModelID = JdbcWritableBridge.readInteger(20, __dbResults);
    this.SellStartDate = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.SellEndDate = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.DiscontinuedDate = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(24, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(25, __dbResults);
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
    JdbcWritableBridge.writeInteger(ProductID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProductNumber, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(MakeFlag, 4 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(FinishedGoodsFlag, 5 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(Color, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SafetyStockLevel, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(ReorderPoint, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeDouble(StandardCost, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(ListPrice, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Size, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SizeUnitMeasureCode, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WeightUnitMeasureCode, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Weight, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(DaysToManufacture, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(ProductLine, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Class, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Style, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductSubcategoryID, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductModelID, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(SellStartDate, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(SellEndDate, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DiscontinuedDate, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 24 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 25 + __off, 93, __dbStmt);
    return 25;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ProductID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProductNumber, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(MakeFlag, 4 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(FinishedGoodsFlag, 5 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(Color, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SafetyStockLevel, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(ReorderPoint, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeDouble(StandardCost, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(ListPrice, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Size, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SizeUnitMeasureCode, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WeightUnitMeasureCode, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Weight, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(DaysToManufacture, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(ProductLine, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Class, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Style, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductSubcategoryID, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductModelID, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(SellStartDate, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(SellEndDate, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DiscontinuedDate, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 24 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 25 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ProductID = null;
    } else {
    this.ProductID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Name = null;
    } else {
    this.Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProductNumber = null;
    } else {
    this.ProductNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MakeFlag = null;
    } else {
    this.MakeFlag = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.FinishedGoodsFlag = null;
    } else {
    this.FinishedGoodsFlag = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.Color = null;
    } else {
    this.Color = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SafetyStockLevel = null;
    } else {
    this.SafetyStockLevel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ReorderPoint = null;
    } else {
    this.ReorderPoint = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.StandardCost = null;
    } else {
    this.StandardCost = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.ListPrice = null;
    } else {
    this.ListPrice = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Size = null;
    } else {
    this.Size = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SizeUnitMeasureCode = null;
    } else {
    this.SizeUnitMeasureCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WeightUnitMeasureCode = null;
    } else {
    this.WeightUnitMeasureCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Weight = null;
    } else {
    this.Weight = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DaysToManufacture = null;
    } else {
    this.DaysToManufacture = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductLine = null;
    } else {
    this.ProductLine = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Class = null;
    } else {
    this.Class = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Style = null;
    } else {
    this.Style = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProductSubcategoryID = null;
    } else {
    this.ProductSubcategoryID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductModelID = null;
    } else {
    this.ProductModelID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SellStartDate = null;
    } else {
    this.SellStartDate = new Timestamp(__dataIn.readLong());
    this.SellStartDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SellEndDate = null;
    } else {
    this.SellEndDate = new Timestamp(__dataIn.readLong());
    this.SellEndDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DiscontinuedDate = null;
    } else {
    this.DiscontinuedDate = new Timestamp(__dataIn.readLong());
    this.DiscontinuedDate.setNanos(__dataIn.readInt());
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
    if (null == this.ProductID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductID);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.ProductNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductNumber);
    }
    if (null == this.MakeFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.MakeFlag);
    }
    if (null == this.FinishedGoodsFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.FinishedGoodsFlag);
    }
    if (null == this.Color) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Color);
    }
    if (null == this.SafetyStockLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SafetyStockLevel);
    }
    if (null == this.ReorderPoint) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ReorderPoint);
    }
    if (null == this.StandardCost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.StandardCost);
    }
    if (null == this.ListPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ListPrice);
    }
    if (null == this.Size) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Size);
    }
    if (null == this.SizeUnitMeasureCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SizeUnitMeasureCode);
    }
    if (null == this.WeightUnitMeasureCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WeightUnitMeasureCode);
    }
    if (null == this.Weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Weight, __dataOut);
    }
    if (null == this.DaysToManufacture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DaysToManufacture);
    }
    if (null == this.ProductLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductLine);
    }
    if (null == this.Class) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Class);
    }
    if (null == this.Style) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Style);
    }
    if (null == this.ProductSubcategoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductSubcategoryID);
    }
    if (null == this.ProductModelID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductModelID);
    }
    if (null == this.SellStartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SellStartDate.getTime());
    __dataOut.writeInt(this.SellStartDate.getNanos());
    }
    if (null == this.SellEndDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SellEndDate.getTime());
    __dataOut.writeInt(this.SellEndDate.getNanos());
    }
    if (null == this.DiscontinuedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DiscontinuedDate.getTime());
    __dataOut.writeInt(this.DiscontinuedDate.getNanos());
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
    if (null == this.ProductID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductID);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.ProductNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductNumber);
    }
    if (null == this.MakeFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.MakeFlag);
    }
    if (null == this.FinishedGoodsFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.FinishedGoodsFlag);
    }
    if (null == this.Color) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Color);
    }
    if (null == this.SafetyStockLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SafetyStockLevel);
    }
    if (null == this.ReorderPoint) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ReorderPoint);
    }
    if (null == this.StandardCost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.StandardCost);
    }
    if (null == this.ListPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ListPrice);
    }
    if (null == this.Size) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Size);
    }
    if (null == this.SizeUnitMeasureCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SizeUnitMeasureCode);
    }
    if (null == this.WeightUnitMeasureCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WeightUnitMeasureCode);
    }
    if (null == this.Weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Weight, __dataOut);
    }
    if (null == this.DaysToManufacture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DaysToManufacture);
    }
    if (null == this.ProductLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductLine);
    }
    if (null == this.Class) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Class);
    }
    if (null == this.Style) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Style);
    }
    if (null == this.ProductSubcategoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductSubcategoryID);
    }
    if (null == this.ProductModelID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductModelID);
    }
    if (null == this.SellStartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SellStartDate.getTime());
    __dataOut.writeInt(this.SellStartDate.getNanos());
    }
    if (null == this.SellEndDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SellEndDate.getTime());
    __dataOut.writeInt(this.SellEndDate.getNanos());
    }
    if (null == this.DiscontinuedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DiscontinuedDate.getTime());
    __dataOut.writeInt(this.DiscontinuedDate.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(ProductID==null?"null":"" + ProductID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductNumber==null?"null":ProductNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MakeFlag==null?"null":"" + MakeFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FinishedGoodsFlag==null?"null":"" + FinishedGoodsFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Color==null?"null":Color, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SafetyStockLevel==null?"null":"" + SafetyStockLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ReorderPoint==null?"null":"" + ReorderPoint, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StandardCost==null?"null":"" + StandardCost, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ListPrice==null?"null":"" + ListPrice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Size==null?"null":Size, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SizeUnitMeasureCode==null?"null":SizeUnitMeasureCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeightUnitMeasureCode==null?"null":WeightUnitMeasureCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Weight==null?"null":Weight.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DaysToManufacture==null?"null":"" + DaysToManufacture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductLine==null?"null":ProductLine, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Class==null?"null":Class, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Style==null?"null":Style, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductSubcategoryID==null?"null":"" + ProductSubcategoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductModelID==null?"null":"" + ProductModelID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SellStartDate==null?"null":"" + SellStartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SellEndDate==null?"null":"" + SellEndDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DiscontinuedDate==null?"null":"" + DiscontinuedDate, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(ProductID==null?"null":"" + ProductID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductNumber==null?"null":ProductNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MakeFlag==null?"null":"" + MakeFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FinishedGoodsFlag==null?"null":"" + FinishedGoodsFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Color==null?"null":Color, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SafetyStockLevel==null?"null":"" + SafetyStockLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ReorderPoint==null?"null":"" + ReorderPoint, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StandardCost==null?"null":"" + StandardCost, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ListPrice==null?"null":"" + ListPrice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Size==null?"null":Size, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SizeUnitMeasureCode==null?"null":SizeUnitMeasureCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeightUnitMeasureCode==null?"null":WeightUnitMeasureCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Weight==null?"null":Weight.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DaysToManufacture==null?"null":"" + DaysToManufacture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductLine==null?"null":ProductLine, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Class==null?"null":Class, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Style==null?"null":Style, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductSubcategoryID==null?"null":"" + ProductSubcategoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductModelID==null?"null":"" + ProductModelID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SellStartDate==null?"null":"" + SellStartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SellEndDate==null?"null":"" + SellEndDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DiscontinuedDate==null?"null":"" + DiscontinuedDate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductID = null; } else {
      this.ProductID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProductNumber = null; } else {
      this.ProductNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MakeFlag = null; } else {
      this.MakeFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FinishedGoodsFlag = null; } else {
      this.FinishedGoodsFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Color = null; } else {
      this.Color = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SafetyStockLevel = null; } else {
      this.SafetyStockLevel = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ReorderPoint = null; } else {
      this.ReorderPoint = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StandardCost = null; } else {
      this.StandardCost = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ListPrice = null; } else {
      this.ListPrice = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Size = null; } else {
      this.Size = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SizeUnitMeasureCode = null; } else {
      this.SizeUnitMeasureCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WeightUnitMeasureCode = null; } else {
      this.WeightUnitMeasureCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Weight = null; } else {
      this.Weight = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DaysToManufacture = null; } else {
      this.DaysToManufacture = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProductLine = null; } else {
      this.ProductLine = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Class = null; } else {
      this.Class = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Style = null; } else {
      this.Style = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductSubcategoryID = null; } else {
      this.ProductSubcategoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductModelID = null; } else {
      this.ProductModelID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SellStartDate = null; } else {
      this.SellStartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SellEndDate = null; } else {
      this.SellEndDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DiscontinuedDate = null; } else {
      this.DiscontinuedDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductID = null; } else {
      this.ProductID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProductNumber = null; } else {
      this.ProductNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MakeFlag = null; } else {
      this.MakeFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FinishedGoodsFlag = null; } else {
      this.FinishedGoodsFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Color = null; } else {
      this.Color = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SafetyStockLevel = null; } else {
      this.SafetyStockLevel = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ReorderPoint = null; } else {
      this.ReorderPoint = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StandardCost = null; } else {
      this.StandardCost = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ListPrice = null; } else {
      this.ListPrice = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Size = null; } else {
      this.Size = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SizeUnitMeasureCode = null; } else {
      this.SizeUnitMeasureCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WeightUnitMeasureCode = null; } else {
      this.WeightUnitMeasureCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Weight = null; } else {
      this.Weight = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DaysToManufacture = null; } else {
      this.DaysToManufacture = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProductLine = null; } else {
      this.ProductLine = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Class = null; } else {
      this.Class = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Style = null; } else {
      this.Style = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductSubcategoryID = null; } else {
      this.ProductSubcategoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductModelID = null; } else {
      this.ProductModelID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SellStartDate = null; } else {
      this.SellStartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SellEndDate = null; } else {
      this.SellEndDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DiscontinuedDate = null; } else {
      this.DiscontinuedDate = java.sql.Timestamp.valueOf(__cur_str);
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
    product o = (product) super.clone();
    o.SellStartDate = (o.SellStartDate != null) ? (java.sql.Timestamp) o.SellStartDate.clone() : null;
    o.SellEndDate = (o.SellEndDate != null) ? (java.sql.Timestamp) o.SellEndDate.clone() : null;
    o.DiscontinuedDate = (o.DiscontinuedDate != null) ? (java.sql.Timestamp) o.DiscontinuedDate.clone() : null;
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
    return o;
  }

  public void clone0(product o) throws CloneNotSupportedException {
    o.SellStartDate = (o.SellStartDate != null) ? (java.sql.Timestamp) o.SellStartDate.clone() : null;
    o.SellEndDate = (o.SellEndDate != null) ? (java.sql.Timestamp) o.SellEndDate.clone() : null;
    o.DiscontinuedDate = (o.DiscontinuedDate != null) ? (java.sql.Timestamp) o.DiscontinuedDate.clone() : null;
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("ProductID", this.ProductID);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("ProductNumber", this.ProductNumber);
    __sqoop$field_map.put("MakeFlag", this.MakeFlag);
    __sqoop$field_map.put("FinishedGoodsFlag", this.FinishedGoodsFlag);
    __sqoop$field_map.put("Color", this.Color);
    __sqoop$field_map.put("SafetyStockLevel", this.SafetyStockLevel);
    __sqoop$field_map.put("ReorderPoint", this.ReorderPoint);
    __sqoop$field_map.put("StandardCost", this.StandardCost);
    __sqoop$field_map.put("ListPrice", this.ListPrice);
    __sqoop$field_map.put("Size", this.Size);
    __sqoop$field_map.put("SizeUnitMeasureCode", this.SizeUnitMeasureCode);
    __sqoop$field_map.put("WeightUnitMeasureCode", this.WeightUnitMeasureCode);
    __sqoop$field_map.put("Weight", this.Weight);
    __sqoop$field_map.put("DaysToManufacture", this.DaysToManufacture);
    __sqoop$field_map.put("ProductLine", this.ProductLine);
    __sqoop$field_map.put("Class", this.Class);
    __sqoop$field_map.put("Style", this.Style);
    __sqoop$field_map.put("ProductSubcategoryID", this.ProductSubcategoryID);
    __sqoop$field_map.put("ProductModelID", this.ProductModelID);
    __sqoop$field_map.put("SellStartDate", this.SellStartDate);
    __sqoop$field_map.put("SellEndDate", this.SellEndDate);
    __sqoop$field_map.put("DiscontinuedDate", this.DiscontinuedDate);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ProductID", this.ProductID);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("ProductNumber", this.ProductNumber);
    __sqoop$field_map.put("MakeFlag", this.MakeFlag);
    __sqoop$field_map.put("FinishedGoodsFlag", this.FinishedGoodsFlag);
    __sqoop$field_map.put("Color", this.Color);
    __sqoop$field_map.put("SafetyStockLevel", this.SafetyStockLevel);
    __sqoop$field_map.put("ReorderPoint", this.ReorderPoint);
    __sqoop$field_map.put("StandardCost", this.StandardCost);
    __sqoop$field_map.put("ListPrice", this.ListPrice);
    __sqoop$field_map.put("Size", this.Size);
    __sqoop$field_map.put("SizeUnitMeasureCode", this.SizeUnitMeasureCode);
    __sqoop$field_map.put("WeightUnitMeasureCode", this.WeightUnitMeasureCode);
    __sqoop$field_map.put("Weight", this.Weight);
    __sqoop$field_map.put("DaysToManufacture", this.DaysToManufacture);
    __sqoop$field_map.put("ProductLine", this.ProductLine);
    __sqoop$field_map.put("Class", this.Class);
    __sqoop$field_map.put("Style", this.Style);
    __sqoop$field_map.put("ProductSubcategoryID", this.ProductSubcategoryID);
    __sqoop$field_map.put("ProductModelID", this.ProductModelID);
    __sqoop$field_map.put("SellStartDate", this.SellStartDate);
    __sqoop$field_map.put("SellEndDate", this.SellEndDate);
    __sqoop$field_map.put("DiscontinuedDate", this.DiscontinuedDate);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("ProductID".equals(__fieldName)) {
      this.ProductID = (Integer) __fieldVal;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
    }
    else    if ("ProductNumber".equals(__fieldName)) {
      this.ProductNumber = (String) __fieldVal;
    }
    else    if ("MakeFlag".equals(__fieldName)) {
      this.MakeFlag = (Boolean) __fieldVal;
    }
    else    if ("FinishedGoodsFlag".equals(__fieldName)) {
      this.FinishedGoodsFlag = (Boolean) __fieldVal;
    }
    else    if ("Color".equals(__fieldName)) {
      this.Color = (String) __fieldVal;
    }
    else    if ("SafetyStockLevel".equals(__fieldName)) {
      this.SafetyStockLevel = (Integer) __fieldVal;
    }
    else    if ("ReorderPoint".equals(__fieldName)) {
      this.ReorderPoint = (Integer) __fieldVal;
    }
    else    if ("StandardCost".equals(__fieldName)) {
      this.StandardCost = (Double) __fieldVal;
    }
    else    if ("ListPrice".equals(__fieldName)) {
      this.ListPrice = (Double) __fieldVal;
    }
    else    if ("Size".equals(__fieldName)) {
      this.Size = (String) __fieldVal;
    }
    else    if ("SizeUnitMeasureCode".equals(__fieldName)) {
      this.SizeUnitMeasureCode = (String) __fieldVal;
    }
    else    if ("WeightUnitMeasureCode".equals(__fieldName)) {
      this.WeightUnitMeasureCode = (String) __fieldVal;
    }
    else    if ("Weight".equals(__fieldName)) {
      this.Weight = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DaysToManufacture".equals(__fieldName)) {
      this.DaysToManufacture = (Integer) __fieldVal;
    }
    else    if ("ProductLine".equals(__fieldName)) {
      this.ProductLine = (String) __fieldVal;
    }
    else    if ("Class".equals(__fieldName)) {
      this.Class = (String) __fieldVal;
    }
    else    if ("Style".equals(__fieldName)) {
      this.Style = (String) __fieldVal;
    }
    else    if ("ProductSubcategoryID".equals(__fieldName)) {
      this.ProductSubcategoryID = (Integer) __fieldVal;
    }
    else    if ("ProductModelID".equals(__fieldName)) {
      this.ProductModelID = (Integer) __fieldVal;
    }
    else    if ("SellStartDate".equals(__fieldName)) {
      this.SellStartDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("SellEndDate".equals(__fieldName)) {
      this.SellEndDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("DiscontinuedDate".equals(__fieldName)) {
      this.DiscontinuedDate = (java.sql.Timestamp) __fieldVal;
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
    if ("ProductID".equals(__fieldName)) {
      this.ProductID = (Integer) __fieldVal;
      return true;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
      return true;
    }
    else    if ("ProductNumber".equals(__fieldName)) {
      this.ProductNumber = (String) __fieldVal;
      return true;
    }
    else    if ("MakeFlag".equals(__fieldName)) {
      this.MakeFlag = (Boolean) __fieldVal;
      return true;
    }
    else    if ("FinishedGoodsFlag".equals(__fieldName)) {
      this.FinishedGoodsFlag = (Boolean) __fieldVal;
      return true;
    }
    else    if ("Color".equals(__fieldName)) {
      this.Color = (String) __fieldVal;
      return true;
    }
    else    if ("SafetyStockLevel".equals(__fieldName)) {
      this.SafetyStockLevel = (Integer) __fieldVal;
      return true;
    }
    else    if ("ReorderPoint".equals(__fieldName)) {
      this.ReorderPoint = (Integer) __fieldVal;
      return true;
    }
    else    if ("StandardCost".equals(__fieldName)) {
      this.StandardCost = (Double) __fieldVal;
      return true;
    }
    else    if ("ListPrice".equals(__fieldName)) {
      this.ListPrice = (Double) __fieldVal;
      return true;
    }
    else    if ("Size".equals(__fieldName)) {
      this.Size = (String) __fieldVal;
      return true;
    }
    else    if ("SizeUnitMeasureCode".equals(__fieldName)) {
      this.SizeUnitMeasureCode = (String) __fieldVal;
      return true;
    }
    else    if ("WeightUnitMeasureCode".equals(__fieldName)) {
      this.WeightUnitMeasureCode = (String) __fieldVal;
      return true;
    }
    else    if ("Weight".equals(__fieldName)) {
      this.Weight = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DaysToManufacture".equals(__fieldName)) {
      this.DaysToManufacture = (Integer) __fieldVal;
      return true;
    }
    else    if ("ProductLine".equals(__fieldName)) {
      this.ProductLine = (String) __fieldVal;
      return true;
    }
    else    if ("Class".equals(__fieldName)) {
      this.Class = (String) __fieldVal;
      return true;
    }
    else    if ("Style".equals(__fieldName)) {
      this.Style = (String) __fieldVal;
      return true;
    }
    else    if ("ProductSubcategoryID".equals(__fieldName)) {
      this.ProductSubcategoryID = (Integer) __fieldVal;
      return true;
    }
    else    if ("ProductModelID".equals(__fieldName)) {
      this.ProductModelID = (Integer) __fieldVal;
      return true;
    }
    else    if ("SellStartDate".equals(__fieldName)) {
      this.SellStartDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("SellEndDate".equals(__fieldName)) {
      this.SellEndDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("DiscontinuedDate".equals(__fieldName)) {
      this.DiscontinuedDate = (java.sql.Timestamp) __fieldVal;
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
