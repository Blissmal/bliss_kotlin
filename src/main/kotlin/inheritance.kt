open class MyParentClass{
    val dad = "He likes playing soccer"
    val mum = "She likes cooking"
}

class MyBoyClass:MyParentClass(){
    fun myBoy(){
        println(dad)
    }
}

class MyGirlClass:MyParentClass(){
    fun myGirl(){
        println(mum)
    }
}

fun main(args: Array<String>) {
    val kijana = MyBoyClass()
    kijana.myBoy()

    val hobb = MyGirlClass()
    hobb.myGirl()
}