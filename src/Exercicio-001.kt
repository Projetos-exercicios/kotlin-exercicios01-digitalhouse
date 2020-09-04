fun main() {
    //1) Escrever o código que deve analisar três números inteiros e retornar o maior deles.
    val primeiroNumero = 7
    val segundoNumero = 3
    val terceiroNumero = 23

    //Usando if
    if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero ){
        println("O $primeiroNumero é maior que $segundoNumero e que o $terceiroNumero")
    }else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
        println("O $segundoNumero é maior que $primeiroNumero e que o $terceiroNumero")
    }else if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero){
        println("O $terceiroNumero é maior que $primeiroNumero e que o $segundoNumero")
    }else{
        println("Os números são iguais")
    }

    //Usando when
    when {
        primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero -> println("O $primeiroNumero é maior que $segundoNumero e que o $terceiroNumero")
        segundoNumero > primeiroNumero && segundoNumero > terceiroNumero  -> println("O $segundoNumero é maior que $primeiroNumero e que o $terceiroNumero")
        terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero -> println("O $terceiroNumero é maior que $primeiroNumero e que o $segundoNumero")
        else -> println("Os números são iguais")
    }

    //Usando maxOf()
    println("O ${ maxOf(primeiroNumero, segundoNumero, terceiroNumero)} é o maior número")

    //Usando max() deprecated

    //Array
    val numeros = arrayOf(primeiroNumero, segundoNumero, terceiroNumero)

    //Usando maxOrNull
    println("O ${numeros.maxOrNull()} é o maior número")

    //Usando maxOf
     println("O ${numeros.maxOf{it}} é o maior número")
}
