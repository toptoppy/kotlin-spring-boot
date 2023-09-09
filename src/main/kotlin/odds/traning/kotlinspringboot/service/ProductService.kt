package odds.traning.kotlinspringboot.service

import odds.traning.kotlinspringboot.entity.ProductEntity
import odds.traning.kotlinspringboot.model.ProductRequest
import odds.traning.kotlinspringboot.model.ProductResponse
import odds.traning.kotlinspringboot.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productRepository: ProductRepository
) {

    fun addProduct(product: ProductRequest): ProductResponse = TODO("Added new product and added tax to the price before save it to database")

    fun getProducts(): List<ProductResponse> = TODO("Used findAll() from repository and transform the entity to be readable response for frontend ")

    fun updateProductById(productId: Int, request: ProductRequest): ProductResponse =
        TODO("Check if the data is existing before update, if it is update save it to the database. Otherwise, throw error")

    private fun addTaxToPrice(price: Double) = price * 1.07

    private fun transformToProductResponse(entity: ProductEntity): ProductResponse =
        TODO("Transform response from database to be readable response for frontend")
}