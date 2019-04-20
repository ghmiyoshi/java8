package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.alura.modelo.Curso;

public class ExemploCollectors {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("javaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		// Calcula a média da quantidade de alunos nos cursos com 100 ou mais alunos
		OptionalDouble media = cursos.stream()
				.filter(curso -> curso.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)
				.average();
		
		System.out.println("Média: " + media);
		
		//  Quero um curso que tenha 100 ou mais alunos. Pode ser qualquer um deles (findAny)
		// o findAny devolve um Optional<Curso>. Optional é uma importante nova classe do Java 8. 
		// Com ele podemos trabalhar de uma maneira mais organizada com possíveis valores null. 
		// Em vez de ficar comparando if(algumaCoisa == null), o Optional já fornece uma série de métodos
		// para ajudar nessas situações. 
		
		System.out.println("\nQualquer curso que tem 100 ou mais alunos");
		cursos.stream()
			  .filter(curso -> curso.getAlunos() >= 100)
			  .findAny()
			  .ifPresent(curso -> System.out.println(curso.getNome()));
		
		// Passo a passo 
//		Optional<Curso> optionalCurso = cursos.stream()
//		.filter(curso -> curso.getAlunos() >= 100)
//		.findAny();
//
//      optionalCurso.ifPresent(curso -> System.out.println(curso.getNome()));
		
		// Gerando uma coleção a partir de um Stream - método collect que recebe um Collectors
		List<Curso> resultado = cursos.stream()
			  .filter(curso -> curso.getAlunos() >= 100)
			  .collect(Collectors.toList());
		
		System.out.println("\nMapa de cursos");
		cursos.stream()
			  .filter(curso -> curso.getAlunos() >= 100)
			  .collect(Collectors.toMap(
					  curso -> curso.getNome(),
					  curso -> curso.getAlunos()))
			  .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		
		System.out.println("\nCursos com 100 ou mais alunos");
		resultado.stream()
			  .forEach(curso -> System.out.println(curso.getNome()));
		
		
	}

}
