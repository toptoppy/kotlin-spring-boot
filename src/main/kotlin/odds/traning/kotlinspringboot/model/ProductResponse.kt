package odds.traning.kotlinspringboot.model

data class ProductResponse(
    val id: String,
    val name: String,
    val price: String,
    val description: String,
    val stock: String
)