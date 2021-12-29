package com.example.poo

abstract class Cuenta(val titular: String, val monto: Double) {
    open fun imprimir() {
        println("Titular: $titular")
        println("Monto: $monto")
    }
}

class CajaAhorro(titular: String, monto: Double): Cuenta(titular, monto) {
    override fun imprimir() {
        println("Cuenta de caja de ahorro")
        super.imprimir()
    }
}

class PlazoFijo(titular: String, monto: Double, val plazo: Int, val interes: Double): Cuenta(titular, monto) {
    override fun imprimir() {
        println("Cuenta de plazo fijo")
        println("Plazo en dias: $plazo")
        println("Intereses: $interes")
        val ganancia =  monto * interes / 100
        println("Importe del interes: $ganancia")
        super.imprimir()
    }
}

fun main() {
    val cajaAhorro1 = CajaAhorro("juan", 10000.0)
    cajaAhorro1.imprimir()
    val plazoFijo1 = PlazoFijo("Ana", 5000.0, 30, 1.23)
    plazoFijo1.imprimir()
}