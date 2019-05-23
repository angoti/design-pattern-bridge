package calculo.ordemdecompra.template.method;

public class EntregaExpressaAtacado extends Pedido {

	protected double modalidadeComercializao(double precoPadrao) {
		return precoPadrao*0.90;//para o atacado o pre�o �  90% do pre�o padr�o
	}

	@Override
	protected double entrega() {
		return 30;
	}

}
