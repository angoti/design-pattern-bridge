package lanchonete;

public class TamanhoPequeno extends AbstracaoTamanho {
	
	public TamanhoPequeno(Refrigerante refrigerante) {
		super(refrigerante);
	}

	public void beber() {
		System.out.println("Tomando " + refrigerante + " pequeno");
	}
}
