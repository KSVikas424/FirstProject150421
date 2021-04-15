package Collections

class Sets {
}

val issues: MutableSet<String> = mutableSetOf("issue1", "issue2", "issue3", "issue4", "issue1")
fun addIssue(issue: String) : Boolean{
    if (issues.add(issue)){
        println("issue added successfully")
        return true
    }
    else{
        println("issue exists")
        return false
    }
}
fun main() {
    println(issues)
    println(addIssue("issues5"))
    println(issues)
}