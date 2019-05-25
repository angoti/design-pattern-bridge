package lista.de.palavras;

import java.util.Collections;

public class ListaOrdenada extends Listas {

	@Override
	public void adicionar(String s) {
		lista.add(s);
		Collections.sort(lista);
	}

}
