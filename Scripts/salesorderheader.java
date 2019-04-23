// ORM class for table 'salesorderheader'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 31 16:40:01 PST 2014
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

public class salesorderheader extends SqoopRecord  implements DBWritable, Writable {
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
  public salesorderheader with_SalesOrderID(Integer SalesOrderID) {
    this.SalesOrderID = SalesOrderID;
    return this;
  }
  private Integer RevisionNumber;
  public Integer get_RevisionNumber() {
    return RevisionNumber;
  }
  public void set_RevisionNumber(Integer RevisionNumber) {
    this.RevisionNumber = RevisionNumber;
  }
  public salesorderheader with_RevisionNumber(Integer RevisionNumber) {
    this.RevisionNumber = RevisionNumber;
    return this;
  }
  private java.sql.Timestamp OrderDate;
  public java.sql.Timestamp get_OrderDate() {
    return OrderDate;
  }
  public void set_OrderDate(java.sql.Timestamp OrderDate) {
    this.OrderDate = OrderDate;
  }
  public salesorderheader with_OrderDate(java.sql.Timestamp OrderDate) {
    this.OrderDate = OrderDate;
    return this;
  }
  private java.sql.Timestamp DueDate;
  public java.sql.Timestamp get_DueDate() {
    return DueDate;
  }
  public void set_DueDate(java.sql.Timestamp DueDate) {
    this.DueDate = DueDate;
  }
  public salesorderheader with_DueDate(java.sql.Timestamp DueDate) {
    this.DueDate = DueDate;
    return this;
  }
  private java.sql.Timestamp ShipDate;
  public java.sql.Timestamp get_ShipDate() {
    return ShipDate;
  }
  public void set_ShipDate(java.sql.Timestamp ShipDate) {
    this.ShipDate = ShipDate;
  }
  public salesorderheader with_ShipDate(java.sql.Timestamp ShipDate) {
    this.ShipDate = ShipDate;
    return this;
  }
  private Integer Status;
  public Integer get_Status() {
    return Status;
  }
  public void set_Status(Integer Status) {
    this.Status = Status;
  }
  public salesorderheader with_Status(Integer Status) {
    this.Status = Status;
    return this;
  }
  private Boolean OnlineOrderFlag;
  public Boolean get_OnlineOrderFlag() {
    return OnlineOrderFlag;
  }
  public void set_OnlineOrderFlag(Boolean OnlineOrderFlag) {
    this.OnlineOrderFlag = OnlineOrderFlag;
  }
  public salesorderheader with_OnlineOrderFlag(Boolean OnlineOrderFlag) {
    this.OnlineOrderFlag = OnlineOrderFlag;
    return this;
  }
  private String SalesOrderNumber;
  public String get_SalesOrderNumber() {
    return SalesOrderNumber;
  }
  public void set_SalesOrderNumber(String SalesOrderNumber) {
    this.SalesOrderNumber = SalesOrderNumber;
  }
  public salesorderheader with_SalesOrderNumber(String SalesOrderNumber) {
    this.SalesOrderNumber = SalesOrderNumber;
    return this;
  }
  private String PurchaseOrderNumber;
  public String get_PurchaseOrderNumber() {
    return PurchaseOrderNumber;
  }
  public void set_PurchaseOrderNumber(String PurchaseOrderNumber) {
    this.PurchaseOrderNumber = PurchaseOrderNumber;
  }
  public salesorderheader with_PurchaseOrderNumber(String PurchaseOrderNumber) {
    this.PurchaseOrderNumber = PurchaseOrderNumber;
    return this;
  }
  private String AccountNumber;
  public String get_AccountNumber() {
    return AccountNumber;
  }
  public void set_AccountNumber(String AccountNumber) {
    this.AccountNumber = AccountNumber;
  }
  public salesorderheader with_AccountNumber(String AccountNumber) {
    this.AccountNumber = AccountNumber;
    return this;
  }
  private Integer CustomerID;
  public Integer get_CustomerID() {
    return CustomerID;
  }
  public void set_CustomerID(Integer CustomerID) {
    this.CustomerID = CustomerID;
  }
  public salesorderheader with_CustomerID(Integer CustomerID) {
    this.CustomerID = CustomerID;
    return this;
  }
  private Integer ContactID;
  public Integer get_ContactID() {
    return ContactID;
  }
  public void set_ContactID(Integer ContactID) {
    this.ContactID = ContactID;
  }
  public salesorderheader with_ContactID(Integer ContactID) {
    this.ContactID = ContactID;
    return this;
  }
  private Integer SalesPersonID;
  public Integer get_SalesPersonID() {
    return SalesPersonID;
  }
  public void set_SalesPersonID(Integer SalesPersonID) {
    this.SalesPersonID = SalesPersonID;
  }
  public salesorderheader with_SalesPersonID(Integer SalesPersonID) {
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
  public salesorderheader with_TerritoryID(Integer TerritoryID) {
    this.TerritoryID = TerritoryID;
    return this;
  }
  private Integer BillToAddressID;
  public Integer get_BillToAddressID() {
    return BillToAddressID;
  }
  public void set_BillToAddressID(Integer BillToAddressID) {
    this.BillToAddressID = BillToAddressID;
  }
  public salesorderheader with_BillToAddressID(Integer BillToAddressID) {
    this.BillToAddressID = BillToAddressID;
    return this;
  }
  private Integer ShipToAddressID;
  public Integer get_ShipToAddressID() {
    return ShipToAddressID;
  }
  public void set_ShipToAddressID(Integer ShipToAddressID) {
    this.ShipToAddressID = ShipToAddressID;
  }
  public salesorderheader with_ShipToAddressID(Integer ShipToAddressID) {
    this.ShipToAddressID = ShipToAddressID;
    return this;
  }
  private Integer ShipMethodID;
  public Integer get_ShipMethodID() {
    return ShipMethodID;
  }
  public void set_ShipMethodID(Integer ShipMethodID) {
    this.ShipMethodID = ShipMethodID;
  }
  public salesorderheader with_ShipMethodID(Integer ShipMethodID) {
    this.ShipMethodID = ShipMethodID;
    return this;
  }
  private Integer CreditCardID;
  public Integer get_CreditCardID() {
    return CreditCardID;
  }
  public void set_CreditCardID(Integer CreditCardID) {
    this.CreditCardID = CreditCardID;
  }
  public salesorderheader with_CreditCardID(Integer CreditCardID) {
    this.CreditCardID = CreditCardID;
    return this;
  }
  private String CreditCardApprovalCode;
  public String get_CreditCardApprovalCode() {
    return CreditCardApprovalCode;
  }
  public void set_CreditCardApprovalCode(String CreditCardApprovalCode) {
    this.CreditCardApprovalCode = CreditCardApprovalCode;
  }
  public salesorderheader with_CreditCardApprovalCode(String CreditCardApprovalCode) {
    this.CreditCardApprovalCode = CreditCardApprovalCode;
    return this;
  }
  private Integer CurrencyRateID;
  public Integer get_CurrencyRateID() {
    return CurrencyRateID;
  }
  public void set_CurrencyRateID(Integer CurrencyRateID) {
    this.CurrencyRateID = CurrencyRateID;
  }
  public salesorderheader with_CurrencyRateID(Integer CurrencyRateID) {
    this.CurrencyRateID = CurrencyRateID;
    return this;
  }
  private Double SubTotal;
  public Double get_SubTotal() {
    return SubTotal;
  }
  public void set_SubTotal(Double SubTotal) {
    this.SubTotal = SubTotal;
  }
  public salesorderheader with_SubTotal(Double SubTotal) {
    this.SubTotal = SubTotal;
    return this;
  }
  private Double TaxAmt;
  public Double get_TaxAmt() {
    return TaxAmt;
  }
  public void set_TaxAmt(Double TaxAmt) {
    this.TaxAmt = TaxAmt;
  }
  public salesorderheader with_TaxAmt(Double TaxAmt) {
    this.TaxAmt = TaxAmt;
    return this;
  }
  private Double Freight;
  public Double get_Freight() {
    return Freight;
  }
  public void set_Freight(Double Freight) {
    this.Freight = Freight;
  }
  public salesorderheader with_Freight(Double Freight) {
    this.Freight = Freight;
    return this;
  }
  private Double TotalDue;
  public Double get_TotalDue() {
    return TotalDue;
  }
  public void set_TotalDue(Double TotalDue) {
    this.TotalDue = TotalDue;
  }
  public salesorderheader with_TotalDue(Double TotalDue) {
    this.TotalDue = TotalDue;
    return this;
  }
  private String Comment;
  public String get_Comment() {
    return Comment;
  }
  public void set_Comment(String Comment) {
    this.Comment = Comment;
  }
  public salesorderheader with_Comment(String Comment) {
    this.Comment = Comment;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable rowguid;
  public org.apache.hadoop.io.BytesWritable get_rowguid() {
    return rowguid;
  }
  public void set_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
    this.rowguid = rowguid;
  }
  public salesorderheader with_rowguid(org.apache.hadoop.io.BytesWritable rowguid) {
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
  public salesorderheader with_ModifiedDate(java.sql.Timestamp ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof salesorderheader)) {
      return false;
    }
    salesorderheader that = (salesorderheader) o;
    boolean equal = true;
    equal = equal && (this.SalesOrderID == null ? that.SalesOrderID == null : this.SalesOrderID.equals(that.SalesOrderID));
    equal = equal && (this.RevisionNumber == null ? that.RevisionNumber == null : this.RevisionNumber.equals(that.RevisionNumber));
    equal = equal && (this.OrderDate == null ? that.OrderDate == null : this.OrderDate.equals(that.OrderDate));
    equal = equal && (this.DueDate == null ? that.DueDate == null : this.DueDate.equals(that.DueDate));
    equal = equal && (this.ShipDate == null ? that.ShipDate == null : this.ShipDate.equals(that.ShipDate));
    equal = equal && (this.Status == null ? that.Status == null : this.Status.equals(that.Status));
    equal = equal && (this.OnlineOrderFlag == null ? that.OnlineOrderFlag == null : this.OnlineOrderFlag.equals(that.OnlineOrderFlag));
    equal = equal && (this.SalesOrderNumber == null ? that.SalesOrderNumber == null : this.SalesOrderNumber.equals(that.SalesOrderNumber));
    equal = equal && (this.PurchaseOrderNumber == null ? that.PurchaseOrderNumber == null : this.PurchaseOrderNumber.equals(that.PurchaseOrderNumber));
    equal = equal && (this.AccountNumber == null ? that.AccountNumber == null : this.AccountNumber.equals(that.AccountNumber));
    equal = equal && (this.CustomerID == null ? that.CustomerID == null : this.CustomerID.equals(that.CustomerID));
    equal = equal && (this.ContactID == null ? that.ContactID == null : this.ContactID.equals(that.ContactID));
    equal = equal && (this.SalesPersonID == null ? that.SalesPersonID == null : this.SalesPersonID.equals(that.SalesPersonID));
    equal = equal && (this.TerritoryID == null ? that.TerritoryID == null : this.TerritoryID.equals(that.TerritoryID));
    equal = equal && (this.BillToAddressID == null ? that.BillToAddressID == null : this.BillToAddressID.equals(that.BillToAddressID));
    equal = equal && (this.ShipToAddressID == null ? that.ShipToAddressID == null : this.ShipToAddressID.equals(that.ShipToAddressID));
    equal = equal && (this.ShipMethodID == null ? that.ShipMethodID == null : this.ShipMethodID.equals(that.ShipMethodID));
    equal = equal && (this.CreditCardID == null ? that.CreditCardID == null : this.CreditCardID.equals(that.CreditCardID));
    equal = equal && (this.CreditCardApprovalCode == null ? that.CreditCardApprovalCode == null : this.CreditCardApprovalCode.equals(that.CreditCardApprovalCode));
    equal = equal && (this.CurrencyRateID == null ? that.CurrencyRateID == null : this.CurrencyRateID.equals(that.CurrencyRateID));
    equal = equal && (this.SubTotal == null ? that.SubTotal == null : this.SubTotal.equals(that.SubTotal));
    equal = equal && (this.TaxAmt == null ? that.TaxAmt == null : this.TaxAmt.equals(that.TaxAmt));
    equal = equal && (this.Freight == null ? that.Freight == null : this.Freight.equals(that.Freight));
    equal = equal && (this.TotalDue == null ? that.TotalDue == null : this.TotalDue.equals(that.TotalDue));
    equal = equal && (this.Comment == null ? that.Comment == null : this.Comment.equals(that.Comment));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof salesorderheader)) {
      return false;
    }
    salesorderheader that = (salesorderheader) o;
    boolean equal = true;
    equal = equal && (this.SalesOrderID == null ? that.SalesOrderID == null : this.SalesOrderID.equals(that.SalesOrderID));
    equal = equal && (this.RevisionNumber == null ? that.RevisionNumber == null : this.RevisionNumber.equals(that.RevisionNumber));
    equal = equal && (this.OrderDate == null ? that.OrderDate == null : this.OrderDate.equals(that.OrderDate));
    equal = equal && (this.DueDate == null ? that.DueDate == null : this.DueDate.equals(that.DueDate));
    equal = equal && (this.ShipDate == null ? that.ShipDate == null : this.ShipDate.equals(that.ShipDate));
    equal = equal && (this.Status == null ? that.Status == null : this.Status.equals(that.Status));
    equal = equal && (this.OnlineOrderFlag == null ? that.OnlineOrderFlag == null : this.OnlineOrderFlag.equals(that.OnlineOrderFlag));
    equal = equal && (this.SalesOrderNumber == null ? that.SalesOrderNumber == null : this.SalesOrderNumber.equals(that.SalesOrderNumber));
    equal = equal && (this.PurchaseOrderNumber == null ? that.PurchaseOrderNumber == null : this.PurchaseOrderNumber.equals(that.PurchaseOrderNumber));
    equal = equal && (this.AccountNumber == null ? that.AccountNumber == null : this.AccountNumber.equals(that.AccountNumber));
    equal = equal && (this.CustomerID == null ? that.CustomerID == null : this.CustomerID.equals(that.CustomerID));
    equal = equal && (this.ContactID == null ? that.ContactID == null : this.ContactID.equals(that.ContactID));
    equal = equal && (this.SalesPersonID == null ? that.SalesPersonID == null : this.SalesPersonID.equals(that.SalesPersonID));
    equal = equal && (this.TerritoryID == null ? that.TerritoryID == null : this.TerritoryID.equals(that.TerritoryID));
    equal = equal && (this.BillToAddressID == null ? that.BillToAddressID == null : this.BillToAddressID.equals(that.BillToAddressID));
    equal = equal && (this.ShipToAddressID == null ? that.ShipToAddressID == null : this.ShipToAddressID.equals(that.ShipToAddressID));
    equal = equal && (this.ShipMethodID == null ? that.ShipMethodID == null : this.ShipMethodID.equals(that.ShipMethodID));
    equal = equal && (this.CreditCardID == null ? that.CreditCardID == null : this.CreditCardID.equals(that.CreditCardID));
    equal = equal && (this.CreditCardApprovalCode == null ? that.CreditCardApprovalCode == null : this.CreditCardApprovalCode.equals(that.CreditCardApprovalCode));
    equal = equal && (this.CurrencyRateID == null ? that.CurrencyRateID == null : this.CurrencyRateID.equals(that.CurrencyRateID));
    equal = equal && (this.SubTotal == null ? that.SubTotal == null : this.SubTotal.equals(that.SubTotal));
    equal = equal && (this.TaxAmt == null ? that.TaxAmt == null : this.TaxAmt.equals(that.TaxAmt));
    equal = equal && (this.Freight == null ? that.Freight == null : this.Freight.equals(that.Freight));
    equal = equal && (this.TotalDue == null ? that.TotalDue == null : this.TotalDue.equals(that.TotalDue));
    equal = equal && (this.Comment == null ? that.Comment == null : this.Comment.equals(that.Comment));
    equal = equal && (this.rowguid == null ? that.rowguid == null : this.rowguid.equals(that.rowguid));
    equal = equal && (this.ModifiedDate == null ? that.ModifiedDate == null : this.ModifiedDate.equals(that.ModifiedDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.SalesOrderID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.RevisionNumber = JdbcWritableBridge.readInteger(2, __dbResults);
    this.OrderDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.DueDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.ShipDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.Status = JdbcWritableBridge.readInteger(6, __dbResults);
    this.OnlineOrderFlag = JdbcWritableBridge.readBoolean(7, __dbResults);
    this.SalesOrderNumber = JdbcWritableBridge.readString(8, __dbResults);
    this.PurchaseOrderNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.AccountNumber = JdbcWritableBridge.readString(10, __dbResults);
    this.CustomerID = JdbcWritableBridge.readInteger(11, __dbResults);
    this.ContactID = JdbcWritableBridge.readInteger(12, __dbResults);
    this.SalesPersonID = JdbcWritableBridge.readInteger(13, __dbResults);
    this.TerritoryID = JdbcWritableBridge.readInteger(14, __dbResults);
    this.BillToAddressID = JdbcWritableBridge.readInteger(15, __dbResults);
    this.ShipToAddressID = JdbcWritableBridge.readInteger(16, __dbResults);
    this.ShipMethodID = JdbcWritableBridge.readInteger(17, __dbResults);
    this.CreditCardID = JdbcWritableBridge.readInteger(18, __dbResults);
    this.CreditCardApprovalCode = JdbcWritableBridge.readString(19, __dbResults);
    this.CurrencyRateID = JdbcWritableBridge.readInteger(20, __dbResults);
    this.SubTotal = JdbcWritableBridge.readDouble(21, __dbResults);
    this.TaxAmt = JdbcWritableBridge.readDouble(22, __dbResults);
    this.Freight = JdbcWritableBridge.readDouble(23, __dbResults);
    this.TotalDue = JdbcWritableBridge.readDouble(24, __dbResults);
    this.Comment = JdbcWritableBridge.readString(25, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(26, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.SalesOrderID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.RevisionNumber = JdbcWritableBridge.readInteger(2, __dbResults);
    this.OrderDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.DueDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.ShipDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.Status = JdbcWritableBridge.readInteger(6, __dbResults);
    this.OnlineOrderFlag = JdbcWritableBridge.readBoolean(7, __dbResults);
    this.SalesOrderNumber = JdbcWritableBridge.readString(8, __dbResults);
    this.PurchaseOrderNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.AccountNumber = JdbcWritableBridge.readString(10, __dbResults);
    this.CustomerID = JdbcWritableBridge.readInteger(11, __dbResults);
    this.ContactID = JdbcWritableBridge.readInteger(12, __dbResults);
    this.SalesPersonID = JdbcWritableBridge.readInteger(13, __dbResults);
    this.TerritoryID = JdbcWritableBridge.readInteger(14, __dbResults);
    this.BillToAddressID = JdbcWritableBridge.readInteger(15, __dbResults);
    this.ShipToAddressID = JdbcWritableBridge.readInteger(16, __dbResults);
    this.ShipMethodID = JdbcWritableBridge.readInteger(17, __dbResults);
    this.CreditCardID = JdbcWritableBridge.readInteger(18, __dbResults);
    this.CreditCardApprovalCode = JdbcWritableBridge.readString(19, __dbResults);
    this.CurrencyRateID = JdbcWritableBridge.readInteger(20, __dbResults);
    this.SubTotal = JdbcWritableBridge.readDouble(21, __dbResults);
    this.TaxAmt = JdbcWritableBridge.readDouble(22, __dbResults);
    this.Freight = JdbcWritableBridge.readDouble(23, __dbResults);
    this.TotalDue = JdbcWritableBridge.readDouble(24, __dbResults);
    this.Comment = JdbcWritableBridge.readString(25, __dbResults);
    this.rowguid = JdbcWritableBridge.readBytesWritable(26, __dbResults);
    this.ModifiedDate = JdbcWritableBridge.readTimestamp(27, __dbResults);
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
    JdbcWritableBridge.writeInteger(RevisionNumber, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(OrderDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DueDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ShipDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(Status, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBoolean(OnlineOrderFlag, 7 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(SalesOrderNumber, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PurchaseOrderNumber, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AccountNumber, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(CustomerID, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ContactID, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesPersonID, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TerritoryID, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(BillToAddressID, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ShipToAddressID, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ShipMethodID, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CreditCardID, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CreditCardApprovalCode, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(CurrencyRateID, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(SubTotal, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(TaxAmt, 22 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Freight, 23 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(TotalDue, 24 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Comment, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 26 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(SalesOrderID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(RevisionNumber, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(OrderDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DueDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ShipDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(Status, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBoolean(OnlineOrderFlag, 7 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(SalesOrderNumber, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PurchaseOrderNumber, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AccountNumber, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(CustomerID, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ContactID, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesPersonID, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TerritoryID, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(BillToAddressID, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ShipToAddressID, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ShipMethodID, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CreditCardID, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CreditCardApprovalCode, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(CurrencyRateID, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(SubTotal, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(TaxAmt, 22 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Freight, 23 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(TotalDue, 24 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Comment, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(rowguid, 26 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ModifiedDate, 27 + __off, 93, __dbStmt);
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
        this.RevisionNumber = null;
    } else {
    this.RevisionNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.OrderDate = null;
    } else {
    this.OrderDate = new Timestamp(__dataIn.readLong());
    this.OrderDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DueDate = null;
    } else {
    this.DueDate = new Timestamp(__dataIn.readLong());
    this.DueDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ShipDate = null;
    } else {
    this.ShipDate = new Timestamp(__dataIn.readLong());
    this.ShipDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Status = null;
    } else {
    this.Status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.OnlineOrderFlag = null;
    } else {
    this.OnlineOrderFlag = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.SalesOrderNumber = null;
    } else {
    this.SalesOrderNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PurchaseOrderNumber = null;
    } else {
    this.PurchaseOrderNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AccountNumber = null;
    } else {
    this.AccountNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CustomerID = null;
    } else {
    this.CustomerID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ContactID = null;
    } else {
    this.ContactID = Integer.valueOf(__dataIn.readInt());
    }
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
        this.BillToAddressID = null;
    } else {
    this.BillToAddressID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ShipToAddressID = null;
    } else {
    this.ShipToAddressID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ShipMethodID = null;
    } else {
    this.ShipMethodID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CreditCardID = null;
    } else {
    this.CreditCardID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CreditCardApprovalCode = null;
    } else {
    this.CreditCardApprovalCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CurrencyRateID = null;
    } else {
    this.CurrencyRateID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SubTotal = null;
    } else {
    this.SubTotal = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.TaxAmt = null;
    } else {
    this.TaxAmt = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Freight = null;
    } else {
    this.Freight = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.TotalDue = null;
    } else {
    this.TotalDue = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Comment = null;
    } else {
    this.Comment = Text.readString(__dataIn);
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
    if (null == this.RevisionNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.RevisionNumber);
    }
    if (null == this.OrderDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OrderDate.getTime());
    __dataOut.writeInt(this.OrderDate.getNanos());
    }
    if (null == this.DueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DueDate.getTime());
    __dataOut.writeInt(this.DueDate.getNanos());
    }
    if (null == this.ShipDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ShipDate.getTime());
    __dataOut.writeInt(this.ShipDate.getNanos());
    }
    if (null == this.Status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Status);
    }
    if (null == this.OnlineOrderFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.OnlineOrderFlag);
    }
    if (null == this.SalesOrderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesOrderNumber);
    }
    if (null == this.PurchaseOrderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PurchaseOrderNumber);
    }
    if (null == this.AccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AccountNumber);
    }
    if (null == this.CustomerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CustomerID);
    }
    if (null == this.ContactID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ContactID);
    }
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
    if (null == this.BillToAddressID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.BillToAddressID);
    }
    if (null == this.ShipToAddressID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ShipToAddressID);
    }
    if (null == this.ShipMethodID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ShipMethodID);
    }
    if (null == this.CreditCardID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CreditCardID);
    }
    if (null == this.CreditCardApprovalCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CreditCardApprovalCode);
    }
    if (null == this.CurrencyRateID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CurrencyRateID);
    }
    if (null == this.SubTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.SubTotal);
    }
    if (null == this.TaxAmt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.TaxAmt);
    }
    if (null == this.Freight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Freight);
    }
    if (null == this.TotalDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.TotalDue);
    }
    if (null == this.Comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Comment);
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
    if (null == this.RevisionNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.RevisionNumber);
    }
    if (null == this.OrderDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OrderDate.getTime());
    __dataOut.writeInt(this.OrderDate.getNanos());
    }
    if (null == this.DueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DueDate.getTime());
    __dataOut.writeInt(this.DueDate.getNanos());
    }
    if (null == this.ShipDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ShipDate.getTime());
    __dataOut.writeInt(this.ShipDate.getNanos());
    }
    if (null == this.Status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Status);
    }
    if (null == this.OnlineOrderFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.OnlineOrderFlag);
    }
    if (null == this.SalesOrderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesOrderNumber);
    }
    if (null == this.PurchaseOrderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PurchaseOrderNumber);
    }
    if (null == this.AccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AccountNumber);
    }
    if (null == this.CustomerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CustomerID);
    }
    if (null == this.ContactID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ContactID);
    }
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
    if (null == this.BillToAddressID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.BillToAddressID);
    }
    if (null == this.ShipToAddressID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ShipToAddressID);
    }
    if (null == this.ShipMethodID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ShipMethodID);
    }
    if (null == this.CreditCardID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CreditCardID);
    }
    if (null == this.CreditCardApprovalCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CreditCardApprovalCode);
    }
    if (null == this.CurrencyRateID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CurrencyRateID);
    }
    if (null == this.SubTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.SubTotal);
    }
    if (null == this.TaxAmt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.TaxAmt);
    }
    if (null == this.Freight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Freight);
    }
    if (null == this.TotalDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.TotalDue);
    }
    if (null == this.Comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Comment);
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
    __sb.append(FieldFormatter.escapeAndEnclose(RevisionNumber==null?"null":"" + RevisionNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderDate==null?"null":"" + OrderDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DueDate==null?"null":"" + DueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipDate==null?"null":"" + ShipDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Status==null?"null":"" + Status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OnlineOrderFlag==null?"null":"" + OnlineOrderFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderNumber==null?"null":SalesOrderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PurchaseOrderNumber==null?"null":PurchaseOrderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AccountNumber==null?"null":AccountNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerID==null?"null":"" + CustomerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ContactID==null?"null":"" + ContactID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesPersonID==null?"null":"" + SalesPersonID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TerritoryID==null?"null":"" + TerritoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillToAddressID==null?"null":"" + BillToAddressID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipToAddressID==null?"null":"" + ShipToAddressID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipMethodID==null?"null":"" + ShipMethodID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreditCardID==null?"null":"" + CreditCardID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreditCardApprovalCode==null?"null":CreditCardApprovalCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyRateID==null?"null":"" + CurrencyRateID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SubTotal==null?"null":"" + SubTotal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxAmt==null?"null":"" + TaxAmt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Freight==null?"null":"" + Freight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TotalDue==null?"null":"" + TotalDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Comment==null?"null":Comment, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(RevisionNumber==null?"null":"" + RevisionNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderDate==null?"null":"" + OrderDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DueDate==null?"null":"" + DueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipDate==null?"null":"" + ShipDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Status==null?"null":"" + Status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OnlineOrderFlag==null?"null":"" + OnlineOrderFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderNumber==null?"null":SalesOrderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PurchaseOrderNumber==null?"null":PurchaseOrderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AccountNumber==null?"null":AccountNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerID==null?"null":"" + CustomerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ContactID==null?"null":"" + ContactID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesPersonID==null?"null":"" + SalesPersonID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TerritoryID==null?"null":"" + TerritoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillToAddressID==null?"null":"" + BillToAddressID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipToAddressID==null?"null":"" + ShipToAddressID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipMethodID==null?"null":"" + ShipMethodID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreditCardID==null?"null":"" + CreditCardID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreditCardApprovalCode==null?"null":CreditCardApprovalCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyRateID==null?"null":"" + CurrencyRateID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SubTotal==null?"null":"" + SubTotal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxAmt==null?"null":"" + TaxAmt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Freight==null?"null":"" + Freight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TotalDue==null?"null":"" + TotalDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Comment==null?"null":Comment, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RevisionNumber = null; } else {
      this.RevisionNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderDate = null; } else {
      this.OrderDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DueDate = null; } else {
      this.DueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipDate = null; } else {
      this.ShipDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Status = null; } else {
      this.Status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OnlineOrderFlag = null; } else {
      this.OnlineOrderFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesOrderNumber = null; } else {
      this.SalesOrderNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PurchaseOrderNumber = null; } else {
      this.PurchaseOrderNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AccountNumber = null; } else {
      this.AccountNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CustomerID = null; } else {
      this.CustomerID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ContactID = null; } else {
      this.ContactID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesPersonID = null; } else {
      this.SalesPersonID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TerritoryID = null; } else {
      this.TerritoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BillToAddressID = null; } else {
      this.BillToAddressID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipToAddressID = null; } else {
      this.ShipToAddressID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipMethodID = null; } else {
      this.ShipMethodID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CreditCardID = null; } else {
      this.CreditCardID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CreditCardApprovalCode = null; } else {
      this.CreditCardApprovalCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyRateID = null; } else {
      this.CurrencyRateID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SubTotal = null; } else {
      this.SubTotal = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxAmt = null; } else {
      this.TaxAmt = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Freight = null; } else {
      this.Freight = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TotalDue = null; } else {
      this.TotalDue = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Comment = null; } else {
      this.Comment = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RevisionNumber = null; } else {
      this.RevisionNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderDate = null; } else {
      this.OrderDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DueDate = null; } else {
      this.DueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipDate = null; } else {
      this.ShipDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Status = null; } else {
      this.Status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OnlineOrderFlag = null; } else {
      this.OnlineOrderFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesOrderNumber = null; } else {
      this.SalesOrderNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PurchaseOrderNumber = null; } else {
      this.PurchaseOrderNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AccountNumber = null; } else {
      this.AccountNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CustomerID = null; } else {
      this.CustomerID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ContactID = null; } else {
      this.ContactID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesPersonID = null; } else {
      this.SalesPersonID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TerritoryID = null; } else {
      this.TerritoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BillToAddressID = null; } else {
      this.BillToAddressID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipToAddressID = null; } else {
      this.ShipToAddressID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipMethodID = null; } else {
      this.ShipMethodID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CreditCardID = null; } else {
      this.CreditCardID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CreditCardApprovalCode = null; } else {
      this.CreditCardApprovalCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyRateID = null; } else {
      this.CurrencyRateID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SubTotal = null; } else {
      this.SubTotal = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxAmt = null; } else {
      this.TaxAmt = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Freight = null; } else {
      this.Freight = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TotalDue = null; } else {
      this.TotalDue = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Comment = null; } else {
      this.Comment = __cur_str;
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
    salesorderheader o = (salesorderheader) super.clone();
    o.OrderDate = (o.OrderDate != null) ? (java.sql.Timestamp) o.OrderDate.clone() : null;
    o.DueDate = (o.DueDate != null) ? (java.sql.Timestamp) o.DueDate.clone() : null;
    o.ShipDate = (o.ShipDate != null) ? (java.sql.Timestamp) o.ShipDate.clone() : null;
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
    return o;
  }

  public void clone0(salesorderheader o) throws CloneNotSupportedException {
    o.OrderDate = (o.OrderDate != null) ? (java.sql.Timestamp) o.OrderDate.clone() : null;
    o.DueDate = (o.DueDate != null) ? (java.sql.Timestamp) o.DueDate.clone() : null;
    o.ShipDate = (o.ShipDate != null) ? (java.sql.Timestamp) o.ShipDate.clone() : null;
    o.rowguid = (o.rowguid != null) ? new BytesWritable(Arrays.copyOf(rowguid.getBytes(), rowguid.getLength())) : null;
    o.ModifiedDate = (o.ModifiedDate != null) ? (java.sql.Timestamp) o.ModifiedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("SalesOrderID", this.SalesOrderID);
    __sqoop$field_map.put("RevisionNumber", this.RevisionNumber);
    __sqoop$field_map.put("OrderDate", this.OrderDate);
    __sqoop$field_map.put("DueDate", this.DueDate);
    __sqoop$field_map.put("ShipDate", this.ShipDate);
    __sqoop$field_map.put("Status", this.Status);
    __sqoop$field_map.put("OnlineOrderFlag", this.OnlineOrderFlag);
    __sqoop$field_map.put("SalesOrderNumber", this.SalesOrderNumber);
    __sqoop$field_map.put("PurchaseOrderNumber", this.PurchaseOrderNumber);
    __sqoop$field_map.put("AccountNumber", this.AccountNumber);
    __sqoop$field_map.put("CustomerID", this.CustomerID);
    __sqoop$field_map.put("ContactID", this.ContactID);
    __sqoop$field_map.put("SalesPersonID", this.SalesPersonID);
    __sqoop$field_map.put("TerritoryID", this.TerritoryID);
    __sqoop$field_map.put("BillToAddressID", this.BillToAddressID);
    __sqoop$field_map.put("ShipToAddressID", this.ShipToAddressID);
    __sqoop$field_map.put("ShipMethodID", this.ShipMethodID);
    __sqoop$field_map.put("CreditCardID", this.CreditCardID);
    __sqoop$field_map.put("CreditCardApprovalCode", this.CreditCardApprovalCode);
    __sqoop$field_map.put("CurrencyRateID", this.CurrencyRateID);
    __sqoop$field_map.put("SubTotal", this.SubTotal);
    __sqoop$field_map.put("TaxAmt", this.TaxAmt);
    __sqoop$field_map.put("Freight", this.Freight);
    __sqoop$field_map.put("TotalDue", this.TotalDue);
    __sqoop$field_map.put("Comment", this.Comment);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("SalesOrderID", this.SalesOrderID);
    __sqoop$field_map.put("RevisionNumber", this.RevisionNumber);
    __sqoop$field_map.put("OrderDate", this.OrderDate);
    __sqoop$field_map.put("DueDate", this.DueDate);
    __sqoop$field_map.put("ShipDate", this.ShipDate);
    __sqoop$field_map.put("Status", this.Status);
    __sqoop$field_map.put("OnlineOrderFlag", this.OnlineOrderFlag);
    __sqoop$field_map.put("SalesOrderNumber", this.SalesOrderNumber);
    __sqoop$field_map.put("PurchaseOrderNumber", this.PurchaseOrderNumber);
    __sqoop$field_map.put("AccountNumber", this.AccountNumber);
    __sqoop$field_map.put("CustomerID", this.CustomerID);
    __sqoop$field_map.put("ContactID", this.ContactID);
    __sqoop$field_map.put("SalesPersonID", this.SalesPersonID);
    __sqoop$field_map.put("TerritoryID", this.TerritoryID);
    __sqoop$field_map.put("BillToAddressID", this.BillToAddressID);
    __sqoop$field_map.put("ShipToAddressID", this.ShipToAddressID);
    __sqoop$field_map.put("ShipMethodID", this.ShipMethodID);
    __sqoop$field_map.put("CreditCardID", this.CreditCardID);
    __sqoop$field_map.put("CreditCardApprovalCode", this.CreditCardApprovalCode);
    __sqoop$field_map.put("CurrencyRateID", this.CurrencyRateID);
    __sqoop$field_map.put("SubTotal", this.SubTotal);
    __sqoop$field_map.put("TaxAmt", this.TaxAmt);
    __sqoop$field_map.put("Freight", this.Freight);
    __sqoop$field_map.put("TotalDue", this.TotalDue);
    __sqoop$field_map.put("Comment", this.Comment);
    __sqoop$field_map.put("rowguid", this.rowguid);
    __sqoop$field_map.put("ModifiedDate", this.ModifiedDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("SalesOrderID".equals(__fieldName)) {
      this.SalesOrderID = (Integer) __fieldVal;
    }
    else    if ("RevisionNumber".equals(__fieldName)) {
      this.RevisionNumber = (Integer) __fieldVal;
    }
    else    if ("OrderDate".equals(__fieldName)) {
      this.OrderDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("DueDate".equals(__fieldName)) {
      this.DueDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("ShipDate".equals(__fieldName)) {
      this.ShipDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("Status".equals(__fieldName)) {
      this.Status = (Integer) __fieldVal;
    }
    else    if ("OnlineOrderFlag".equals(__fieldName)) {
      this.OnlineOrderFlag = (Boolean) __fieldVal;
    }
    else    if ("SalesOrderNumber".equals(__fieldName)) {
      this.SalesOrderNumber = (String) __fieldVal;
    }
    else    if ("PurchaseOrderNumber".equals(__fieldName)) {
      this.PurchaseOrderNumber = (String) __fieldVal;
    }
    else    if ("AccountNumber".equals(__fieldName)) {
      this.AccountNumber = (String) __fieldVal;
    }
    else    if ("CustomerID".equals(__fieldName)) {
      this.CustomerID = (Integer) __fieldVal;
    }
    else    if ("ContactID".equals(__fieldName)) {
      this.ContactID = (Integer) __fieldVal;
    }
    else    if ("SalesPersonID".equals(__fieldName)) {
      this.SalesPersonID = (Integer) __fieldVal;
    }
    else    if ("TerritoryID".equals(__fieldName)) {
      this.TerritoryID = (Integer) __fieldVal;
    }
    else    if ("BillToAddressID".equals(__fieldName)) {
      this.BillToAddressID = (Integer) __fieldVal;
    }
    else    if ("ShipToAddressID".equals(__fieldName)) {
      this.ShipToAddressID = (Integer) __fieldVal;
    }
    else    if ("ShipMethodID".equals(__fieldName)) {
      this.ShipMethodID = (Integer) __fieldVal;
    }
    else    if ("CreditCardID".equals(__fieldName)) {
      this.CreditCardID = (Integer) __fieldVal;
    }
    else    if ("CreditCardApprovalCode".equals(__fieldName)) {
      this.CreditCardApprovalCode = (String) __fieldVal;
    }
    else    if ("CurrencyRateID".equals(__fieldName)) {
      this.CurrencyRateID = (Integer) __fieldVal;
    }
    else    if ("SubTotal".equals(__fieldName)) {
      this.SubTotal = (Double) __fieldVal;
    }
    else    if ("TaxAmt".equals(__fieldName)) {
      this.TaxAmt = (Double) __fieldVal;
    }
    else    if ("Freight".equals(__fieldName)) {
      this.Freight = (Double) __fieldVal;
    }
    else    if ("TotalDue".equals(__fieldName)) {
      this.TotalDue = (Double) __fieldVal;
    }
    else    if ("Comment".equals(__fieldName)) {
      this.Comment = (String) __fieldVal;
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
    else    if ("RevisionNumber".equals(__fieldName)) {
      this.RevisionNumber = (Integer) __fieldVal;
      return true;
    }
    else    if ("OrderDate".equals(__fieldName)) {
      this.OrderDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("DueDate".equals(__fieldName)) {
      this.DueDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("ShipDate".equals(__fieldName)) {
      this.ShipDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("Status".equals(__fieldName)) {
      this.Status = (Integer) __fieldVal;
      return true;
    }
    else    if ("OnlineOrderFlag".equals(__fieldName)) {
      this.OnlineOrderFlag = (Boolean) __fieldVal;
      return true;
    }
    else    if ("SalesOrderNumber".equals(__fieldName)) {
      this.SalesOrderNumber = (String) __fieldVal;
      return true;
    }
    else    if ("PurchaseOrderNumber".equals(__fieldName)) {
      this.PurchaseOrderNumber = (String) __fieldVal;
      return true;
    }
    else    if ("AccountNumber".equals(__fieldName)) {
      this.AccountNumber = (String) __fieldVal;
      return true;
    }
    else    if ("CustomerID".equals(__fieldName)) {
      this.CustomerID = (Integer) __fieldVal;
      return true;
    }
    else    if ("ContactID".equals(__fieldName)) {
      this.ContactID = (Integer) __fieldVal;
      return true;
    }
    else    if ("SalesPersonID".equals(__fieldName)) {
      this.SalesPersonID = (Integer) __fieldVal;
      return true;
    }
    else    if ("TerritoryID".equals(__fieldName)) {
      this.TerritoryID = (Integer) __fieldVal;
      return true;
    }
    else    if ("BillToAddressID".equals(__fieldName)) {
      this.BillToAddressID = (Integer) __fieldVal;
      return true;
    }
    else    if ("ShipToAddressID".equals(__fieldName)) {
      this.ShipToAddressID = (Integer) __fieldVal;
      return true;
    }
    else    if ("ShipMethodID".equals(__fieldName)) {
      this.ShipMethodID = (Integer) __fieldVal;
      return true;
    }
    else    if ("CreditCardID".equals(__fieldName)) {
      this.CreditCardID = (Integer) __fieldVal;
      return true;
    }
    else    if ("CreditCardApprovalCode".equals(__fieldName)) {
      this.CreditCardApprovalCode = (String) __fieldVal;
      return true;
    }
    else    if ("CurrencyRateID".equals(__fieldName)) {
      this.CurrencyRateID = (Integer) __fieldVal;
      return true;
    }
    else    if ("SubTotal".equals(__fieldName)) {
      this.SubTotal = (Double) __fieldVal;
      return true;
    }
    else    if ("TaxAmt".equals(__fieldName)) {
      this.TaxAmt = (Double) __fieldVal;
      return true;
    }
    else    if ("Freight".equals(__fieldName)) {
      this.Freight = (Double) __fieldVal;
      return true;
    }
    else    if ("TotalDue".equals(__fieldName)) {
      this.TotalDue = (Double) __fieldVal;
      return true;
    }
    else    if ("Comment".equals(__fieldName)) {
      this.Comment = (String) __fieldVal;
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
