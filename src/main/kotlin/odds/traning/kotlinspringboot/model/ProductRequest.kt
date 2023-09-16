package odds.traning.kotlinspringboot.model

data class ProductRequest(
    val name: String,
    val price: Double?,
    val description: String?,
    val stock: Int
)