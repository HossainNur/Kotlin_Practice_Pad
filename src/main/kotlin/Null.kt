fun main(args: Array<String>){  
var str: String? = "Hello"   
var len = if(str!=null) str.length else -1  
println("str is : $str")  
println("str length is : $len")  
  
str = null  
println("str is : $str")  
len = if(str!=null) str.length else -1  
println("b length is : $len")  
}  
