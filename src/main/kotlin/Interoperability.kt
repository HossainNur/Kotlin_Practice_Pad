fun main(){
    val sum = MyJavaClass.add(5,10)
    println(sum)
    val area: Int = MyJavaClass.area(3, 4)
    println("printing area from java insideKotlin file: "+area)

    val myJava = MyJavaClass()
    val array = intArrayOf(0, 1, 2, 3)
    myJava.display(*array)


}