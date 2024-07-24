fun main(args: Array<String>){  
val str = getNumber("10")  
    println(str)  
}  
fun getNumber(str: String): Int{  
    return try {  
        Integer.parseInt(str)  
    } catch (e: ArithmeticException) {  
        0  
    }  
}  
