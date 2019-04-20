# Java 8
Novos recursos da linguagem.

## Resumo
Default methods é o primeiro recurso, foi uma forma que o Java encontrou para evoluir interfaces antigas, sem gerar incompatibilidades. A dificuldade e verbosidade da sintaxe das classes anônimas em vista, o Java 8 trouxe uma nova forma de implementar essas interfaces ainda mais sucinta. É a sintaxe do lambda, em vez de escrever a classe anônima, deixamos de escrever alguns itens que podem ser inferidos. Nas interfaces que só tem um método, não é preciso escrever o nome do método e nem dar new, apenas declarar os argumentos e o bloco a ser executado, separados por ->. É muito comum escrever lambdas curtos, que simplesmente invocam um único método, exemplo s -> s.length(). Dada uma String, invoque e retorne o método length. Por esse motivo, há uma forma de escrever esse tipo de lambda de uma forma ainda mais reduzida com os methods references, String::length.

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
  * Faz uma referência ao método. 
   * palavras.sort(Comparator.comparing(String::length));
   * palavras.forEach(System.out::println).
   
* Streams: trabalhando melhor com coleções
 * Nova interface, a Stream;
 * Método filter(), que recebe um predicado (um critério), que deve devolver verdadeiro ou falso, dependendo se você deseja filtrá-lo ou não;
 * Método map(), para filtrar no fluxo (Stream) de objetos um novo fluxo;
 * Método sum(), para trabalhar com inteiros.
 
 
   
  
