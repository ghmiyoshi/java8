package br.com.alura.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println("Data de hoje: " + hoje);

		LocalDate copaDoMundo = LocalDate.of(2022, Month.NOVEMBER, 21);
		System.out.println("Copa do mundo no Catar: " + copaDoMundo);

		int anos = copaDoMundo.getYear() - hoje.getYear();
		System.out.println("Quantos anos faltam para a pŕoxima copa: " + anos + " anos");

		Period periodo = Period.between(hoje, copaDoMundo);
		System.out.println("Período: " + periodo);

		LocalDate proximaCopa = copaDoMundo.plusYears(4);
		System.out.println("Próxima copa do mundo: " + proximaCopa);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Próxima copa do mundo data formatada: " + proximaCopa.format(formatador));
//		String dataFormatada = formatador.format(proximaCopa);
//		System.out.println(dataFormatada);

		// LocalDateTime classe para trabalhar com medida de tempo
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

		System.out.println("Data de hoje com horas: " + agora);
		System.out.println("Data de hoje com horas formatada: " + agora.format(formatadorComHoras));

		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);

	}

}
