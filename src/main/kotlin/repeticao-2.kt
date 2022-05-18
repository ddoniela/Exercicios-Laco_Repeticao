/*
Ler 10 números e imprimir quantos são pares e quantos são ímpares.
*/

fun main(){
    var par = 0
    var impar = 0
    var num = 0

    for(i in 1..10){
        println("Digite um número: ")
        num = readln().toInt()

        if (num % 2 == 0){
            par++
        }else{
            impar++
        }
    }

    println("O total de números pares é: $par")
    println("O total de números ímpares é: $impar")

}