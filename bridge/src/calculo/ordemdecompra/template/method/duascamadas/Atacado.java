package calculo.ordemdecompra.template.method.duascamadas;

public abstract class Atacado extends Pedido {

	@Override
	protected double modalidadeComercializao(double precoPadrao) {
		return precoPadrao*0.90;
	}
}
