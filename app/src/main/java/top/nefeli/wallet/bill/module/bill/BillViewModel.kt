package top.nefeli.wallet.bill.module.bill

import android.app.Application
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import top.nefeli.wallet.bill.R
import top.nefeli.wallet.bill.base.BaseViewModel
import top.nefeli.wallet.bill.persistence.walletBill.WalletBillDAO
import top.nefeli.wallet.bill.persistence.walletBill.WalletBillDataBase
import top.nefeli.wallet.bill.persistence.walletBill.WalletBillEntity
import top.nefeli.wallet.bill.widget.BillAdapter

class BillViewModel(application: Application): BaseViewModel() {

    var root : View? = TODO()
    private val walletBillDao: WalletBillDAO =
        WalletBillDataBase.getInstance(application).WalletBillDAO()

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    val text: LiveData<String> = _text

    private val _bill = MutableLiveData<List<WalletBillEntity>>().apply {
        value = walletBillDao.getAll()
    }
    val bill: LiveData<List<WalletBillEntity>> = _bill

    override fun onCleared() {
        super.onCleared()
        root = null
    }
}