package odds.traning.kotlinspringboot.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class ProductEntity(
    @Id
    @GeneratedValue
    val id: Int,
    val name: String,
    val price: Double,
    val description: String?
)