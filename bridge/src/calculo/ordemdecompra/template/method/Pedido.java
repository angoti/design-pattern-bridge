package calculo.ordemdecompra.template.method;

public abstract class Pedido {
	
	public double total(double precoPadrao) {
		return modalidadeComercializao(precoPadrao)+entrega();
	}

	protected abstract double modalidadeComercializao(double precoPadrao);

	protected abstract double entrega();
}
