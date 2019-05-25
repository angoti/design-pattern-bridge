package lista.de.palavras;

public class Sistema {
	public static void main(String[] args) {
		ImpressorDeListas imprimeComMarcador = new ImprimeComMarcador();
		ImpressorDeListas imprimeComLetras = new ImprimeComLetras();
		ImpressorDeListas imprimeComNumeros = new ImprimeComNumeros();
		
		Listas listaNaoOrdenada = new ListaNaoOrdenada();
		Listas listaOrdenada = new ListaOrdenada();
		
		listaOrdenada.adicionar("Carro");
		listaOrdenada.adicionar("Avião");
		listaOrdenada.adicionar("Navio");
		listaOrdenada.adicionar("Bicicleta");

		listaNaoOrdenada.adicionar("Carro");
		listaNaoOrdenada.adicionar("Avião");
		listaNaoOrdenada.adicionar("Navio");
		listaNaoOrdenada.adicionar("Bicicleta");
		
		listaNaoOrdenada.setImpressorDeListas(imprimeComNumeros);
		listaNaoOrdenada.imprimir();
		System.out.println("---------------------------------");
		
		listaNaoOrdenada.setImpressorDeListas(imprimeComLetras);
		listaNaoOrdenada.imprimir();
		System.out.println("---------------------------------");
		
		listaNaoOrdenada.setImpressorDeListas(imprimeComMarcador);
		listaNaoOrdenada.imprimir();
		System.out.println("---------------------------------");
		
		System.out.println("\n\n");
		
		listaOrdenada.setImpressorDeListas(imprimeComNumeros);
		listaOrdenada.imprimir();
		System.out.println("---------------------------------");
		
		listaOrdenada.setImpressorDeListas(imprimeComLetras);
		listaOrdenada.imprimir();
		System.out.println("---------------------------------");
		
		listaOrdenada.setImpressorDeListas(imprimeComMarcador);
		listaOrdenada.imprimir();
		
	}
}
