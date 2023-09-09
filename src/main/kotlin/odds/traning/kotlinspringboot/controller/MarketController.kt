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
        TODO("Call service to add product")
    }

    @GetMapping("/products")
    fun getProducts(): List<ProductResponse> {
        TODO("Call service to get product")
    }

    @PutMapping("/products/{productId}")
    fun updateProduct(@PathVariable productId: Int, @RequestBody product: ProductRequest): ProductResponse {
        TODO("Call service to update product")
    }

    @DeleteMapping("/products/{productId}")
    fun deleteProduct(): Unit = TODO("Bonus, try if you can ?:)")
}


