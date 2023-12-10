package top.nefeli.wallet.bill.persistence.category

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Category")                 // 账单分类
data class CategoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "PrimaryCategory")       // 指明交易的主要类别
    val primaryCategory: String,
    @ColumnInfo(name = "SecondaryCategory")     // 指明交易的次要类别
    val secondaryCategory: String,
)