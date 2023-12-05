package top.nefeli.wallet.bill.widget

import android.view.View
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import top.nefeli.wallet.bill.R

class BillViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var note: TextView
    var merchant: TextView
    var amount: TextView
    var date: TextView
    var time: TextView

    init {
        note = itemView.findViewById<View>(R.id.list_item_bill_note) as TextView
        merchant = itemView.findViewById<View>(R.id.list_item_bill_merchant) as TextView
        amount = itemView.findViewById<View>(R.id.list_item_bill_amount) as TextView
        date = itemView.findViewById<View>(R.id.list_item_bill_date) as TextView
        time = itemView.findViewById<View>(R.id.list_item_bill_time) as TextView
    }
}
