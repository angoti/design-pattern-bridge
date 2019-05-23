package lanchonete;

public class TamanhoMedio extends AbstracaoTamanho {

	public TamanhoMedio(Refrigerante refrigerante) {
		super(refrigerante);
	}

	public void beber() {
		System.out.println("Tomando " + refrigerante + " médio");
	}
}
