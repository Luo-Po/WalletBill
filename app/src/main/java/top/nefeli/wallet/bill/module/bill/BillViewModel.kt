package top.nefeli.wallet.bill.module.bill

import android.app.Application
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import top.nefeli.wallet.bill.base.BaseViewModel
import top.nefeli.wallet.bill.persistence.WalletBillDataBase
import top.nefeli.wallet.bill.persistence.bill.BillDAO
import top.nefeli.wallet.bill.persistence.bill.BillEntity

class BillViewModel(application: Application): BaseViewModel() {

    var root : View? = null
    private val billDao: BillDAO =
        WalletBillDataBase.getInstance(application).BillDAO()

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    val text: LiveData<String> = _text

    private val _bill = MutableLiveData<List<BillEntity>>().apply {
        value = billDao.getAll()
    }
    val bill: LiveData<List<BillEntity>> = _bill

    override fun onCleared() {
        super.onCleared()
        root = null
    }
}