//5
// Objetivo: calcular a média de uma sequência de números positiva informadas pelo
//usuário.
//Arquivo: calculaMediaWhile.kt
//Função: calcularMediaWhile()
//Instruções:
//Declarar variáveis
//Inicializar variáveis
//Enquanto numero maior que zero faça
//Receber numero do usuário
//Somar ao total
//Incrementar 1 ao contador
//Ao sair do loop calcular a média
//Apresentar o contador
//Apresentar o valor total
//Apresentar a média

fun main() {
    calcularMediaWhile()
}

fun calcularMediaWhile() {
    var total = 0.0
    var contador = 0
    var numero: Double

    println("Informe os números positivos (digite um número negativo ou 0 para sair):")
    do {
        numero = readLine()!!.toDouble()
        if (numero > 0) {
            total += numero
            contador++
        }
    } while (numero > 0)

    if (contador > 0) {
        val media = total / contador
        println("Contador: $contador")
        println("Total: $total")
        println("Média: $media")
    } else {
        println("Nenhum número positivo foi informado.")
    }
}