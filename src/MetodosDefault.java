import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MetodosDefault {
	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("Paralelelepipido","Guilherme", "Thiago");
		
		Consumer<String> consumidor = new ImprimePalavras();
		palavras.forEach(consumidor);
	
		Comparator<String> comparador = new ComparaPalavrasPeloTamanho();
		palavras.sort(comparador);
		System.out.println(palavras);
	}

}

class ImprimePalavras implements Consumer<String>{

	@Override
	public void accept(String p) {
		System.out.println(p);
	}
}

class ComparaPalavrasPeloTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
}
