# Java 8
Novos recursos da linguagem.

## Resumo
Default methods é o primeiro recurso, foi uma forma que o Java encontrou para evoluir interfaces antigas, sem gerar incompatibilidades. A dificuldade e verbosidade da sintaxe das classes anônimas em vista, o Java 8 trouxe uma nova forma de implementar essas interfaces ainda mais sucinta. É a sintaxe do lambda, em vez de escrever a classe anônima, deixamos de escrever alguns itens que podem ser inferidos. Nas interfaces que só tem um método, não é preciso escrever o nome do método e nem dar new, apenas declarar os argumentos e o bloco a ser executado, separados por ->. É muito comum escrever lambdas curtos, que simplesmente invocam um único método, exemplo s -> s.length(). Dada uma String, invoque e retorne o método length. Por esse motivo, há uma forma de escrever esse tipo de lambda de uma forma ainda mais reduzida com os methods references, String::length. Streams para trabalhar com coleções, usando métodos filter(), map(), mapToInt(), sum(), findAny(). Classe Optional para trabalhar de uma maneira mais organizada com possíveis valores null, gerar uma coleção a partir de um Stream. A nova API de datas, utilizar a classe LocalDate, Period, LocalDateTime, presente no pacote java.time.

## Conclusão
Este curso abordou os seguintes tópicos:

* Default Methods
  * Possibilita adicionar métodos em interfaces e implementá-los ali mesmo;
  * Método default adicionado as coleções do Java: o forEach na interface Iterable. Como Iterable é mãe de Collection, temos acesso a esse método na nossa lista;
  * List.forEach recebe um Consumer, que é uma das muitas interfaces do novo pacote java.util.functions.
    
* Que venham os lambdas!
  * Interfaces Consumer e Comparator;
  * Em vez de usarmos classes anônimas, utilizamos o lambda para escrever códigos simples e sucintos;
  * A sintaxe do lambda funciona para qualquer interface que tenha apenas um método abstrato.
    
* Código mais sucinto com Method References
  * Faz uma referência ao método, exemplos: 
   * palavras.sort(Comparator.comparing(String::length));
   * palavras.forEach(System.out::println).
   
* Streams: trabalhando melhor com coleções
  * Nova interface, a Stream;
  * Método filter(), que recebe um predicado (um critério), que deve devolver verdadeiro ou falso, dependendo se você deseja filtrá-lo ou não;
  * Método map(), para filtrar no fluxo (Stream) de objetos um novo fluxo;
  * Método sum(), para trabalhar com inteiros.

* Mais Stream, Collectors e APIs
  * Conhecer outros métodos interessantes dos Streams, findAny();
  * Nova classe do Java 8, Optional;
  * Dado um Optional, podemos pegar seu conteúdo invocando o get(). Ele vai devolver o que queremos, mas se não houver nenhum uma exception será lançada;
  * O método orElse() diz que ele deve devolver o que existe dentro do optional, ou então o que foi passado como argumento;
  * O método ifPresent() executa um lambda (um Consumer) no caso de existir um curso dentro daquele optional;
  * A classe Collectors é cheio de factory methods que ajudam na criação de coletores. Um dos coletores mais utilizados é o retornado por Collectors.toList();
  * É através dos coletores que podemos "retornar" de um Stream para uma Collection;
  * Um exemplo mais complicado gerando mapas, um Map<String, Integer>. Utilizamos o Collectors.toMap, ele recebe duas Functions., a primeira indica o que vai ser a chave e a segunda o que será o valor.
 
* A nova API de datas
  * Conhecendo mais da API LocalDate, LocalDateTime, Period;
  * Incrementando e decrementando datas;
  * Toda a API de datas é imutável. Ela nunca vai alterar a data original;
  * Formatando datas e trabalhando com medida de tempo. 
  


  
  
 
 
   
  
