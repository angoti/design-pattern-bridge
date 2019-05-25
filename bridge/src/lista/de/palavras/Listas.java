// Abstraction

package lista.de.palavras;

import java.util.ArrayList;
import java.util.List;

public abstract class Listas {
	private ImpressorDeListas impressorDeListas;
	protected List<String> lista;

	public Listas(ImpressorDeListas impressorDeListas) {
		super();
		this.impressorDeListas = impressorDeListas;
	}

	public Listas() {
		super();
		this.lista = new ArrayList<String>();
	}

	public void imprimir() {
		impressorDeListas.imprimir(lista);
	}

	public abstract void adicionar(String s);

	public void setImpressorDeListas(ImpressorDeListas impressorDeListas) {
		this.impressorDeListas = impressorDeListas;
	}

}
