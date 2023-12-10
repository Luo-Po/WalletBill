package top.nefeli.wallet.bill.persistence.bill

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BillDAO {
    @Insert
    fun insert(bill: BillEntity)
    @Delete
    fun delete(bill: BillEntity)
    @Update
    fun update(bill: BillEntity)
    @Query("SELECT * FROM Bill")
    fun getAll(): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE id IN (:id)")
    fun findByID(id: Long): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Year IN (:year)")
    fun findByYear(year: Int): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Year IN (:year) AND Month IN (:month)")
    fun findByMonth(year: Int,month: Int): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Year IN (:year) AND Month IN (:month) AND Day IN (:day)")
    fun findByDay(year: Int,month: Int,day: Int): List<BillEntity>
    @Query("SELECT * FROM Bill "+
            "WHERE Merchant IN (:merchant)")
    fun findByMerchant(merchant: Long): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Merchant IN (:merchant) AND Year IN (:year) AND Month IN (:month)")
    fun findByMerchant(merchant: Long,year: Int,month: Int): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Merchant IN (:merchant) AND Year IN (:year) AND Month IN (:month) AND Day IN (:day)")
    fun findByMerchant(merchant: Long,year: Int,month: Int,day: Int): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Category IN (:category)")
    fun findByCategory(category: Long): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Category IN (:category) AND Year IN (:year) AND Month IN (:month)")
    fun findByCategory(category: Long,year: Int,month: Int): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Category IN (:category) AND Year IN (:year) AND Month IN (:month) AND Day IN (:day)")
    fun findByCategory(category: Long,year: Int,month: Int,day: Int): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Account IN (:account)")
    fun findByAccount(account: Long): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Account IN (:account) AND Year IN (:year) AND Month IN (:month)")
    fun findByAccount(account: Long,year: Int,month: Int): List<BillEntity>
    @Query("SELECT * FROM Bill " +
            "WHERE Account IN (:account) AND Year IN (:year) AND Month IN (:month) AND Day IN (:day)")
    fun findByAccount(account: Long,year: Int,month: Int,day: Int): List<BillEntity>
}