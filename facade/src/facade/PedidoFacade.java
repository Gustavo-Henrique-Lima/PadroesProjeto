package facade;

public class PedidoFacade {
	
	public static void registrarPedido(Produto produto)
	{
		ServicoEstoque.isAvailable(produto);
		ServicoPagamento.makePayment();
		ServicoRemessa.shipProduct(produto);
	}
}