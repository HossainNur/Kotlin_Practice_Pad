//A function is a block of code which only runs when it is called.
fun main(){
    //myFunction("George",43)
    var result = myFunction(3)
    println(result)

}
/*
fun myFunction(fname: String,age: Int){
    //println("I just got executed!")
    println("$fname is $age")
}*/

fun myFunction(x:Int): Int{
    return (x+5)
}
