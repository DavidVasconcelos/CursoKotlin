package oo.heranca

interface Esportivo {
    var turbo: Boolean

    fun ligarTurbo() { // interface pode ter implementação
        turbo = true
    }

    fun desligarTurbo() {
        turbo = false
    }
}