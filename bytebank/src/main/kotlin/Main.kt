fun main() {
    println("Bem vindo ao ByteBank")

    var i = 0
    while (i < 5){
        //atributos
        val titular = "Zendaya $i"
        val numeroConta = 1000 +i
        var saldo = i + 10.00

        println("Titular: $titular")
        println("Número da Conta: $numeroConta")
        println("Saldo Atual: $saldo")
        println()
        i++
    }


//    //meu for vai rodar em ordem decrescente(downTo) e de 2 em dois(step)
//    for (i in 10 downTo 5 step 2){
//
//        //parando o laço de repetição
//        if (i == 4){
//            break
//        }
//        //atributos
//        val titular = "Zendaya $i"
//        val numeroConta = 1000 +i
//        var saldo = i + 10.00
//
//        //println("Titular: "+titular) outra forma de fazer isso:
//        println("Titular: $titular")
//        println("Número da Conta: $numeroConta")
//        println("Saldo Atual: $saldo")
//        println()
//        }
    //    testaCondicoes(saldo)
}

fun testaCondicoes(saldo:Double){
    if (saldo > 0.00){
        println("Conta é positiva")
    } else if ( saldo == 0.00){
        println("Conta zerada. Neutra")
    } else {
        println("Conta é negativa")
    }

    //outra maneira de ter essas condições validas é usando o when:
//    when{
//        saldo > 0.0 -> println("Conta é positiva")
//        saldo == 0.00 -> println("Conta zerada. Neutra")
//        else -> println("Conta é negativa")
//    }
}