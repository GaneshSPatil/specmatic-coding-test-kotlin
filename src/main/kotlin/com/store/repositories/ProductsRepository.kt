package com.store.repositories

import com.store.entities.Product
import com.store.entities.ProductDetails
import com.store.entities.ProductId
import com.store.entities.ProductType
import org.springframework.stereotype.Repository
import java.util.concurrent.atomic.AtomicInteger

@Repository
class ProductsRepository {
    private val products: ArrayList<Product> = ArrayList()

    fun getProductsBy(type: ProductType?): List<Product> {
        return products.filter { product -> type == null || product.type == type }
    }

    fun create(details: ProductDetails): ProductId {
        val id: Int = getNext()
        val product = Product(id, details)
        products.add(product)
        return ProductId(id)
    }

    companion object {
        private val atomicInt: AtomicInteger = AtomicInteger(1)

        fun getNext(): Int {
            return atomicInt.getAndIncrement()
        }
    }
}