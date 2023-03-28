class Hesabu{
    // data member
    private var number:Int = 8

    // member function
    fun calculateSquare():Int{
        return number*number
    }
}

class Bliss{
    var name = "emobilis"
    fun myname(){
        println(name)
    }
}

class car{
    var Cname = "Landcruiser prado"
    var model = "Toyota Motors"
    var year = 2011
    fun Toyota(){
        println("The " + Cname + " car by " + model + " model was manufactured in the year " + year)
    }
}

fun main(args: Array<String>) {
    // create an object
    val myobject = Hesabu()
    println(myobject.calculateSquare())

    val myobj2 = Bliss()
    println(myobj2.myname())

    val myobj3 = car()
    println(myobj3.Toyota())
}