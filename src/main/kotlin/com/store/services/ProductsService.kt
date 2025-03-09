package com.store.services

import com.store.entities.Product
import com.store.entities.ProductDetails
import com.store.entities.ProductId
import com.store.entities.ProductType
import com.store.repositories.ProductsRepository
import org.springframework.stereotype.Service

@Service
class ProductsService(private val repository: ProductsRepository) {
    fun getProducts(type: ProductType?): List<Product> {
        return repository.getProductsBy(type)
    }

    fun create(details: ProductDetails): ProductId {
        return repository.create(details);
    }
}