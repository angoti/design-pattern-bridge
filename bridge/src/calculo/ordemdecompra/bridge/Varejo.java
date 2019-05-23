package calculo.ordemdecompra.bridge;

public class Varejo implements TipoComercializacao {

	@Override
	public double modalidadeComercializao(double precoPadrao) {
		return precoPadrao;
	}
}
