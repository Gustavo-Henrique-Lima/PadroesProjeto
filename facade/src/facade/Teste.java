package facade;

public class Teste {

	public static void main(String[] args) {
		/*
		 ServicoEstoque estoque=new ServicoEstoque();
		 ServicoPagamento pagamento=new ServicoPagamento();
		 ServicoRemessa remessa=new ServicoRemessa();
		 */
		Produto p1=new Produto(200, "PS5");
		PedidoFacade.registrarPedido(p1);
	}
}