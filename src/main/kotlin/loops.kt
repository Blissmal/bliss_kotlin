fun main(args: Array<String>) {
    // for loop
    // Write a kotlin program that uses a for loop to printout
    //even numbers between 1 and 10
    for (even in 1..10){
        if (even%2 == 0) {
            println(even)
        }
    }
    for (i in 10..20){
        println("Loop $i")
    }
    var myarray = arrayOf("Erick", "Purity", "Joel", "Daniel")
    for (jina in myarray){
        println(jina)
    }
    // while loop
    var nambari = 5
    while (nambari <= 10){
        println("Loop $nambari")
        nambari += 2
    }

    var num3 = 23
    while (num3 <= 50){
        println("Loop in $num3")
        num3 += 4
    }

    // do .. while
    var numloop = 100
    do {
        println("loop $numloop")
        numloop ++
    }while (numloop <= 105)
}