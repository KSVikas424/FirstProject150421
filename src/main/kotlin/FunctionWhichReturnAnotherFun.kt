class FunctionWhichReturnAnotherFun {
}
fun funWhichReturnAnotherFun(): (Int) ->Int{
    return ::square
}
fun square(x: Int) = x*x
fun main() {
    val func = funWhichReturnAnotherFun()
    print(func(3))
}