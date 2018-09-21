import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambdas {

	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("Paralelelepipido", "Guilherme", "Thiago");

		// Chamando classe anonima
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println(""); // pula linha

		// Mesmo codigo acima usando LAMBDA
		palavras.forEach(t -> System.out.println(t));

		System.out.println(""); // pula linha

		// Chamando classe anonima
		palavras.sort(new Comparator<String>() {
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
		});
		System.out.println(palavras);
		System.out.println(""); // pula linha

		// vira este com lambda
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);

		System.out.println(""); // pula linha

		// Chamando classe anonima
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Executando um Runnable");
			}

		}).start();

		// vira este com lambda
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}

}
