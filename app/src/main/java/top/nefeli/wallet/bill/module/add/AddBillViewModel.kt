package top.nefeli.wallet.bill.module.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import top.nefeli.wallet.bill.base.BaseViewModel

class AddBillViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
//        TODO("重新处理add")
        value = "This is add Fragment"
    }
    val text: LiveData<String> = _text
}