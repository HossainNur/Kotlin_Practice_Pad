fun main(){
    Student1().also {student ->
        student.name = "Nur"
    }
    val s1 = Student1().let {student ->
        student.name = "Hamim"
        "sahed"
    }
    Student1().apply {
        name = "Sayem"
    }
    val s2 = Student1().run {
        name="Mostofa"
        true
    }
    println(s1)
    println(s2)
}
class Student1(){
    var name: String = "Abir"
}