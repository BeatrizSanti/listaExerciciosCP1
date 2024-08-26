//1
// Implementar um programa que o usuário informe via linha de comando um valor do
//produto e um percentual de desconto. Com base nisso apresente o valor final do
//produto. Criar uma função para esse cálculo.


fun main() {
    println("Informe o valor do produto:")
    val valorProduto = readLine()?.toDoubleOrNull()

    if (valorProduto == null || valorProduto <= 0) {
        println("Valor do produto inválido.")
        return
    }

    println("Informe o percentual de desconto:")
    val desconto = readLine()?.toDoubleOrNull()

    if (desconto == null || desconto < 0 || desconto > 100) {
        println("Percentual de desconto inválido.")
        return
    }

    val valorFinal = calcularValorDesconto(valorProduto, desconto)
    println("O valor final do produto é: R$%.2f".format(valorFinal))
}

fun calcularValorDesconto(valorProduto: Double, desconto: Double): Double {
    val valorDesconto = valorProduto * (desconto / 100)
    return valorProduto - valorDesconto
}
