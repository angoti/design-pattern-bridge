package lanchonete;

public class Sistema {
	public static void main(String[] args) {
		Refrigerante coca = new CocaCola();
		Refrigerante guarana = new Guarana();
		
		AbstracaoTamanho cocaPequena = new TamanhoPequeno(coca);
		AbstracaoTamanho guaranaGrande = new TamanhoGrande(guarana);
		cocaPequena.beber();
		guaranaGrande.beber();
	}
}
