class Lambda {
}

@ExperimentalStdlibApi
fun main() {
    val upperCase:(String) -> String={str:String -> str.toUpperCase()}
    val upperCase1: (String) -> String = {str -> str.toUpperCase()}
    val upperCase2 = { str : String -> str.toUpperCase()}
    val upperCase3 : (String) -> String = { it.toUpperCase() }
    //val upperCase4 : (String) -> String = String::uppercase
    //val upperCase5 = {str -> str.toUpperCase()}
    println(upperCase("srinivas"))
    println(upperCase1("srinivas"))
    println(upperCase2("srinivas"))
    println(upperCase3("srinivas"))
    //println(upperCase4("srinivas"))
}