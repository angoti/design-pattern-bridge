package lista.de.palavras;

import java.util.List;

public class ImprimeComNumeros implements ImpressorDeListas {

	@Override
	public void imprimir(List<String> lista) {
		int n = 1;
		for (String palavra : lista) {
			System.out.println(n++ +" "+palavra);
		}

	}

}
