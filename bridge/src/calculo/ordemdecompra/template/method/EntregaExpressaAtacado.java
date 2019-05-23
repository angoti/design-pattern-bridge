package calculo.ordemdecompra.template.method;

public class EntregaExpressaAtacado extends Pedido {

	protected double modalidadeComercializao(double precoPadrao) {
		return precoPadrao*0.90;//para o atacado o preço é  90% do preço padrão
	}

	@Override
	protected double entrega() {
		return 30;
	}

}
