package com.repoai.bshara.coderswag.controler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.repoai.bshara.coderswag.R
import com.repoai.bshara.coderswag.model.Category
import com.repoai.bshara.coderswag.oneServices.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // the adapter is the middle man between the data and the list view in our layout
    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.categories)
        categoryLstView.adapter
    }
}
