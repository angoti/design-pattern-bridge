package lanchonete2;

public class Sistema {
	public static void main(String[] args) {
		
		Tamanho grande = new TamanhoGrande();
		Tamanho pequeno = new TamanhoPequeno();
		Refrigerante cocaPequena = new CocaCola(pequeno);
		Refrigerante guaranaGrande = new Guarana(grande);
		cocaPequena.beber();
		guaranaGrande.beber();
	}
}
