package namedArguments

class NamedArgs {
}
data class format(val username: String, val domain: String)
fun main() {
    println(format("abdul", "example.com"));
    println(format("mydomain.com","ansari"));
    println(format(domain = "domain.com", username = "srinivas"))
}