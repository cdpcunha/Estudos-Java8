package ClassesDeEstudo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class J8Lambda {

	public static void OrdenarString() {
		ComparaPorTamanho comparator = new ComparaPorTamanho();
		Consumer<String> consumer = new ImprimePorLinha();

		List<String> listaStrings = new ArrayList<>();

		listaStrings.add("Primeira");
		listaStrings.add("Maior Palavra");
		listaStrings.add("String");
		listaStrings.add("Menor");

		System.out.println("=============================Ordena��o================================");

		System.out.print("Lista Desorganizada : \n" + listaStrings + "\n");

		Collections.sort(listaStrings);
		System.out.print("\nLista Organizadas pelo padr�o do Collections : \n" + listaStrings + "\n");

		listaStrings.sort(comparator);
		System.out.print("\nLista Organizada pelo Comparator criado : \n" + listaStrings + "\n");

		System.out.println("\nLista Organizada pela exp. Lambda : ");
		listaStrings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(listaStrings);

		System.out.println("=============================Impress�o================================");
		System.out.print("\nImpress�o da lista com o For enchanced : ");
		for (String x : listaStrings) {
			System.out.println(x);
		}

		System.out.print("\nImpress�o da lista com o Consumer : \n");
		listaStrings.forEach(consumer);

// simplificando a impress�o com lambda

		System.out.print("\nImpress�o com Lambda : \n");
		listaStrings.forEach(s -> System.out.println(s));
	}

}

class ComparaPorTamanho implements Comparator<String> {
//Comparator recebe um tipo na implementa��o da interface, e para todos elementos, faz a l�gica disposta
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1; // na comparacao, o 1 indica que o elemento tem prefer�ncia, no caso s1 sobre s2
		}
		if (s1.length() < s2.length()) {
			return -1;
		} else
			return 0;
	}
}

class ImprimePorLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}