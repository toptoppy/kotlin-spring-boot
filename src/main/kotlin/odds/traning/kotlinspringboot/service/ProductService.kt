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
    fun addProduct(product: ProductRequest): ProductResponse =
        productRepository.save(
            ProductEntity(
                id = 0,
                name = product.name,
                price = addTaxToPrice(product.price ?: 0.0),
                description = product.description ?: "",
                stock = product.stock
            )
        ).let {
            transformToProductResponse(it)
        }

    fun getProducts(): List<ProductResponse> =
        productRepository.findAll().map { transformToProductResponse(it) }

    fun updateProductById(productId: Int, request: ProductRequest): ProductResponse =
        if (productRepository.existsById(productId)) {
            productRepository.save(
                ProductEntity(
                    id = productId,
                    name = request.name,
                    price = addTaxToPrice(request.price ?: 0.0),
                    description = request.description ?: "",
                    stock = request.stock
                )
            ).let { transformToProductResponse(it) }
        } else throw Exception("Product id not found")

    fun deleteProductById(productId: Int) =
        if (productRepository.existsById(productId)) {
            productRepository.deleteById(productId)
        } else throw Exception("Product id not found")

    private fun addTaxToPrice(price: Double) = price * 1.07

    private fun transformToProductResponse(entity: ProductEntity): ProductResponse =
        entity
            .let {
                ProductResponse(
                    it.id.toString(),
                    it.name,
                    it.price.toString(),
                    it.description,
                    it.stock.toString()
                )
            }

}