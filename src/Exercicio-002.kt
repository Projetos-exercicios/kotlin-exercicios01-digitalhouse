
fun main() {
//2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.

    val primeiraString = "Apolo"
    val segundaString = "música"

    //Usando equals
    println("$primeiraString é igual a $segundaString? '  ${primeiraString.equals(segundaString, false)}")

    //Usando equals e if
    if (primeiraString.equals(segundaString)){
        println("As Strings são iguais")
    }else{
        println("As Strings são diferentes")
    }

    //Usando apenas if
    if (primeiraString == segundaString) {
        println("As Strings são iguais")
    }else{
        println("As Strings são diferentes")
    }

    //Usando compareTo
    println("$primeiraString é igual a $segundaString? '  ${primeiraString.compareTo(segundaString, true) == 0}")
}

