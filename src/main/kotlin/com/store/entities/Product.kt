package com.store.entities

/**
 * Using Composition over Inheritance for "has-a" relationship with kotlin delegation "by" feature
 *
 * Implements `ProductDetailsInfo` via delegation to `details`, allowing the `Product` class to expose
 * properties of `ProductDetailsInfo`.
 *
 *
 * Pros:
 *  - Composition denotes the relationship correctly
 *  - Uses kotlin's delegation functionality
 *  - Less boilerplate - remove redundant getter properties of field
 *
 * Cons:
 *  - Code Duplication
 *  - Unnecessarily defining ProductDetailsInfo Interface with abstract fields, which again are defined in ProductDetails
 *  - Every time a new needs to be added to product-details,
 *    it requires adding at two places :/
 */

data class Product(val id: Int, private val details: ProductDetails) : ProductDetailsInfo by details