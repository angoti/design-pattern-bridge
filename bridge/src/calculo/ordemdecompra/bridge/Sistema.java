package calculo.ordemdecompra.bridge;

public class Sistema {
	public static void main(String[] args) {
		TipoComercializacao atacado = new Atacado();
		TipoComercializacao varejo = new Varejo();
		
		Pedido ee = new EntregaExpressa();		
		Pedido en = new EntregaNormal();
		
		System.out.println("O valor a ser pago será:\n");

		ee.setTipoComercializacao(atacado);
		System.out.println("Entrega expressa no atacado: "+ ee.total(100.0));

		ee.setTipoComercializacao(varejo);
		System.out.println("Entrega expressa no varejo: "+ ee.total(100.0));
		
		en.setTipoComercializacao(atacado);
		System.out.println("Entrega normal no atacado: "+ en.total(100.0));
		
		en.setTipoComercializacao(varejo);
		System.out.println("Entrega normal no varejo: "+ en.total(100.0));
	}
}
