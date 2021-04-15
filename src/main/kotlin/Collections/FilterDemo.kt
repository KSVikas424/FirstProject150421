package Collections

class FilterDemo {
}

val nos = listOf<Int>(1,2,-3,4,-4,5,-3,-7)
fun main() {
    val positives = nos.filter{it>0}
    println(positives)
}