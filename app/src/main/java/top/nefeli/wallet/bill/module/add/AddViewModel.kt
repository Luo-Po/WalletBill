package top.nefeli.wallet.bill.module.add

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import top.nefeli.wallet.bill.base.BaseViewModel

class AddViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is add Fragment"
    }
    val text: LiveData<String> = _text
}