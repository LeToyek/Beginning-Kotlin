import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>){
    val a = 7
    val b = 3
    val c = 2

    val x = a > b && b > c
    val y = b < a || c > a
    val z = a < c && c > b

    println(x)
    println(y)
    println(z)

    val singleLineString = "\nwassup"
    val multiLineString = """pilihan partai
        |pdi
        |golkar
        |perindo
    """.trimMargin()

    println(singleLineString)
    println(multiLineString)

    val StringGreet = "Bonjour"
    val iterateString = StringGreet[0]
    println(iterateString)

    val doubleNumbers = 19.3
    val queueStringA = "you got $doubleNumbers"

    println(queueStringA)

    val sampleArray = arrayOf(0,1,2,3,4)
    println(sampleArray[1])

    val mixArray = arrayOf(0,1,"gelud",false)
    print(mixArray[3])
    println("\n")

    val certainArray = intArrayOf(1,2,3,4,5)
    val certainArray2 = charArrayOf('a','b','c')
    val numbersArray = Array(5,{i -> i*2})
    println(numbersArray[3])

    val company = "company"
    println(company)
    var enterprise = 10
    enterprise = 12
    println(enterprise)

    //basically "when" in kotlin is same like "switch" in Java//

    val p = 5
    when(p){
        5 -> println(" p = 5")
        2 -> println(" p = 2")
        else -> {
            println("p is neither 1 nor 2 ")
        }
    }

    val q = 2
    when(q){
        in 1..10 -> println("q is in range beetween 1 and 10")
        !in 11..20 -> println("p is outside the range")
        else -> {
            println("none of the above")
        }
    }

    val arrayNumbers = intArrayOf(1,3,5,7,9)
    //using .withIndex()//
    for ((index,value) in arrayNumbers.withIndex()){
        println("bilangan $value adalah indeks ke-$index")
    }
    println("")
    //using .indices//
    for (index in arrayNumbers.indices){
        println("Bilangan ${arrayNumbers[index]} adalah indeks ke-$index")
    }
    var h = 0
    while (h < 3){
        println("gelod")
        h++
    }
    do{
        println("wanda")
    } while (h <3)

}
class Student{
    var StudentName : String = ""
    get() = field.toUpperCase()
    set(value) {
        field = "Name: $value"
    val student = Student()
        student.StudentName = "Bambang "
        val name = student.StudentName
        println(name)
    }
    //still don't know what's the use :(//
}