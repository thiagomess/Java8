import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaisStreams {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		//FIltra os elementos, pega o primeiro, se tiver algum, imprime.
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.findFirst()
			.ifPresent(c -> System.out.println(c.getNome()));
		System.out.println("");
		
		//FIltra os elementos, pega um, se tiver algum grava na variavel, caso contrario retorna null
		String nome = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.findAny()
			.orElse(null)
			.getNome();
		System.out.println(nome);
		System.out.println("");
		
		//Pega o valor de todos os alunos e calulca a media e imprime. Caso nao quisesse imprimir, poderia ter terminado com getAsDouble.
		cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average()
			.ifPresent(System.out::println);
		System.out.println("");
		
		
		//Realiza um filtro e transforma o Stream novamente em Lista, podendo ser Lista, set, Map
		List<Curso> listaCursosNova = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList());
		
		listaCursosNova.forEach(c -> System.out.println(c.getNome()));
		System.out.println("");
		
		
	}
}
