
class OuterClassNew {
    var str = "Outer class"
    // innerClass declaration with using inner keyword
    inner class innerClass {
        var s1 = "Inner class"
        fun nestfunc(): String {
            // can access the outer class property str
            var s2 = str
            return s2
        }
    }
}
fun main(args: Array<String>) {
    val inner = OuterClassNew().innerClass()
    println(inner.nestfunc()+" property accessed successfully from inner class ")
}
