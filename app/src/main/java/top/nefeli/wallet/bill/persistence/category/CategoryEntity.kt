package top.nefeli.wallet.bill.persistence.category

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "BillCategory")
data class CategoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "PrimaryCategory")
    val primaryCategory: String,  // 指明交易的主要类别
    @ColumnInfo(name = "SecondaryCategory")
    val secondaryCategory: String,  // 指明交易的次要类别
)