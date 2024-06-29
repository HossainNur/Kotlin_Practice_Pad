fun main(){
    Test().initializeName()
}
class Test{
    lateinit var myVariable: String
    fun initializeName() {
        println("Is myVariable initialized? " + this::myVariable.isInitialized)
        myVariable = "Nur"
        println("Is myVariable initialized? " + this::myVariable.isInitialized)
    }
}