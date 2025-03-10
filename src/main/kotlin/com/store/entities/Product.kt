package com.store.entities

data class Product(val id: Int, private val details: ProductDetails) : ProductDetailsInfo by details