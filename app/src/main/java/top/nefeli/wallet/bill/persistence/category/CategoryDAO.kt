package top.nefeli.wallet.bill.persistence.category

import androidx.room.Dao
import androidx.room.Query
import top.nefeli.wallet.bill.persistence.category.CategoryEntity

@Dao
interface CategoryDAO {
    @Query("SELECT * FROM BillCategory")
    fun getAll(): List<CategoryEntity>
}