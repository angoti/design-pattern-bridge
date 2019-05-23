package lanchonete;

public class TamanhoGrande extends AbstracaoTamanho {

	public TamanhoGrande(Refrigerante refrigerante) {
		super(refrigerante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beber() {
		System.out.println("Tomando " + refrigerante + " grande");
	}

}
