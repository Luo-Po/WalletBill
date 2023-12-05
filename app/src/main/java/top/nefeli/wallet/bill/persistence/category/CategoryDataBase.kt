package top.nefeli.wallet.bill.persistence.category

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import top.nefeli.wallet.bill.util.Converters

@Database(entities = [CategoryEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class CategoryDataBase : RoomDatabase() {
    abstract fun CategoryDAO(): CategoryDAO
    companion object {
        private var instance: CategoryDataBase? = null
        fun getInstance(context: Context): CategoryDataBase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    CategoryDataBase::class.java,
                    "BillCategory.db" //数据库名称
                )
//                    .allowMainThreadQueries()   //主线程中执行
                    .fallbackToDestructiveMigration() //数据稳定前, 重建.
//                    .addMigrations(MIGRATION_1_2) //版本升级
                    .build()
            }
            return instance!!
        }
    }
}