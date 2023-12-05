package top.nefeli.wallet.bill.module.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import top.nefeli.wallet.bill.base.BaseFragment
import top.nefeli.wallet.bill.databinding.FragmentAddBinding

class AddFragment : BaseFragment() {

    private var _binding: FragmentAddBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val addViewModel: AddViewModel by viewModels()

        _binding = FragmentAddBinding.inflate(inflater, container, false)
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