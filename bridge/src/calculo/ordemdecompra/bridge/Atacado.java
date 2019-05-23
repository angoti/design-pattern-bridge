package calculo.ordemdecompra.bridge;

public class Atacado implements TipoComercializacao {
	@Override
	public double modalidadeComercializao(double precoPadrao) {
		return precoPadrao*0.90;
	}
}
