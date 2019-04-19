package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStringsComMethodReferences {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		System.out.println("*** Lista de palavras ***");
		palavras.forEach(System.out::println);
		palavras.forEach(s -> System.out.println(s));

		System.out.println("\n*** Lista ordenada pelo tamanho dos caracteres ***");
		// Cria a Function, cria o Comparator e faz o Sort
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

		// Passo a passo
		// Cria Função (Classe anônima) - Método 1
		Function<String, Integer> funcao = new Function<String, Integer>() {

			@Override
			public Integer apply(String string) {
				return string.length();
			}
		};

		// Cria Função (Method References) - Método 2
		Function<String, Integer> funcao1 = String::length;

		// Cria Função (Lambda) - Método 3
		Function<String, Integer> funcao2 = s -> s.length();

		// Cria Comparator passando a função
		Comparator<String> comparador = Comparator.comparing(funcao);

		// Faz o sort passando o Comparator
		palavras.sort(comparador);

		System.out.println(palavras);

		// Cria o Consumer e faz o forEach
		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);

		// Passo a passo
		// Cria o Consumer
		Consumer<String> impressor2 = s -> System.out.println(s);
		Consumer<String> impressor = System.out::println;

		// Faz o forEach passando o Consumer
		palavras.forEach(impressor2);

	}

}
