//9
// Objetivo: Desenvolva uma classe na qual receberá no mínimo 05 argumentos em seus
//construtor. Obs: O usuário irá descrever os argumentos.

class Pessoa(
    val nome: String,
    val idade: Int,
    val altura: Double,
    val cidade: String,
    val profissao: String
) {
    fun exibirDados() {
        println("Nome: $nome")
        println("Idade: $idade anos")
        println("Altura: $altura metros")
        println("Cidade: $cidade")
        println("Profissão: $profissao")
    }
}

fun main() {
    print("Digite seu nome: ")
    val nome = readLine() ?: "Não informado"

    print("Digite sua idade: ")
    val idadeString = readLine() ?: "0"
    val idade = idadeString.toIntOrNull() ?: 0

    print("Digite sua altura (em metros): ")
    val alturaString = readLine() ?: "0.0"
    val altura = alturaString.toDoubleOrNull() ?: 0.0

    print("Digite a cidade onde você mora: ")
    val cidade = readLine() ?: "Desconhecida"

    print("Digite sua profissão: ")
    val profissao = readLine() ?: "Desconhecida"

    // Instanciando a classe
    val pessoa = Pessoa(nome, idade, altura, cidade, profissao)

    println("\nDados da pessoa:")
    pessoa.exibirDados()
}