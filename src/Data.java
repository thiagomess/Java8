import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	public static void main(String[] args) {
		
		
		//Data de hoje, ex: 2018-09-25
		LocalDate hoje = LocalDate.now();
		System.out.println("hoje é: \n" +  hoje);
		
		//seta a data que voce quer
		LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println("O futuro é: \n" + futuro);
		
		//Periodo entre duas datas
		Period periodo = Period.between(hoje, futuro);
		System.out.println("A diferenca entre a data de hoje com futuro é: \n" + periodo); //80 anos e 4 meses
		
		
		LocalDateTime futuroDataHora = LocalDateTime.of(2099, 1, 25, 15, 30);
		LocalTime hojeDataHora = LocalTime.now();
		
		//duração em horas entre dois parametros
		Duration duracao = Duration.between(hojeDataHora, futuroDataHora);
		System.out.println("Comparação de horas entre dois LocalDateTime: \n" + duracao); //hora, minuto, segundos
		
		//Cria formatador para a data
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data formatada: \n" + hoje.format(formatador));
	}
}
