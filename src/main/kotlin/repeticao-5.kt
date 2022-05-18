/*
Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)

*/
fun main() {
    var soma = 0
    var num = 0

    do {
        println("Digite um número: ")
        num = readln().toInt()
        soma += num


    } while (num != 0)

    println("A soma dos números é: $soma")


}