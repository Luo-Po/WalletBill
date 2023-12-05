package top.nefeli.wallet.bill.module.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import top.nefeli.wallet.bill.base.BaseViewModel

class SettingsViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Settings Fragment"
    }
    val text: LiveData<String> = _text
}