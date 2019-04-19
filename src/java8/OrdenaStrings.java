package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		ComparatorLenght comparador = new ComparatorLenght();
		
		// Collections.sort(palavras, comparador);
	
		palavras.sort(comparador);

//		for(String palavra : palavras) {
//			System.out.println(palavra);
//		}

		palavras.forEach(palavra -> System.out.println(palavra));

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
