package top.nefeli.wallet.bill.persistence.walletBill

import androidx.room.Dao
import androidx.room.Query

@Dao
interface WalletBillDAO {
    @Query("SELECT * FROM WalletBill")
    fun getAll(): List<WalletBillEntity>
}