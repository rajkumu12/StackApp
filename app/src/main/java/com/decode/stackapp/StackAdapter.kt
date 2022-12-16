package com.decode.stackapp

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.decode.stackapp.databinding.StackItemBinding


class StackAdapter internal constructor(context: Context, private val imagelist: IntArray) :
    BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return imagelist.size
    }

    override fun getItem(position: Int): Any {
        return imagelist[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var convertView = view
        val holder: ViewHolder
        if (convertView == null) {
            val binding = StackItemBinding.inflate(inflater)
            convertView = binding.root
            holder = ViewHolder()
            holder.imageView = binding.imageView
            convertView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
        }
        holder.imageView?.setImageResource(imagelist[position])
        return convertView
    }

    inner class ViewHolder {
        internal var imageView: ImageView? = null
    }
}
