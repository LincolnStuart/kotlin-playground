package com.github.lincolnstuart.playground.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.lincolnstuart.playground.R
import com.github.lincolnstuart.playground.ui.fragments.Tab1Fragment
import com.github.lincolnstuart.playground.ui.fragments.Tab2Fragment
import com.github.lincolnstuart.playground.viewmodels.TabViewModel
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_tab_layout.*

class TabLayoutActivity : AppCompatActivity(), TabLayout.OnTabSelectedListener {

    private lateinit var viewModel: TabViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)
        initComponents()
    }

    private fun initComponents() {
        viewModel = ViewModelProvider(this).get(TabViewModel::class.java)
        viewModel.onTabObjectChanged.observe(this, {
            val tab = tl_tab_layout_test.getTabAt(1)
            tab?.select()
        })
        replaceContainer(Tab1Fragment())
        tl_tab_layout_test.addOnTabSelectedListener(this)
    }

    private fun replaceContainer(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fl_tab_layout_container, fragment)
        transaction.commit()
    }

    override fun onTabSelected(tab: TabLayout.Tab?) {
        when (tab?.position) {
            0 -> {
                replaceContainer(Tab1Fragment())
            }
            1 -> {
                replaceContainer(Tab2Fragment())
            }
        }
    }

    override fun onTabUnselected(tab: TabLayout.Tab?) {}

    override fun onTabReselected(tab: TabLayout.Tab?) {}
}