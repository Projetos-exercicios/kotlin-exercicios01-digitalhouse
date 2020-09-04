fun main() {
//5) Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD, retornar true, caso contrário, retornar false.

    val numA = 7
    val numB = 3
    val numC = 23
    val numD = 15

    //Usando if
    if( (numA > numC && numA >numD)  || (numB > numC && numB > numD) ){
        println(true)
     }else{
        println(false)
    }

    //Usando when
    when {
        (numA > numC && numA >numD)  || (numB > numC && numB > numD) -> println(true)
         else -> println(false)
    }
}
