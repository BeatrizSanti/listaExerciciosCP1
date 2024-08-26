// 7
// Objetivo: Faça um loop que o usuário informe nomes de produtos com chave e o preço
//do produto como valor. Após sair do loop informar com for() os valores de chave e
//valor. Apresentar o valor médio dos produtos. Por último ordenar em ordem crescente
//por preço e apresentar os dados com while()


fun fazerLoop() {
    val produtos = mutableMapOf<String, Double>()
    var continuar = true

    // Loop para inserção dos produtos
    while (continuar) {
        println("Informe o nome do produto (ou 'sair' para encerrar):")
        val nomeProduto = readLine() ?: ""

        if (nomeProduto.lowercase() == "sair") {
            continuar = false
        } else {
            println("Informe o preço do produto:")
            val precoProduto = readLine()?.toDoubleOrNull() ?: 0.0
            produtos[nomeProduto] = precoProduto
        }
    }

    // Exibir os produtos e seus preços usando for()
    println("\nProdutos e preços:")
    for ((produto, preco) in produtos) {
        println("$produto: R$ $preco")
    }

    // Calcular e exibir a média dos preços
    val mediaPreco = if (produtos.isNotEmpty()) produtos.values.average() else 0.0
    println("\nMédia dos preços: R$ $mediaPreco")

    // Ordenar os produtos por preço (ordem crescente)
    val produtosOrdenados = produtos.toList().sortedBy { (_, preco) -> preco }

    // Exibir os produtos ordenados usando while()
    println("\nProdutos ordenados por preço (crescente):")
    var i = 0
    while (i < produtosOrdenados.size) {
        val (produto, preco) = produtosOrdenados[i]
        println("$produto: R$ $preco")
        i++
    }
}

fun main() {
    fazerLoop()
}
