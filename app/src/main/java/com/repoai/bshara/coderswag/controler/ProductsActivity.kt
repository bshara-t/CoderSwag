package com.repoai.bshara.coderswag.controler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.repoai.bshara.coderswag.R
import com.repoai.bshara.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
