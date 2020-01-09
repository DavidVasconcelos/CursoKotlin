package oo.heranca

open class Carro(val velocidadeMaxima: Int = 200, var velocidadeAtual: Int = 0) { // open para poder ter herança
    protected fun alterarVelocidadeEm(velocidade: Int) {
        val novaVelocidade = velocidadeAtual + velocidade
        velocidadeAtual = when(novaVelocidade) {
            in 0..velocidadeMaxima -> novaVelocidade // se ela estiver entre 0 e a velocidade máxima retorna ela
            in velocidadeMaxima + 1..Int.MAX_VALUE -> velocidadeMaxima // senão retorna a velocidademaxima
            else -> 0
        }
    }

    open fun acelerar() {
        alterarVelocidadeEm(5)
    }

    open fun frear() {
        alterarVelocidadeEm(-5)
    }

    override fun toString(): String {
        return "A velocidade atual é $velocidadeAtual Km/h."
    }
}