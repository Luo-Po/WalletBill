package top.nefeli.wallet.bill.persistence.merchant

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface MerchantDAO {
    @Insert
    fun insert(merchant: MerchantEntity)
    @Delete
    fun delete(merchant: MerchantEntity)
    @Update
    fun update(merchant: MerchantEntity)
    @Query("SELECT * FROM Merchant")
    fun getAll(): List<MerchantEntity>
    @Query("SELECT * FROM Merchant " +
            "WHERE id IN (:id)")
    fun getByID(id: Long): List<MerchantEntity>
    @Query("SELECT * FROM Merchant " +
            "WHERE Merchant IN (:merchant)")
    fun getByMerchant(merchant: String): List<MerchantEntity>
    @Query("SELECT * FROM Merchant " +
            "WHERE Consume IN (:consume)")
    fun getByConsume(consume: String): List<MerchantEntity>
}