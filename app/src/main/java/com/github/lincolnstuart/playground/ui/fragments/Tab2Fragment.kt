package com.github.lincolnstuart.playground.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.github.lincolnstuart.playground.R
import com.github.lincolnstuart.playground.viewmodels.TabViewModel
import kotlinx.android.synthetic.main.fragment_tab2.*

class Tab2Fragment : Fragment() {

    private lateinit var viewModel: TabViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tab2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents()
    }

    private fun initComponents() {
        activity?.let {
            viewModel = ViewModelProvider(it).get(TabViewModel::class.java)
            viewModel.onExampleChanged.observe(it, { tabObject ->
                tabObject?.let {to ->
                    tv_tab2_fragment_response?.text = to.toString()
                }
            })
        }
    }
}