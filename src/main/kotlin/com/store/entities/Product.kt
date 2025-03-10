package com.store.entities

import com.fasterxml.jackson.annotation.JsonIgnore

data class Product(val id: Int, @JsonIgnore val details: ProductDetails) : ProductDetailsInfo by details