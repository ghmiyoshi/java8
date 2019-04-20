# Java 8
Novos recursos da linguagem

## Resumo
Default methods é o primeiro recurso que conhecemos, foi uma forma que o Java encontrou para evoluir interfaces antigas, sem gerar incompatibilidades. A dificuldade e verbosidade da sintaxe das classes anônimas em vista, o Java 8 trouxe uma nova forma de implementar essas interfaces ainda mais sucinta. É a sintaxe do lambda. Em vez de escrever a classe anônima, deixamos de escrever alguns itens que podem ser inferidos. Como essa interface só tem um método, não precisamos escrever o nome do método. Também não daremos new. Apenas declararemos os argumentos e o bloco a ser executado, separados por ->

## Conclusão
Este curso abordou os seguintes tópicos:

* Default Methods
  * Possibilita adicionar métodos em interfaces e implementá-los ali mesmo;
  * Método default adicionado as coleções do Java: o forEach na interface Iterable. Como Iterable é mãe de Collection, temos acesso a esse método na nossa lista;
  * List.forEach recebe um Consumer, que é uma das muitas interfaces do novo pacote java.util.functions;
    
* Que venham os lambdas!
  * Interfaces Consumer e Comparator
  * Em vez de usarmos classes anônimas, utilizamos o lambda para escrever códigos simples e sucintos;
  * A sintaxe do lambda funciona para qualquer interface que tenha apenas um método abstrato.
    
* Código mais sucinto com Method References
  *
