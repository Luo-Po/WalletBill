package top.nefeli.wallet.bill.persistence.account

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface AccountDAO {
    @Insert
    fun insert(account: AccountEntity)
    @Delete
    fun delete(account: AccountEntity)
    @Update
    fun update(account: AccountEntity)
    @Query("SELECT * FROM Account")
    fun getAll(): List<AccountEntity>
    @Query("SELECT * FROM Account " +
            "WHERE id IN (:id)")
    fun findByID(id: Long): List<AccountEntity>
    @Query("SELECT * FROM Account " +
            "WHERE Account IN (:account)")
    fun findByAccount(account: String): List<AccountEntity>
    @Query("SELECT * FROM Account " +
            "WHERE Classify IN (:classify)")
    fun findByClassify(classify: Int): List<AccountEntity>
}