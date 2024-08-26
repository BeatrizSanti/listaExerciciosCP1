//3
//Solicitar ao usuário que informe uma nota entre 1 e 5 e confome
//a nota apresentar o qualificador.


fun avaliaResultadoIf() {
    println("Informe uma nota entre 1 e 5:")
    val nota = readLine()?.toIntOrNull()

    if (nota == null) {
        println("Nota inválida")
    } else {
        if (nota == 1) {
            println("Péssimo")
        } else if (nota == 2) {
            println("Ruim")
        } else if (nota == 3) {
            println("Satisfatório")
        } else if (nota == 4) {
            println("Bom")
        } else if (nota == 5) {
            println("Ótimo")
        } else {
            println("Nota inválida")
        }
    }
}

fun main() {
    avaliaResultadoIf()
}
