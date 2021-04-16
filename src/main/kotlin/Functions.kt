class Functions
    public fun isEven(num: Int) : Boolean{
        if(num % 2 ==0){
            return true
        }
        return false
    }

public fun String.isMale(name: String):Boolean{
    if(name.startsWith("a"))
    { return true}
    else {
        return false
    }
}

fun main() {
   println(isEven(3))
    println(String().isMale("bcde"))
}