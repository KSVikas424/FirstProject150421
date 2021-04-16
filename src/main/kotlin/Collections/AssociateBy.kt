package Collections

class AssociateBy {
}
data class Person(val name:String, val city:String, val phone:Int)

val people = listOf<Person>(
        Person("Srinivas", "bang", 3434343),
        Person("vikas", "bang", 3434),
    Person("Kalidindi", "karna", 343434),
    Person("abdul", "karna", 234343)
)
fun main() {
    val phoneBook = people.associateBy { it.city }
    println(phoneBook)
}