package top.nefeli.wallet.bill.base

import android.app.Application
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel{
    private var application: Application?
    constructor()
    {
        this.application = null
    }
    constructor(application: Application)
    {
        this.application = application
    }
}