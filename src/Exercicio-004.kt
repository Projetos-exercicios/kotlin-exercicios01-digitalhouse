fun main() {
//4) Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares.

    //Usando while
    var numerosImpares = 0
    var contador = 0

     while(contador <= 100) {
        if(numerosImpares % 2 != 0) {
            println(" ($contador) -  $numerosImpares")
            contador++
        }
         numerosImpares++
     }

    //Usando for
    val numImpares = 100
    print(numImpares)
    for (cont in 1..numImpares) {
        if (cont % 2 != 0) {
            print(cont)
        }
    }


}
