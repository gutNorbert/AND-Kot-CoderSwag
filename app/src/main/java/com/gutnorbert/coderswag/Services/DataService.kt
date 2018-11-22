package com.gutnorbert.coderswag.Services

import com.gutnorbert.coderswag.Model.Category
import com.gutnorbert.coderswag.Model.Product

/**
 * Created by Norbi on 2018. 01. 09..
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$18", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Hoodie Blue", "$28", "hoodie03"),
            Product("Devslopes Hoodie Green", "$28", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt01"),
            Product("Devslopes Badge Light Gray", "$32", "shirt02"),
            Product("Devslopes Shirt Red", "$28", "shirt03"),
            Product("Devslopes Hustle", "$28", "shirt04"),
            Product("Kickflip studio", "$18", "shirt05")
    )
}