package com.refaccionaria.direy.controller

import com.refaccionaria.direy.entity.Product
import com.refaccionaria.direy.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController {

    @Autowired
    lateinit var productService: ProductService

    @GetMapping
    fun getProducts(): List<Product> {
        return productService.getProducts()
    }

    @PostMapping
    fun createProduct(@RequestBody product: Product): ResponseEntity<String> {
        productService.createProduct(product)
        return ResponseEntity(HttpStatus.CREATED)
    }

    @PatchMapping
    fun updateProduct(@RequestBody product: Product): ResponseEntity<String> {
        productService.updateProduct(product)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }

    @DeleteMapping
    fun deleteProduct(@RequestParam id: Long): ResponseEntity<String> {
        productService.deleteProduct(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }

}