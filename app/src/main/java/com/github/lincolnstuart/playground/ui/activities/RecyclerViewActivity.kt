package com.github.lincolnstuart.playground.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.lincolnstuart.playground.R
import com.github.lincolnstuart.playground.models.Example
import com.github.lincolnstuart.playground.ui.adapters.RcaAdapter
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val examples = fillExampleList()
        rc_item_list.apply {
            layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
            adapter = RcaAdapter(examples)
        }
    }

    private fun fillExampleList(): List<Example> {
        return listOf<Example>(
            Example("Lincoln", "Mestre Splinter", 9),
            Example("Felipe", "Harry Potter"),
            Example("Eduardo", "Jimmy Neutron"),
            Example("Thiago", "Gummy", 8),
            Example("Marcelio", "Galo",2),
            Example("Junior", "Ney"),
            Example("João Gabriel", "Silvio Santos"),
            Example("Eric", "Pablo", 5)
        )
    }

}