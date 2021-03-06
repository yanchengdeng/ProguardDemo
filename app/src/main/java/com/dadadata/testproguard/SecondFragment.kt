package com.dadadata.testproguard

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.dadadata.data.EventDataOne
import com.dadadata.service.ServiceActivity
import com.dadadata.testproguard.databinding.FragmentSecondBinding
import org.greenrobot.eventbus.EventBus

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)

            EventBus.getDefault().post(EventDataOne("哈哈哈"))
        }

        binding.buttonBuildType.setOnClickListener {
            startActivity(Intent(requireActivity(),ServiceActivity::class.java))

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}