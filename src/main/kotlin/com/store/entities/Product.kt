package com.store.entities

import com.fasterxml.jackson.annotation.JsonIgnore

/**
 * Using Composition over Inheritance for "has-a" relationship
 *
 * Pros:
 *  - Composition denotes the relationship correctly
 *  - easy to understand
 *
 * Cons:
 *  - Code Duplication
 *  - violates open-closed principle
 *    Every time a new needs to be added to product-details,
 *    it requires changes to product class :/
 */
data class Product(val id: Int, @JsonIgnore val details: ProductDetails) {
    val name: String
        get() = details.name

    val type: ProductType
        get() = details.type

    val inventory: Int
        get() = details.inventory
}

