import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		//Ordenando os cursos pelo numero de alunos usando Method Defaults
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		//exibindo a lista pelo nome apos ordenada.
		cursos.forEach(s -> System.out.println(s.getNome()));
		System.out.println("");
		
		//Efetua uma verificação de todos os cursos com mais de 50 alunos e exibe pelo foreach
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.forEach(c -> System.out.println(c.getNome()));
		System.out.println("");
		
		//transformar o Stream<Curso> em um Stream<String>
		Stream<String> map = cursos.stream().map(Curso::getNome);
		System.out.println("");
		
		//Pegando a quantidade de alunos com lambda
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.map(c -> c.getAlunos())
			.forEach(c -> System.out.println(c));
		System.out.println("");
		
		//Pegando a quantidade de alunos com lambda
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.map(c -> c.getAlunos())
			.forEach(c -> System.out.println(c));
		System.out.println("");
		
		//Pegando a quantidade de alunos com method reference
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
		//A soma de todos os alunos
		int sum = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.mapToInt(Curso::getAlunos)
			.sum();
		
		System.out.println("");
		System.out.println("A soma é: " + sum);
		
		//retorna o primeiro da lista
		int asInt = cursos.stream()
				.filter(c -> c.getAlunos() > 50)
				.mapToInt(Curso::getAlunos)
				.findFirst()
				.getAsInt();
		System.out.println("");
		System.out.println(asInt);
		

	}

}
