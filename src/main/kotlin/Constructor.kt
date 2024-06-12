fun main(){
    val house = House()
    println(house)
    val box = Box(12,45)
    println(box.height)
    val add = Add(2,5)
    println(add.c)
}
class House{
    val color: String = "Red"
    fun updateColor(){

    }
}
class Box(val height: Int,weight: Int){

}
class Add(a:Int,b:Int){
    val  c = a+b
}
