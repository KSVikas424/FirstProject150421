object Auth {
    fun takeCredentials(name: String, password: String){
        println("Please enter with $name username and $password password")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        Auth.takeCredentials("hello", "pass")
    }
}