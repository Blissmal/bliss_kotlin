class Students(val name:String, var age:Int, var gender:String, var school:String){

}

fun main(args: Array<String>) {
    val obj = Students("Bliss", 23, "Male", "Starehe boys high school")
    println("My name is ${obj.name}")
    println("I am ${obj.age} years old")
    println("My gender is ${obj.gender}")
    println("My school is ${obj.school}")
    println("My name is ${obj.name} , i am ${obj.age} years old ${obj.gender} learning from ${obj.school}")
}