package com.store.entities

import com.store.annotations.TextOnly
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull

interface ProductDetailsInfo {
    val name: String
    val type: ProductType
    val inventory: Int
    val cost: Double?
}

data class ProductDetails(
    @TextOnly
    override val name: String,

    @field:NotNull
    override val type: ProductType,

    @field:Min(1)
    @field:Max(9999)
    override val inventory: Int,

    @field:NotNull
    override val cost: Double? = 0.0,
) : ProductDetailsInfo
