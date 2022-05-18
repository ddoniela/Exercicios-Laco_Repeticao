/*
Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
*/

fun main(){

    println("Esses são os números entre 1000 e 1999 que são divididos por 11 e têm como resto 5:")

    for(i in 1000..1999){
        if (i % 11 == 5){
            println(i)
        }
    }











}