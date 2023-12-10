package top.nefeli.wallet.bill.persistence.account

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author Nefeli
 * @param account
 * @param classify
 * @param balance
 * @param state -1 账户已注销  0 账户归档  1 正常使用
 */
@Entity(tableName = "Account")                  // 账户
class AccountEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long=0L,
    @ColumnInfo(name = "Account")               // 账户名称
    val account: String,
    @ColumnInfo(name = "Classify")              // 账户分类
    val classify: String,
    @ColumnInfo(name = "Balance")               // 账户余额
    val balance: String,
    /**
     * -1 账户注销（不使用）
     * 0 归档（展示但是不使用）
     * 1 正常使用
     */
    @ColumnInfo(name = "State")                 // 账户状态
    val state: Int
)