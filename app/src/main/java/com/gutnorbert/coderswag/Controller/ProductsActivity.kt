package com.gutnorbert.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Adapter
import com.gutnorbert.coderswag.Adapters.ProductsAdapter
import com.gutnorbert.coderswag.R
import com.gutnorbert.coderswag.Services.DataService
import com.gutnorbert.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

       adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        var spancount = 2
        val orientation = resources.configuration.orientation //returns int 1 portrait 2 landscape
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spancount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spancount = 3
        }

        val layoutManager = GridLayoutManager(this,spancount)
        productListView.layoutManager = layoutManager

        productListView.adapter = adapter
    }
}
