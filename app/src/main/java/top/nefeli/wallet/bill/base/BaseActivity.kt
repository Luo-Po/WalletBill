package top.nefeli.wallet.bill.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        // 这里可以添加页面打点
    }

    override fun onStop() {
        super.onStop()
        // 这里可以添加页面打点
    }
}