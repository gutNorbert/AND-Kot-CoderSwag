package com.gutnorbert.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.gutnorbert.coderswag.Adapters.CategoryAdapter
import com.gutnorbert.coderswag.Adapters.CategoryRecycleAdapter
import com.gutnorbert.coderswag.Model.Category
import com.gutnorbert.coderswag.R
import com.gutnorbert.coderswag.Services.DataService
import com.gutnorbert.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories) { category ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        } //ez történjen amikor lamdbát hívjuk, egyik elemre clickkelünk

        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

        categoryListView.setHasFixedSize(true)
        //Ha nem változik a cellánk méretei
        }
}
