package com.store.controllers

import com.store.entities.Product
import com.store.entities.ProductDetails
import com.store.entities.ProductId
import com.store.entities.ProductType
import com.store.services.ProductsService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/products")
class ProductsController(private val service: ProductsService) {
    @GetMapping
    fun getProducts(@RequestParam(name = "type", required = false) type: ProductType?): ResponseEntity<List<Product>> {
        return ResponseEntity.ok(service.getProducts(type))
    }

    @PostMapping
    fun createProduct(@Valid @RequestBody details: ProductDetails): ResponseEntity<ProductId> {
        return ResponseEntity(service.create(details), HttpStatus.CREATED)
    }
}
