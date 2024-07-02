fun main(){
    var obj = myClass()
    obj.printMe()
}
class myClass {
    private var name: String = "nur hossain"
    fun printMe(){
        println("The name is $name")
    }
}