package lista.de.palavras;

import java.util.List;

public class ImprimeComMarcador implements ImpressorDeListas {

	@Override
	public void imprimir(List<String> lista) {
		for (String palavra : lista) {
			System.out.println("- "+palavra);
		}
	}

}
