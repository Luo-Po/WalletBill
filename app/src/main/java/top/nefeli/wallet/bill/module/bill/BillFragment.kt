package top.nefeli.wallet.bill.module.bill

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import top.nefeli.wallet.bill.base.BaseFragment
import top.nefeli.wallet.bill.databinding.FragmentBillBinding
import top.nefeli.wallet.bill.widget.BillAdapter

class BillFragment : BaseFragment() {

    private var _binding: FragmentBillBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val billViewModel: BillViewModel by viewModels()

        _binding = FragmentBillBinding.inflate(inflater, container, false)

        val root: View = binding.root
        billViewModel?.let {
            it.root = root
        }

        val listView: RecyclerView = binding.listviewBill as? RecyclerView ?: return root
        billViewModel.bill.observe(viewLifecycleOwner) {
            listView.adapter = BillAdapter(it)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}