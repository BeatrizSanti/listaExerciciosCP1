//8
// Objetivo: Desenvolva duas classes na qual as mesma herdem pelo menos dois
//atributos ou dois métodos da superclasse, em seguida instancie 03 objetos de cada
//classe e realize a exibição no terminal.
//

// Superclasse
open class CarroF1(val modelo: String, val velocidadeMaxima: Int) {
    fun exibirDetalhes() {
        println("Modelo: $modelo, Velocidade Máxima: $velocidadeMaxima km/h")
    }
}

// Classe CarroEquipe
class CarroEquipe(modelo: String, velocidadeMaxima: Int, val equipe: String) : CarroF1(modelo, velocidadeMaxima) {
    fun exibirEquipe() {
        println("Equipe: $equipe")
    }
}

// Classe CarroPiloto
class CarroPiloto(modelo: String, velocidadeMaxima: Int, val piloto: String) : CarroF1(modelo, velocidadeMaxima) {
    fun exibirPiloto() {
        println("Piloto: $piloto")
    }
}

fun main() {
    // Instanciando objetos Classe CarroEquipe
    val carro1 = CarroEquipe("Mercedes W14", 350, "Mercedes-AMG Petronas")
    val carro2 = CarroEquipe("Red Bull RB19", 355, "Red Bull Racing")
    val carro3 = CarroEquipe("Ferrari SF-23", 340, "Scuderia Ferrari")

    // Instanciando objetos da classe CarroPiloto
    val piloto1 = CarroPiloto("Mercedes W14", 350, "Lewis Hamilton")
    val piloto2 = CarroPiloto("Red Bull RB19", 355, "Max Verstappen")
    val piloto3 = CarroPiloto("Ferrari SF-23", 340, "Charles Leclerc")

    // Exibindo dados
    carro1.exibirDetalhes()
    carro1.exibirEquipe()

    carro2.exibirDetalhes()
    carro2.exibirEquipe()

    carro3.exibirDetalhes()
    carro3.exibirEquipe()

    piloto1.exibirDetalhes()
    piloto1.exibirPiloto()

    piloto2.exibirDetalhes()
    piloto2.exibirPiloto()

    piloto3.exibirDetalhes()
    piloto3.exibirPiloto()
}
