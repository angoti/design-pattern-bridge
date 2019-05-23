package calculo.ordemdecompra.template.method;

public class EntregaNormalAtacado extends Pedido {

	@Override
	protected double modalidadeComercializao(double precoPadrao) {
		return precoPadrao*0.90;
	}

	@Override
	protected double entrega() {
		return 0;
	}

}
