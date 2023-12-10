package top.nefeli.wallet.bill.persistence.merchant

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Merchant")                 // 商家
data class MerchantEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long =0L,
    @ColumnInfo(name = "Merchant")              // 商家
    val merchant: String,
    @ColumnInfo(name = "Consume")               // 余额
    val consume: String
)
