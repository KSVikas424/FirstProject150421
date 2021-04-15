package Collections

class FilterDemo {
}

val nos = listOf<Int>(1,2,-3,4,-4,5,-3,-7)
fun main() {
    val positives = nos.filter{it>0}
    println(positives)
    val doubles = nos.map{ x -> x*2 }
    println("doubles = $doubles")
    println("is any of the no is greater then 2 : "+ nos.any{it > 2})
    println("is all  the nos less than 5" + nos.all{it<5})
    println("are none of the nos greater than 5 " + nos.none{it>4})
}