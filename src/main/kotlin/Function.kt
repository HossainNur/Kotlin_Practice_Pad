//A function is a block of code which only runs when it is called.
fun main(){
    //myFunction("George",43)
    /*var result = myFunction(3)
    println(result)*/
    var sum = arrayOf(1,2,3,4,5,6,7,8,9,10).sum()

    println("The sum of all the elements of an array is: $sum")

}
/*
fun myFunction(fname: String,age: Int){
    //println("I just got executed!")
    println("$fname is $age")
}*/

fun myFunction(x:Int): Int = x + 6
