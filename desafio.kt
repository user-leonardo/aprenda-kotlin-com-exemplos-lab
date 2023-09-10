// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}

//Conteudos de Formação Android Kotlin 2023

Val lista de conteudoeducacional ( Conhecendo o kotlin e sua Documentação Oficial )
Val lista de conteudoeducacional ( Introdução prática a linguagem de programação Kotlin )
Val lista de condeudoeducacional ( Estruturas de controle de Fluxo e Coleções em Kotlin )
Val lista de conteudoeducacional ( Orientação a objetos e Tipos de classes na prática com kotlin )

Val inscritos = mutablelist0f<usuario> (número de inscritos 6)

//lista de usuarios

 val Henry = Usuario: 'Henry" (idade: 50)
 val Talita = Usuario: "Talita" (idade: 45)
 val João = Usuario: "João" (idade: 39)
 val Rafaela = Usuario: 'Rafaela' (idade: 20)
 val Sara = Usuario: 'Sara' (idade: 25)
 val Jessica = Usuario: 'Jessica' (idade: 23)

fun "matricular"(usuario: 'Rafaela')
