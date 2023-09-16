package odds.traning.kotlinspringboot.controller

import odds.traning.kotlinspringboot.model.ProductRequest
import odds.traning.kotlinspringboot.model.ProductResponse
import odds.traning.kotlinspringboot.service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
class MarketController(
    private val productService: ProductService
) {

    @PostMapping("/products")
    fun addProduct(@RequestBody product: ProductRequest): ProductResponse {
        return productService.addProduct(product)
    }

    @GetMapping("/products")
    fun getProducts(): List<ProductResponse> = productService.getProducts()

    @PutMapping("/products/{productId}")
    fun updateProduct(@PathVariable productId: Int, @RequestBody product: ProductRequest): ProductResponse {
        return productService.updateProductById(productId, product)
    }

    @DeleteMapping("/products/{productId}")
    fun deleteProduct(@PathVariable productId: Int): Unit = productService.deleteProductById(productId)
}


