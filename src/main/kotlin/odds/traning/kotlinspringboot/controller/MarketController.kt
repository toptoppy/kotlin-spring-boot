package odds.traning.kotlinspringboot.controller

import odds.traning.kotlinspringboot.entity.ProductEntity
import odds.traning.kotlinspringboot.service.ProductRequest
import odds.traning.kotlinspringboot.service.ProductResponse
import odds.traning.kotlinspringboot.service.ProductService
import org.springframework.web.bind.annotation.*


@RestController
class MarketController(
    private val productService: ProductService
) {

    @PostMapping("/products")
    fun addProduct(@RequestBody product: ProductRequest): ProductResponse = productService.addProduct(product)

    @GetMapping("/products")
    fun getProducts(): List<ProductResponse> = productService.getProducts()

    @PutMapping("/products/{productId}")
    fun updateProduct(@PathVariable productId: Int, @RequestBody product: ProductRequest): ProductResponse = productService.updateProductById(productId, product);
}


