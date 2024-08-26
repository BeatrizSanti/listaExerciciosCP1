//4
//Objetivo: repita o exercício anterior usando when para avaliar a nota informada e
//decidir qual texto apresentar.
//Arquivo: solicitaNotaWhen.kt
//Função: avaliaResultadoWhen()

fun main() {
    println("Informe a nota (entre 1 e 5):")
    val nota = readln().toInt()

    avaliaResultadoWhen(nota)
}

fun avaliaResultadoWhen(nota: Int) {
    when (nota) {
        1 -> println("Péssimo")
        2 -> println("Ruim")
        3 -> println("Satisfatório")
        4 -> println("Bom")
        5 -> println("Ótimo")
        else -> println("Nota inválida")
    }
}