package lanchonete;

public abstract class AbstracaoTamanho {
	protected Refrigerante refrigerante;

	public AbstracaoTamanho(Refrigerante refrigerante) {
		this.refrigerante = refrigerante;
	}

	public abstract void beber();
}
