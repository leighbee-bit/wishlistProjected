package com.example.wishlistproject

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.makeText

class WishItem(val itemTitle: String, val itemPrice: String, val itemSource: String){}

//        lateinit var submit: Button
//        lateinit var title: EditText
//        lateinit var price: EditText
//        lateinit var source: EditText
//
//        init {
//            title.findViewById<EditText>(R.id.titleUI)
//            price.findViewById<EditText>(R.id.priceUI)
//            source.findViewById<EditText>(R.id.urlUI)
//            submit.findViewById<Button>(R.id.submitBtn)
//        }
//        fun createItem()
//        {
//            submit.setOnClickListener(){
//                if(title.text.toString().length > 0){
//                    itemTitle = title.text.toString()
//                }
//                else if(price.text.toString().toDouble() >= 0){
//                    itemPrice = price.text.toString().toDouble()
//                }
//                else if(source.text.toString().length > 0)
//                {
//                    itemSource = source.text.toString()
//                }
//                else
//                {
//                    Toast.makeText(this, "Invalid entry!", Toast.LENGTH_LONG).show()
//                }
//
//            }
//        }