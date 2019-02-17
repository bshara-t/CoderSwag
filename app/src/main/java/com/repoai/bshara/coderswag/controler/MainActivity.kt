package com.repoai.bshara.coderswag.controler

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import com.repoai.bshara.coderswag.Adapters.CategoryAdapter
import com.repoai.bshara.coderswag.Adapters.CategoryRecycleAdapter
import com.repoai.bshara.coderswag.R
import com.repoai.bshara.coderswag.Utilities.EXTRA_CATEGORY
import com.repoai.bshara.coderswag.oneServices.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // the adapter is the middle man between the data and the list view in our layout
    //RecycleView is the new and improved listView and we going to use it allot from now on
    //to use recycleView you need to add it to the implementations in the gradle Module: app
    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoryLstView.adapter = adapter

        /*categoryLstView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this, "you clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }*/

        val layoutManager = LinearLayoutManager(this)
        categoryLstView.layoutManager = layoutManager
        categoryLstView.setHasFixedSize(true)


    }
}
