// Hello World!
fun main() {
    println("Hello World")
}
main()

// Basic Type
fun basicTypes(): Any {
    val int: Int = 1
    val long: Long = 1L
    val float: Float = 2.5f
    val double: Double = 20.00
    val string: String = "Marcin"

    return int
//    return long
//    return float
//    return double
//    return string
}
//basicTypes()

// Declaring variable
fun variable(): String {
    var variable: String
    variable = "assign variable here!"
    return variable
}
//variable()

fun valued(): String {
    val valued: String = "assign here!"
//    valued = "can I?"
    return valued
}
//valued()

// String templates
fun stringTemplate() {
    var lastName: String = "Mongkolsawat"
    var surName: String = "Kananek"

    println("Hi my name is $surName $lastName")
}
//stringTemplate()

// Collection
fun collection() {
    val lists = listOf(1,2,3,4)
    val mLists = mutableListOf(1,2,3,4)

    mLists.add(5)

    println(lists)
    println(mLists)

    setOf("A", "B", "C")
    mutableSetOf("A", "B", "C")

    arrayOf('a', 'b', 'c')

    mapOf(1 to "A", 2 to "B")
    mutableMapOf(1 to "A", 2 to "B")
}
//collection()

// Class vs Data Class
class PersonClass(val name: String, var age: Int)

data class PersonDataClass(val name: String, var age: Int)

fun classVsDataClass() {
    val mike = PersonClass("Mike", 23)
    val anotherMike = PersonClass("Mike", 23)
// -===================== Comparable between object =================================-
    println("Is ${mike.name} and ${anotherMike.name} the same person? -> ${mike.equals(anotherMike)}")

    val mikeData = PersonDataClass("Data Mike", 23)
    val anotherMikeData = PersonDataClass("Data Mike", 23)
    println("Is ${mikeData.name} and ${anotherMikeData.name} the same person? -> ${mikeData.equals(anotherMikeData)}")

// -===================== Print object to string =================================-
    println(mike.toString())
    println(mikeData.toString())

// -===================== Copying objects =================================-
    val jakeData = mikeData.copy(name = "Jake")

// -===================== Destructuring Declarations =================================-
    //    val (name, age) = mike

    val (mikeName, mikeAge) = mikeData
    val (jakeName, jakeAge) = jakeData
}
//classVsDataClass()


// Functions
fun classicFunction(a: Int, b: Int): Int {
    return a + b
}
//classicFunction(5, 6)

fun muchShorter(a: Int, b: Int = 9) =  a + b
//muchShorter(3)

fun justUnitFunction(): Unit {
    println("I didn't return anything :(")
}
//justUnitFunction()

fun alternateNonReturnFunction() {
    println("I didn't return anything, but didn't define as Unit")
}
//alternateNonReturnFunction()

// If
fun max(a: Int, b: Int): Int {
    return if (a > b)
        a
    else
        b
}
//max(1,2)

fun oneLinerMax(a: Int, b: Int) = if (a > b) a else b
//oneLinerMax(888,111)

fun notFunMax(a: Int, b: Int) = if (a > b) {
    a
} else {
    b.toString()
}
//val notFun = notFunMax(4, 7)
//val mul = 8 * notFun
//println(mul)

// When
fun switchCaseCousin() {
    val x = 10
    when (x) {
        1 -> println("x == $x")
        2 -> println("x == $x")
        else -> println("x is not 1 or 2")
    }
}
//switchCaseCousin()

fun coolerWhen() {
    val x = 10
    val y = 9
    when {
        x == 10 -> println("x == $x")
        y == 9 -> println("y == $y")
        else -> println("why you do this?")
    }
}
//coolerWhen()

// Operator
fun rightOfAnd(): Boolean {
    return 2 == 2
}

fun shortCircuitOpertaor() {
    if ((1 == 1) && rightOfAnd())
        println("Great you are true!")
}
//shortCircuitOpertaor()

fun notShortCircuitOpertaor() {
    if ((1 == 1) and (2 == 2))
        println("Great you are true!")
}
//notShortCircuitOpertaor()

// Loops
val items = listOf("apple", "banana", "kiwifruit")

fun newNormalLoop() {
    for (item in items) {
        println(item)
    }
}

fun loopWithIndices() {
    for (index in items.indices) {
        println("[indices] item at $index is ${items[index]}")
    }
}

fun loopWithIndex() {
    for ((index, item) in items.withIndex()) {
        println("[withIndex] item at $index is $item")
    }

}

//newNormalLoop()
//loopWithIndices()
//loopWithIndex()

// Ranges
fun rangeInLoop() {
    val x = 10
    for (x in 1..5) {
        println(x)
    }
}

fun findValueInRange() {
    val x = 1
    if (x in 1..10) {
        println("value $x is fits in range")
    }
}

fun skippyRange() {
    val x = 9
    for (x in 9 downTo 0 step 3) {
        println(x)
    }
}

//rangeInLoop()
//findValueInRange()
//skippyRange()

// Null safety - Variables with nullable types
var fullName: String? = null
var realAge: Int? = 10

// Elvis Operator
var nullName: String? = null

if (nullName != null) {
    println("I have name")
} else {
    println("My name is top")
}

println(nullName ?: "top with elvis")

// Safe Call
val safeValueWithNull: String? = null
val safeResponse = safeValueWithNull ?: "It's null, baka!"
//val safeButImError = safeValueWithNull ?: throw Error()

println(safeResponse)

// Elvis with Safe Call
var namelength: Int = fullName?.length ?: 0

println("Hi my name length is $namelength and I'm $realAge year old")

fullName = "I have name now"
namelength = fullName?.length ?: 0

println("Hi my name length is $namelength and I'm $realAge year old")

// Unsafe Calls
val unsafe: String? = null
//println(unsafe!!.length)

// Scope function

