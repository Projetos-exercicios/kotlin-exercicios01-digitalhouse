fun main() {
//3) Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, retorna false.

    val numero = 6

    //Usando if comum
    if ( numero % 2 == 0 ){
        println(true)
    }else{
        println(false)
    }

    //Usando if direto
    println(if (numero % 2 == 0) true else false)

    //Usando if e rem
    println( if(numero.rem(2)==0 ) true else false )

}