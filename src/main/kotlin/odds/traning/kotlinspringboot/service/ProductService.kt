package odds.traning.kotlinspringboot.service

import io.swagger.v3.oas.annotations.media.Schema
import odds.traning.kotlinspringboot.entity.ProductEntity
import odds.traning.kotlinspringboot.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productRepository: ProductRepository
) {

    fun addProduct(product: ProductRequest): ProductResponse {
        return productRepository.save(ProductEntity(
            0,
            product.name,
            addTaxToPrice(product),
            product.description
        )).let { transformToProductResponse(it) }
    }

    private fun addTaxToPrice(product: ProductRequest) = product.price * 1.07

    private fun transformToProductResponse(entity: ProductEntity): ProductResponse {
        return ProductResponse(
            entity.id.toString(),
            entity.name,
            "${entity.price} Baht",
            entity.description ?: "There is no product description"
        )
    }

    fun getProducts(): List<ProductResponse> = productRepository.findAll().let { it.map { productEntity -> transformToProductResponse(productEntity) } }

    fun updateProductById(productId: Int, request: ProductRequest): ProductResponse {
        return if (productRepository.existsById(productId)) {
            transformToProductResponse(
                productRepository.save(
                    ProductEntity(
                        productId,
                        request.name,
                        request.price,
                        request.description
                    )
                )
            )
        } else throw Exception("Product Id not found")
    }
}

data class ProductResponse(
    val productId: String,
    val name: String,
    val price: String,
    val description: String
)

data class ProductRequest(
    val name: String,
    val price: Double,
    val description: String?
)