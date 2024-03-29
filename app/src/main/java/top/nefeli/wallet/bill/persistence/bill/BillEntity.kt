package top.nefeli.wallet.bill.persistence.bill

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Bill")                     // 账单
data class BillEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "Year")
    val year: Int,                              // 记录交易发生的日期
    @ColumnInfo(name = "Month")
    val month: String,                          // 记录交易发生的日期
    @ColumnInfo(name = "Day")
    val day: String,                            // 记录交易发生的日期
    @ColumnInfo(name = "Time")
    val time: String,                           // 记录交易发生的日期
    @ColumnInfo(name = "Amount")
    val amount: Double,                         // 记录交易的金额
    @ColumnInfo(name = "Merchant")
    val merchant: Long,                         // 记录交易的商户信息
    @ColumnInfo(name = "Category")
    val category: Long,                         // 指明交易的主要类别
    @ColumnInfo(name = "Tag")
    val tag: String,                            // 标记交易的附加特征
    @ColumnInfo(name = "Account")
    val account: Long,                          // 账户
    @ColumnInfo(name = "Note")
    val note: String,                           // 用户可以添加额外备注或描述信息


//    @ColumnInfo(name = "Status")
//    val status: String, // 标识交易的状态
//    @ColumnInfo(name = "Location")
//    val location: String,  // 记录交易发生的地点信息
//    @ColumnInfo(name = "Attachment")
//    val attachment: String, // 提供附件或链接，关联电子收据或发票
//    @ColumnInfo(name = "ExchangeRate")
//    val exchangeRate: Double, // 对于多种货币，记录相关汇率信息
//    @ColumnInfo(name = "")
//    val recurringInfo: String, // 记录定期性支出的周期和频率
//    @ColumnInfo(name = "")
//    val contactInfo: String, // 对于涉及他人的交易，记录相关的联系人信息
//    @ColumnInfo(name = "")
//    val projectOrNumber: String, // 关联交易与特定项目或编号
)
