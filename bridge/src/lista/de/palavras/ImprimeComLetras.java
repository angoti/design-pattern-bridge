package lista.de.palavras;

import java.util.List;

public class ImprimeComLetras implements ImpressorDeListas {

	@Override
	public void imprimir(List<String> lista) {
		char letra = 'a';
		for (String palavra : lista) {
			System.out.println(letra++ +" "+palavra);
		}
	}

}
