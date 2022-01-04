package com.refaccionaria.direy.service

import com.refaccionaria.direy.entity.Product
import com.refaccionaria.direy.repository.ProductRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {

    @Autowired
    lateinit var productRepository: ProductRepository

    protected val logger = LoggerFactory.getLogger(ProductService::class.java)

    fun getProducts(): List<Product> {
        return productRepository.findAll()
    }

    fun createProduct(product: Product) {
        productRepository.save(product)
        logger.info("--ProductService --createProduct --${product}")
    }

    fun updateProduct(product: Product) {
        productRepository.save(product)
        logger.info("--ProductService --updateProduct --${product}")
    }

    fun deleteProduct(id: Long) {
        productRepository.deleteById(id)
        logger.info("--ProductService --DeleteProduct --id:${id}")
    }

}