package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStringsComLambdas {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		System.out.println("*** Lista de palavras ***");
		palavras.forEach(palavra -> System.out.println(palavra));

		System.out.println("\n*** Lista ordenada pelo tamanho dos caracteres ***");
		palavras.sort((string1, string2) -> string1.length() - string2.length());

		// sort com Comparator.comparing()
		palavras.sort(Comparator.comparing(s -> s.length()));

		palavras.forEach(palavra -> System.out.println(palavra));

//		palavras.sort((s1, s2) -> {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	});

	}

}
