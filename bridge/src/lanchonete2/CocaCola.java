package lanchonete2;

public class CocaCola extends Refrigerante {

	public CocaCola(Tamanho tamanho) {
		super(tamanho);
	}

	@Override
	public String tipo() {
		return "coca-cola";
	}
}
