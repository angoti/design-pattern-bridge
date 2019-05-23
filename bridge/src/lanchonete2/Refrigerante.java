package lanchonete2;

public abstract class Refrigerante {
	public Tamanho tamanho;
	
	public Refrigerante(Tamanho tamanho) {
		super();
		this.tamanho = tamanho;
	}

	public void beber() {
		System.out.println("bebendo "+ tamanho.volume()+" ml de "+tipo());
	}
	
	public abstract String tipo();
}
