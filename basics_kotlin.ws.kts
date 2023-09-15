// Hello World!
fun main () {
    println("Hello World")
}


// Basic Type
// Declaring variable
val int: Int = 1
val long: Long = 1L
val floats: Float = 2.5f
val double: Double = 20.00
val string: String = "Marcin"

// String templates
var lastName: String = "Mongkolsawat"
var surName: String = "Kananek"

println("Hi my name is $surName $lastName")

// Collection
listOf(1,2,3,4)
mutableListOf(1,2,3,4)

setOf("A", "B", "C")
mutableSetOf("A", "B", "C")

arrayOf('a', 'b', 'c')

mapOf(1 to "A", 2 to "B")
mutableMapOf(1 to "A", 2 to "B")

// Class vs Data Class
class PersonClass(val name: String, var age: Int)

data class PersonDataClass(val name: String, var age: Int)

val mike = PersonClass("Mike", 23)
//val (name, age) = mike

val mikeData = PersonDataClass("Mike", 23)
mikeData.toString()
val jakeData = mikeData.copy(name = "Jake")

val (name, age) = mikeData
val (name, age) = jakeData

// Functions

// If

// When

// Operator

// Loops

// Ranges

// Null safety - Variables with nullable types
var fullName: String? = null
var realAge: Int? = 10

// Elvis Operator
val namelength: Int = fullName?.length ?: 0

println("Hi my name is $namelength and I'am $realAge year old")

// Elvis
var nullName: String? = null
val printName = nullName ?: "top"

// Safe Call
val a: Int = nullName?.length ?: 0
val a = nullName?.length ?: throw Error()

// Unsafe Calls
val b: Int = nullName!!.length

// Scope function

