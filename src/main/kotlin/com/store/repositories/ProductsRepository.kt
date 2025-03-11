package com.store.repositories

import com.store.entities.Product
import com.store.entities.ProductId
import com.store.entities.ProductType
import org.springframework.stereotype.Repository

@Repository
class ProductsRepository {
    private val products: ArrayList<Product> = ArrayList()

    fun getProductsBy(type: ProductType?): List<Product> {
        return products.filter { product -> type == null || product.type == type }
    }

    fun create(product: Product): ProductId {
        products.add(product)
        return ProductId(product.id)
    }
}