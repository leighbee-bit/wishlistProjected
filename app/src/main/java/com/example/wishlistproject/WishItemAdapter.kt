package com.example.wishlistproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishItemAdapter(private val WishItems: MutableList<WishItem>) : RecyclerView.Adapter<WishItemAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var titleTextView: TextView
        var priceTextView: TextView
        var sourceTextView: TextView

        init {
            titleTextView = itemView.findViewById(R.id.itemNameTv)
            priceTextView = itemView.findViewById(R.id.itemPriceTv)
            sourceTextView = itemView.findViewById(R.id.itemSourceTv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val context = parent.context

        val inflater = LayoutInflater.from(context)

        val contactView = inflater.inflate(R.layout.wishlist_item, parent, false)

        return ViewHolder(contactView)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val WishItem = WishItems.get(position)
        holder.titleTextView.text = WishItem.itemTitle
        holder.priceTextView.text = WishItem.itemPrice.toString()
        holder.sourceTextView.text = WishItem.itemSource



    }

    override fun getItemCount(): Int {

        return WishItems.size
    }

    //override fun addItem(WishItems: MutableList<WishItem>)

}