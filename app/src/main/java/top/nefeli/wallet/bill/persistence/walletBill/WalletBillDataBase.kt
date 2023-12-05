package top.nefeli.wallet.bill.persistence.walletBill

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import top.nefeli.wallet.bill.util.Converters

@Database(entities = [WalletBillEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class WalletBillDataBase : RoomDatabase() {
    abstract fun WalletBillDAO(): WalletBillDAO
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