class Employee {
    // properties
    var name: String = ""
    var age: Int = 0
    var gender: Char = 'M'
    var salary: Double = 0.toDouble()
    // member functions
    fun insertValues(n: String, a: Int, g: Char, s: Double) {
        name = n
        age = a
        gender = g
        salary = s
    }
    fun getInformation(){
        println("Name of the employee: $name")
        println("Age of the employee: $age")
        println("Gender: $gender")
        println("Salary of the employee: $salary")
    }

    fun insertName(n: String) {
        this.name = n
    }

}
fun main(args: Array<String>) {
    var obj = Employee()

    var obj2 = Employee()

    obj.insertValues("Praveen", 50, 'M', 500000.00)
    println(obj.getInformation())

    obj2.insertName("Aliena")

    println("Name of the new employee: ${obj2.name}")

}
