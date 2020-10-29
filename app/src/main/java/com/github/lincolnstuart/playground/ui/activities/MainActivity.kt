package com.github.lincolnstuart.playground.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.lincolnstuart.playground.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
    }

    private fun initComponents(){
        bt_main_tab_layout.setOnClickListener {
            startActivity(Intent(this, TabLayoutActivity::class.java))
        }
    }
}