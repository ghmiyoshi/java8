package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		System.out.println("*** Lista de palavras ***");
		Consumidor consumidor = new Consumidor();
		palavras.forEach(consumidor);

//		for (String palavra : palavras) {
//			System.out.println(palavra);
//		}

		System.out.println("\n*** Lista ordenada pelo tamanho dos caracteres ***");
		ComparatorLenght comparador = new ComparatorLenght();
		palavras.sort(comparador);

		for (String palavra : palavras) {
			System.out.println(palavra);
		}

		// Collections.sort(palavras, comparador);

	}

}

class ComparatorLenght implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}

class Consumidor implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);

	}

}
