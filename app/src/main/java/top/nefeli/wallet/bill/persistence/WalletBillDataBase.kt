package top.nefeli.wallet.bill.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import top.nefeli.wallet.bill.persistence.account.AccountDAO
import top.nefeli.wallet.bill.persistence.account.AccountEntity
import top.nefeli.wallet.bill.persistence.bill.BillDAO
import top.nefeli.wallet.bill.persistence.bill.BillEntity
import top.nefeli.wallet.bill.persistence.category.CategoryDAO
import top.nefeli.wallet.bill.persistence.category.CategoryEntity
import top.nefeli.wallet.bill.persistence.merchant.MerchantDAO
import top.nefeli.wallet.bill.persistence.merchant.MerchantEntity
import top.nefeli.wallet.bill.util.Converters

@Database(entities = [BillEntity::class,CategoryEntity::class,AccountEntity::class, MerchantEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class WalletBillDataBase : RoomDatabase() {
    abstract fun BillDAO(): BillDAO
    abstract fun CategoryDAO(): CategoryDAO
    abstract fun AccountDAO(): AccountDAO
    abstract fun MerchantDAO(): MerchantDAO
    companion object {
        private var instance: WalletBillDataBase? = null
        fun getInstance(context: Context): WalletBillDataBase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    WalletBillDataBase::class.java,
                    "WalletBill.db" //数据库名称
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