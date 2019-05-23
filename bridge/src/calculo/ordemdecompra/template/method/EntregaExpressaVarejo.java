package calculo.ordemdecompra.template.method;

public class EntregaExpressaVarejo extends Pedido {

	@Override
	protected double modalidadeComercializao(double precoPadrao) {
		return precoPadrao;
	}

	@Override
	protected double entrega() {
		return 30;
	}

}
