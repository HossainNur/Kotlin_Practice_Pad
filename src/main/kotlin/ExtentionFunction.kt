fun main(){
    val x: Int = 11
    println(x.isEven())
    println(100.isEven())

}
fun Int.isEven(): Boolean{
    return this % 2 == 0
}