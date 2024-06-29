class MainClass {

    private val heavyObj: Test by lazy {
        println("Heavy Object is initialized")
        Test()
    }

    fun callObject() {
        println(heavyObj)
    }
}

fun main(args: Array<String>) {

    val mainClass = MainClass()
    println("MainClass is initialized")

}
