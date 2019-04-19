package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.alura.modelo.Curso;

public class ExemploCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("javaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// cursos.sort((s1,s2) -> s1.getAlunos() - s2.getAlunos());
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//cursos.forEach(System.out::println);
		cursos.forEach(curso -> System.out.println("Curso: " + curso.getNome()));
		
		System.out.println("\nQuantidade de alunos dos cursos com 100 ou mais alunos: ");
		cursos.stream()
			  .filter(curso -> curso.getAlunos() >= 100)
			  .forEach(curso -> System.out.println(curso.getNome()));
		
		cursos.stream()
			  .filter(curso -> curso.getAlunos() >=100)
			  .map(Curso::getAlunos)
			  .forEach(System.out::println);
		
		
		int total = cursos.stream()
		  .filter(curso -> curso.getAlunos() >= 100)
		  .mapToInt(Curso::getAlunos) //.mapToInt(curso -> curso.getAlunos())
		  .sum();
		
		System.out.println("\nTotal de alunos nos cursos com 100 ou mais alunos: " + total + " alunos");
		

	}

}
