Algoritmo "EXERCICIO 8"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/09/2022
Var
   // Seção de Declarações das variáveis
   contador, expo,base,resultado:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite o valor da base: ")
   leia(base)
   escreval("Digite o valor do expoente: ")
   leia(expo)
   resultado <- 1
   para contador de 1 ate expo passo 1 faca
      resultado<- resultado * base

   fimpara
   escreval(base," elevado a ", expo, " é ",resultado)

Fimalgoritmo