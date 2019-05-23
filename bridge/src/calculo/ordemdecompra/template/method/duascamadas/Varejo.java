package calculo.ordemdecompra.template.method.duascamadas;

public abstract class Varejo extends Pedido {
	@Override
	protected double modalidadeComercializao(double precoPadrao) {
		return precoPadrao;
	}
}
