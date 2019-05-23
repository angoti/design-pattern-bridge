package calculo.ordemdecompra.template.method;

public class Produto {
	private double precoPadrao;

	public Produto(double d) {
		precoPadrao = d;
	}

	public double getPreco() {
		return precoPadrao;
	}

	public void setPreco(double preco) {
		this.precoPadrao = preco;
	}
}
