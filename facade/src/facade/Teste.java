package facade;

public class Teste {

	public static void main(String[] args) {
		
		Produto p1=new Produto(200, "PS5");
		PedidoFacade.registrarPedido(p1);
	}
}