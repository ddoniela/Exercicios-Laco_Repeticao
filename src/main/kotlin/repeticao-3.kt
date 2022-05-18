/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/
fun main(){
    var idade = 0
    var menor = 0
    var maior = 0


    while(idade != -99) {
        println("Digite a sua idade: ")
        idade = readln().toInt()

        if (idade < 21) {
            menor++

        }

        if (idade > 50) {
            maior++
        }

    }
    println("Total de pessoas com menos de 21 anos: $menor")
    println("Total de pessoas com mais de 50 anos: $maior")

}