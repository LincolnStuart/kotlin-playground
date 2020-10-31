package com.github.lincolnstuart.playground.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.github.lincolnstuart.playground.R
import com.github.lincolnstuart.playground.models.Example
import com.github.lincolnstuart.playground.viewmodels.TabViewModel
import kotlinx.android.synthetic.main.fragment_tab1.*

class Tab1Fragment : Fragment() {


    private lateinit var viewModel: TabViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tab1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents()
    }

    private fun initComponents() {
        activity?.let {
            viewModel = ViewModelProvider(it).get(TabViewModel::class.java)
        }
        bt_tab1_fragment_ok.setOnClickListener {
            viewModel.onExampleChanged.postValue(fillTabObject())
        }
    }

    private fun fillTabObject(): Example {
        val value1 = til_tab1_fragment_value1.editText?.text?.toString()
        val value2 = til_tab1_fragment_value2.editText?.text?.toString()
        return Example(value1 ?: "", value2 ?: "")
    }
}