class OuterClass{
    var str = "Outer class"
    class NestedClass{
        var s1 = "Nested Class"
        val firstName = "Nur"
        val lastName = "Hossain"

        fun nestfunc(str : String): String{
            var s2 = s1.plus(str)
            return s2
        }
    }

}


fun main(){
    println(OuterClass.NestedClass().firstName)
    println(OuterClass.NestedClass().lastName)
    println(OuterClass().str)
    val nested = OuterClass.NestedClass()
    val result = nested.nestfunc(" nur")
    println(result)
}