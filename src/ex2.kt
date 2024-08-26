//2
//Novamente via linha de comando, o usuário deverá informar valores dentro de um loop
//e deverá ser apresentado o total no final. Esse loop deve usar while até que o usuário
//informe um valor zero para sair do loop


fun main() {
    println("Informe o valor do produto:")
    val valorProduto = readLine()?.toDoubleOrNull()

    if (valorProduto == null || valorProduto <= 0) {
        println("Valor do produto inválido.")
        return
    }

    println("Informe o percentual de desconto:")
    val percentualDesconto = readLine()?.toDoubleOrNull()

    if (percentualDesconto == null || percentualDesconto < 0 || percentualDesconto > 100) {
        println("Percentual de desconto inválido.")
        return
    }

    val valorFinal = calcularValorFinal(valorProduto, percentualDesconto)
    println("O valor final do produto é: R$%.2f".format(valorFinal))
}

fun calcularValorFinal(valorProduto: Double, percentualDesconto: Double): Double {
    val valorDesconto = valorProduto * (percentualDesconto / 100)
    return valorProduto - valorDesconto
}
