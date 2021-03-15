package com.example.recyclerviewkt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

     private var titles = arrayOf("Ch num A", "Ch num B", "Ch num C", "Ch num D", "Ch num F",
             "Ch num G", "Ch num H", "Ch num I" )
    private var details = arrayOf("item details A", "item details B", "item details C", "item details D",
            "item details E", "item details F", "item details H", "item details I" )
    private  var images = arrayOf(R.drawable.ic_account, R.drawable.ic_account, R.drawable.ic_account,
            R.drawable.ic_account, R.drawable.ic_account, R.drawable.ic_account, R.drawable.ic_account,
            R.drawable.ic_account )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details [position]
        holder.itemImage.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.imageView)
            itemTitle = itemView.findViewById(R.id.textView)
            itemDetail = itemView.findViewById(R.id.rowCountTextView)
        }


    }

}