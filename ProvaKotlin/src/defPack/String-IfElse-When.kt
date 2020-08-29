package defPack

fun main() {
    //Strings declaration
    val fish = "fish"
    val plant = "plant"

    //Strings have comparision operator like == and negative !=

    //If declaration
    val number1 = 50
    val number2 = 70

    if(number1 < number2) println("Number 2 is greater than number 1")
    else println("Number 1 is greater than number 2")

    //If whit a ratio

    if(number1 in 1..51) println("Good Ratio!")
    else println("Ops... Out of range!")

    //When declaration (Is like switch in java)

    when(number2) {
        0 -> println("0")
        30 -> println("Bit less half")
        70 -> println("Max")
        else -> println("Other value")
    }

}