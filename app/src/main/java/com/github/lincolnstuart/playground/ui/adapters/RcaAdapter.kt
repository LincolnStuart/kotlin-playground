package com.github.lincolnstuart.playground.ui.adapters

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.github.lincolnstuart.playground.R
import com.github.lincolnstuart.playground.models.Example
import kotlinx.android.synthetic.main.item_list.view.*

class RcaAdapter(val examples: List<Example>) : RecyclerView.Adapter<RcaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RcaAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RcaAdapter.ViewHolder, position: Int) {
        holder.bind(examples[position])
    }

    override fun getItemCount(): Int {
        return examples.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(example: Example) = with(itemView){
            if(example.value3 > 0){
                tv_item_list_value.text = "${example.value3}"
                iv_item_list_bg_int.visibility = View.VISIBLE
                tv_item_list_value.visibility = View.VISIBLE
            } else {
                tv_item_list_value.text = ""
                iv_item_list_bg_int.visibility = View.GONE
                tv_item_list_value.visibility = View.GONE
            }
            tv_item_list_name.text = example.value1
            tv_item_list_nickname.text = example.value2
        }
    }
}