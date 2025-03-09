package com.store.entities

import com.store.annotations.TextOnly
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull

data class ProductDetails(
    @TextOnly
    val name: String,

    @field:NotNull
    val type: ProductType,

    @field:Min(1)
    @field:Max(9999)
    val inventory: Int,

    @field:NotNull
    val cost: Double? = 0.0,
)