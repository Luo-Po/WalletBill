package top.nefeli.wallet.bill.module.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import top.nefeli.wallet.bill.base.BaseFragment
import top.nefeli.wallet.bill.databinding.FragmentAddBillBinding

class AddBillFragment : BaseFragment() {

    private var _binding: FragmentAddBillBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val addViewModel: AddBillViewModel by viewModels()

        _binding = FragmentAddBillBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView1
        addViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}