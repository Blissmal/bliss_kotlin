import java.util.Scanner

fun main(args: Array<String>) {
    val soma = Scanner(System.`in`)

    println("Enter an integer")
    var num1 = soma.nextInt()
    println("My integer is : $num1")

    println("Enter a Double")
    var num2 = soma.nextDouble()
    println("My double is : $num2")
}