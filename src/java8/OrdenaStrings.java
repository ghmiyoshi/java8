package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		// ComparatorLenght comparador = new ComparatorLenght();
		// Consumidor consumidor = new Consumidor();

		// Collections.sort(palavras, comparador);

		palavras.sort((s1,s2) ->{
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;			
		});
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//		for(String palavra : palavras) {
//			System.out.println(palavra);
//		}

		palavras.forEach(palavra -> System.out.println(palavra));

	}

}

//class ComparatorLenght implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//
//}
//
//class Consumidor implements Consumer<String> {
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//
//	}
//
//}
