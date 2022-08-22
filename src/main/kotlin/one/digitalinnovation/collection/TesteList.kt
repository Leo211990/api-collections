package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("Joao", salario =  1000.0)
    val pedro = Funcionario("Pedro", salario =  2000.0)
    val maria = Funcionario("Maria", salario =  4000.0)

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("-------------------------------------------")
    println(funcionarios.find { it.nome == "Maria" })

}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}