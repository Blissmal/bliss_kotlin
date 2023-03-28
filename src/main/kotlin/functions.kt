fun emobilis(){
    println("eMobilis Mobile Technology")
    println("This is a user defined function")
}

fun students(fname:String, age:Int){
    println(fname + "is " + age + "years old")
}

fun disease(fname:String, age:Int, diseasetype:String){
    println(fname + " aged " + age + " years old was diagnosed with " + diseasetype)
}


fun main(args: Array<String>) {
    emobilis()
    students("Erick ", 50)
    disease("Boaz", 23, "Malaria")
}