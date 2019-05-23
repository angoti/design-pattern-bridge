package calculo.ordemdecompra.bridge;

public abstract class Pedido {
	protected TipoComercializacao tipoComercializacao;
	
	public double total(double precoPadrao) {
		return tipoComercializacao.modalidadeComercializao(precoPadrao)+entrega();
	}

	protected abstract double entrega();

	public TipoComercializacao getTipoComercializacao() {
		return tipoComercializacao;
	}

	public void setTipoComercializacao(TipoComercializacao tipoComercializacao) {
		this.tipoComercializacao = tipoComercializacao;
	}
}
