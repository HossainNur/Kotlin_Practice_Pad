fun main(){
    val p1 = Person("Abir",151)
    println(p1.getInfo())
    val s1 = Student("sayem",4464)
    println(s1)
}
class Person(val name: String,val id:Int){
    fun getInfo() = "$name $id"
}
data class Student(val name: String,val id: Int)
