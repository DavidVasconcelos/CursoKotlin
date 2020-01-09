package oo.heranca

class Ferrari: Carro(velocidadeMaxima = 350), Esportivo { // pode herdar de uma classe apenas, mas implentar várias interfaces
    override var turbo: Boolean = false
        get() = field
        set(value) { field = value }

    override fun acelerar() {
        alterarVelocidadeEm(if(turbo) 50 else 25)
    }

    override fun frear() {
        alterarVelocidadeEm(-25)
    }
}