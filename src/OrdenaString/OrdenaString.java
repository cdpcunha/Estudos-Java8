package OrdenaString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {

		ComparaPorTamanho comparator = new ComparaPorTamanho();
		Consumer<String> consumer = new ImprimePorLinha();

		List<String> listaStrings = new ArrayList<>();

		listaStrings.add("Primeira");
		listaStrings.add("Maior Palavra");
		listaStrings.add("String");
		listaStrings.add("Menor");

		System.out.print("Lista Desorganizada : \n" + listaStrings + "\n");

		Collections.sort(listaStrings);
		System.out.print("\nLista Organizadas pelo padrão do Collections : \n" + listaStrings + "\n");

		listaStrings.sort(comparator);
		System.out.print("\nLista Organizada pelo Comparator criado : \n" + listaStrings + "\n");

		System.out.print("\nImpressão da lista com o For enchanced : ");
		for(String x : listaStrings) {
			System.out.println(x);
		}
		
		System.out.print("\nImpressão da lista com o Consumer :");
		listaStrings.forEach(consumer);
	}

}

class ComparaPorTamanho implements Comparator<String> {
//Comparator recebe um tipo na implementação da interface, e para todos elementos, faz a lógica disposta
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1; // na comparacao, o 1 indica que o elemento tem preferência, no caso s1 sobre s2
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
