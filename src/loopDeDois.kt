//
// 6Objetivo: Faça um loop de 1 até um número informado pelo usuário incrementando de
//2 em 2.
//Arquivo: loopDeDois.kt
//Função: fazerLoop();


fun fazerLoop(numero: Int) {
    for (i in 1..numero step 2) {
        println(i)
    }
}

fun main() {
    print("Informe um número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero > 0) {
        fazerLoop(numero)
    } else {
        println("Por favor, informe um número inteiro positivo.")
    }
}
