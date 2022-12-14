package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("Joao", salario =  2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario("Pedro", salario =  1500.0, tipoContratacao = "PJ")
    val maria = Funcionario("Maria", salario =  4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("-------------------------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("-------------------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("-------------------------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }



}


