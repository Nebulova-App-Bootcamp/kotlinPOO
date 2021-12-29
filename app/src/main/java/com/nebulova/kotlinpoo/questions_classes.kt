package com.example.poo

/*
class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}

Add a member to it, which indicates how much battery is left (call it "battery". Initialize this value with a number between 0 and 50.

Then add a function
"chargeBattery"
Which needs details about how much was charged.

It should print out how much battery the phone had before, how much was charged and how much it has now.
Create an Object of the class and call this function. Charge the battery by 30.



 */

fun main(){
    val iphone = MobilePhoneExample("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhoneExample("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhoneExample("Android", "Huawei", "Mate X S")

    mateXS.chargeBattery(2)
}

class MobilePhoneExample(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}

/*

¿Cómo crearía un objeto / instancia de esta clase?

class Person(var firstName: String, var lastName: String) {
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }

 var Jose = Person("Jose", "Barba")


Ejercicio propuesto:
Que a partir del valor de los lados de un rectangulo (4m y 6m, respectivamente), muestre el valor de su perimetro(m) y el de su área(m).

Solución propuesta:
Programación de una clase llamada Rectangulo con dos propiedades sus 2 lados, dos metodos perímetro y área.


class Rectangulo{
 val lado1: Int=4
 val lado2: Int=6

 fun Arearectangulo(){
  val area=lado1*lado2
  println("el area del rectangulo es $area")
  }
 fun Perimetrorectangulo(){
  val perimetro=lado1*2+lado2*2
  println("el perimetro del rectangulo es $perimetro")
 }

}

fun main(parametro: Array<String>){
 val Rectangulo1=Rectangulo()
 Rectangulo1.Arearectangulo()
 Rectangulo1.Perimetrorectangulo()
}


Ejercicio: Diseño para poder ejecutar ataques físicos de un personaje en un videojuego. Estos serán: golpe doble, cabezazo y bola de fuego.

abstract class Attack {
    val baseDamage: Int = 10

    abstract fun execute(): String
}

class Headbutt : Attack() {
    override fun execute(): String {
        return "¡Cabezazo! ${baseDamage + 1}"
    }
}

class DoubleKick : Attack() {
    override fun execute(): String {
        return "¡Golpe doble! ${baseDamage + 2}"
    }
}

class Fireball : Attack() {
    override fun execute(): String {
        return "¡Bola de fuego! ${baseDamage + 3}"
    }
}

fun main() {
    val attacks = mutableListOf(Headbutt(), DoubleKick(), Fireball())
    attacks.forEach { println(it.execute()) }
}


Ejercicio: Declarar una clase abstracta que represente una Operación. Definir en la misma tres propiedades valor1, valor2 y resultado, y dos métodos: calcular e imprimir.
Plantear dos clases llamadas Suma y Resta que hereden de la clase Operación.

abstract class Operacion(val valor1: Int, val valor2: Int) {
    protected var resultado: Int = 0

    abstract fun operar()

    fun imprimir() {
        println("Resultado: $resultado")
    }
}

class Suma(valor1: Int, valor2: Int): Operacion(valor1, valor2) {
    override fun operar() {
        resultado = valor1 + valor2
    }
}

class Resta(valor1: Int, valor2: Int): Operacion(valor1, valor2) {
    override fun operar() {
        resultado = valor1 - valor2
    }
}

fun main(parametro: Array<String>) {
    val suma1 = Suma(10, 4)
    suma1.operar()
    suma1.imprimir()
    val resta1 = Resta(20, 5)
    resta1.operar()
    resta1.imprimir()
}


Declarar una clase abstracta Cuenta y dos subclases CajaAhorra y PlazoFijo. Definir las propiedades y métodos comunes entre una caja de ahorro y un plazo fijo y agruparlos en la clase Cuenta.
Una caja de ahorro y un plazo fijo tienen un nombre de titular y un monto. Un plazo fijo añade un plazo de imposición en días y una tasa de interés. Hacer que la caja de ahorro no genera intereses.
En la función main del programa definir un objeto de la clase CajaAhorro y otro de la clase PlazoFijo.


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

fun main(parametro: Array<String>) {
    val cajaAhorro1 = CajaAhorro("juan", 10000.0)
    cajaAhorro1.imprimir()
    val plazoFijo1 = PlazoFijo("Ana", 5000.0, 30, 1.23)
    plazoFijo1.imprimir()
}

 */