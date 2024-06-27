
fun Fact(num: Int): Long {
    return if (num == 1) num.toLong()
    else num* Fact(num - 1)
}
fun main() {
    println("Factorial of 5 is: " + Fact(5))
}
