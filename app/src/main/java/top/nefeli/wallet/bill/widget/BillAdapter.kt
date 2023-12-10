package top.nefeli.wallet.bill.widget

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.recyclerview.widget.RecyclerView
import top.nefeli.wallet.bill.R
import top.nefeli.wallet.bill.persistence.bill.BillEntity


////每个子项被滚动到屏幕内的时候会被调用
//fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//    val Bill = getItem(position) //得到当前项的 Bill 实例
//    //为每一个子项加载设定的布局
//    val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_bill, parent, false)
//    //分别获取 image view 和 textview 的实例
//    val noteView = view.findViewById<TextView>(R.id.list_item_bill_note)
//    val merchentView = view.findViewById<TextView>(R.id.list_item_bill_merchant)
//    val amountView = view.findViewById<TextView>(R.id.list_item_bill_amount)
//    val dateView = view.findViewById<TextView>(R.id.list_item_bill_date)
//    val timeView = view.findViewById<TextView>(R.id.list_item_bill_time)
//    // 设置要显示的文字
//    noteView.text=Bill?.note;
//    merchentView.text=Bill?.merchant;
//    amountView.text= Bill?.amount.toString();
//    amountView.setTextColor(if (Bill?.amount!! >= 0) Color.Green.toArgb() else Color.Red.toArgb())
//    dateView.text=Bill?.date;
//    timeView.text=Bill?.time;
////        Billimage.setImageResource(Bill.getImageID())
//    return view
//
//}


//用于将上下文、listview 子项布局的 id 和数据都传递过来
class BillAdapter(itemdata : List<BillEntity>): RecyclerView.Adapter<BillViewHolder>() {

    private val litemdata:List<BillEntity>
    init {
        litemdata = itemdata
    }

    //静态内部类， 每个条目对应的布局
    internal class ViewHolder(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var note: TextView
        private var merchant: TextView
        private var amount: TextView
        private var date: TextView
        private var time: TextView
        init {
            note = itemView.findViewById<View>(R.id.list_item_bill_note) as TextView
            merchant = itemView.findViewById<View>(R.id.list_item_bill_merchant) as TextView
            amount = itemView.findViewById<View>(R.id.list_item_bill_amount) as TextView
            date = itemView.findViewById<View>(R.id.list_item_bill_date) as TextView
            time = itemView.findViewById<View>(R.id.list_item_bill_time) as TextView
        }
    }
    //用于创建ViewHolder实例,并把加载的布局传入到ViewHolder的构造函数去
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BillViewHolder {
        val view = View.inflate(parent.context, R.layout.list_item_bill, null)
        val billViewHoder = BillViewHolder(view)
        return billViewHoder
    }

    //返回RecyclerView的子项数目
    override fun onBindViewHolder(holder: BillViewHolder, position: Int) {
        val itemdata = litemdata[position]
        holder.note.text = itemdata.note
        holder.merchant.text = itemdata.merchant.toString()
        holder.amount.setText(if(itemdata.amount>=0) Color.Green.toArgb() else Color.Red.toArgb())
        holder.amount.text = itemdata.amount.toString()
        holder.date.text = "${itemdata.year}\\${itemdata.month}\\${itemdata.day}"
        holder.time.text = itemdata.time
    }

    //是用于对子项的数据进行赋值,会在每个子项被滚动到屏幕内时执行。position得到当前项的实例
    override fun getItemCount(): Int {
        return litemdata.size
    }
}