package top.nefeli.wallet.bill.persistence.category

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CategoryDAO {
    @Insert
    fun insert(category: CategoryEntity)
    @Delete
    fun delete(category: CategoryEntity)
    @Update
    fun update(category: CategoryEntity)
    @Query("SELECT * FROM Category")
    fun getAll(): List<CategoryEntity>
    @Query("SELECT * FROM Category " +
            "WHERE id IN (:id)")
    fun getByID(id: Long): List<CategoryEntity>
    @Query("SELECT * FROM Category " +
            "WHERE PrimaryCategory IN (:pCategory)")
    fun getBypCategory(pCategory: String): List<CategoryEntity>
    @Query("SELECT * FROM Category " +
            "WHERE SecondaryCategory IN (:sCategory)")
    fun getBysCategory(sCategory: String): List<CategoryEntity>
}