fun main(){
   /* var cars = arrayOf("Volvo","BMW", "Ford", "Mazda")
    for (car in cars){
        println(car)
    }

    var i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }*/
    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }
}