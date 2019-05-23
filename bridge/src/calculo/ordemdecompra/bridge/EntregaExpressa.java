package calculo.ordemdecompra.bridge;

public class EntregaExpressa extends Pedido {

	@Override
	protected double entrega() {
		return 30.0;
	}


}
