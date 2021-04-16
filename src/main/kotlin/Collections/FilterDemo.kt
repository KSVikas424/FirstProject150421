package Collections

class FilterDemo {
}

val nos = listOf<Int>(1,2,-3,4,-4,5,-3,-7)
val words = listOf<String>("first", "element", "found")
val evenOdd = nos.partition { it %2 == 0 }
val bagFruits = listOf<String>("apple","banana","chicku")
val bagClothes = listOf<String>("shirt","pant","tie")
val cart = listOf(bagFruits, bagClothes)
val mapBag = cart.map { it }
val flatMapBag = cart.flatMap { it }

fun main() {

    println(cart)
    println(mapBag)
    println(flatMapBag)
    println("even nos are ${evenOdd.first}")
    println("odd nos are ${evenOdd.second}")

    println("${nos.count()}digits are there")
    println("${nos.count { it % 2 == 0 }} even nos are there")


    val first = words.find{it.startsWith("f")}
    println(first)
    val last = words.findLast{it.startsWith("f")}
    println(last)
    val firstno = nos.first()
    val lastno = nos.last()
    println("first no is $firstno and last no is $lastno")
    val firstEvenNo = nos.find{it %2 ==0}
    val lastEvenNo = nos.findLast {it %2 ==0}
    println("first even no is $firstEvenNo last evenno is $lastEvenNo")
    val positives = nos.filter{it>0}
    println(positives)
    val doubles = nos.map{ x -> x*2 }
    println("doubles = $doubles")
    println("is any of the no is greater then 2 : "+ nos.any{it > 2})
    println("is all  the nos less than 5" + nos.all{it<5})
    println("are none of the nos greater than 5 " + nos.none{it>4})
}