import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MetodosReferences {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("Paralelepipido", "Guilherme", "Thiago");
		
		//Usando Lambda
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length()); 
		});
		System.out.println(palavras);
		System.out.println("");
		
		//Embaralhando
		Collections.shuffle(palavras);
		System.out.println(palavras);
		System.out.println("");
		
		//Métodos default em Comparator
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);
		System.out.println("");
		
		//Embaralhando
		Collections.shuffle(palavras);
		System.out.println(palavras);
		System.out.println("");
		
		
		//Usando Method references para comparar por ordem de tamanho
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
		System.out.println("");
		
		//Compara pela ordem alfabetica
		palavras.sort(Comparator.naturalOrder());
		System.out.println(palavras);
		System.out.println("");
		
		//ForEach com lambda
		palavras.forEach(s -> {System.out.println(s);});
		System.out.println("");
		//ForEach com Method Default
		palavras.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
