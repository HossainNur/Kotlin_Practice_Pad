fun main(args: Array<String>){  
  
val regex = """a([bc]+)d?""".toRegex()  
val matched = regex.containsMatchIn(input = "xabcdy")  
println(matched)  
  
}  
