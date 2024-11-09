package com.example.wishlistproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var items: MutableList<WishItem>
    lateinit var submit: Button
    lateinit var title: EditText // name entry
    lateinit var price: EditText // price entry
    lateinit var source: EditText // url source



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        items = mutableListOf()

        //RecyclerView and Adapter
        val wishListRv = findViewById<RecyclerView>(R.id.wishListView)
        val wishlistAd = WishItemAdapter(items)

        wishListRv.adapter = wishlistAd
        wishListRv.layoutManager = LinearLayoutManager(this)

        //User Inputs
        title = findViewById(R.id.titleUI)
        price = findViewById(R.id.priceUI)
        source = findViewById(R.id.urlUI)


        //submit button
        submit = findViewById(R.id.submitBtn)


        //Parameters for WishItem



        submit.setOnClickListener() {

            val wishTitle = title.text.toString()
            val wishPrice = price.text.toString()
            val wishUrl = source.text.toString()

            if (wishTitle.isNotEmpty() && wishPrice.isNotEmpty() && wishUrl.isNotEmpty()) {
                var newItem: WishItem = WishItem(wishTitle, wishPrice, wishUrl)
                items.add(newItem)
                wishlistAd.notifyItemInserted(items.size - 1)
                title.text.clear()
                price.text.clear()
                source.text.clear()
                //Toast.makeText(this, "Successful entry!", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Invalid entry!", Toast.LENGTH_LONG).show()
            }
        }



        // show what name entry, url entry, and price entry fields in UI

        // we need to use the button to create WishItem object,
        // notify the dataset changed using wishadaptor
        // clear out the text

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
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






}
    }