package odds.traning.kotlinspringboot.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class ProductEntity(
    @Id
    @GeneratedValue
    val id: Int
    //TODO: Added fields that you want to save it into the database
)