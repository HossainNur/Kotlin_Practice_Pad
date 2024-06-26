fun main(){
    var name: Company<String> = Company<String>("ABC")
    var rank: Company<Int> = Company<Int>(12)
}
class Company<T> (text : T){
    var x = text
    init{
        println(x)
    }
}