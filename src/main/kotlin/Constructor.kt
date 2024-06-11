fun main(){
    val house = House()
    println(house)
    val box = Box(12,45)
    println(box.height)
}
class House{
    val color: String = "Red"
    fun updateColor(){

    }
}
class Box(val height: Int,weight: Int){

}