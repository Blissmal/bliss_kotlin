fun main(args: Array<String>) {
    var num = 6
    var num1 = 29

    // if statement
    if (num < 12){
        println("Its true")
        var r = 14
        var q = 13
        println(r + q)
    }

    // if ... else statement
     if (num > 12){
            println("Its true")
            var y = 14
            var p = 13
            println(y + p)
        }else{
            println("Its false")
     }

    // if ... elseif .. else statement
    if (num1 < 0){
        println("The number is negative")
    }else if(num1 > 0 && num1 < 10){
        println("This is a single digit number")
    }else if(num1 >= 10 && num1 <=100){
        println("This is a double digit number")
    }else{
        println("NUmber has three or more digits")
    }
}