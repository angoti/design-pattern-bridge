package calculo.ordemdecompra.template.method;

public class Sistema {
	public static void main(String[] args) {
		Pedido eea = new EntregaExpressaAtacado();
		Pedido eev = new EntregaExpressaVarejo();
		Pedido ena = new EntregaNormalAtacado();
		Pedido env = new EntregaNormalVarejo();
		
		System.out.println("O valor a ser pago será:\n");
		System.out.println("Entrega expressa no atacado: "+ eea.total(100.0));

		System.out.println("Entrega expressa no varejo: "+ eev.total(100.0));
		
		System.out.println("Entrega normal no atacado: "+ ena.total(100.0));
		
		System.out.println("Entrega normal no varejo: "+ env.total(100.0));
	}
}
