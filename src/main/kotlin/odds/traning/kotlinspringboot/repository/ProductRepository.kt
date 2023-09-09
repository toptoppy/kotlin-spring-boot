package odds.traning.kotlinspringboot.repository

import odds.traning.kotlinspringboot.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<ProductEntity, Int>
