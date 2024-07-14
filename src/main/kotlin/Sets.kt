fun main(){
    val newSet = setOf("one", "two", "three", "four")
    /*println(newSet)

    val newMutableSet = mutableSetOf("one", "two", "three", "four")
    println(newMutableSet)*/

    for (i in newSet.indices) {
        println(newSet.elementAt(i))
    }
}