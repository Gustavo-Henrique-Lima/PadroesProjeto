package facade;

public class PedidoFacade {
	/*
	private ServicoEstoque estoque;
	private ServicoPagamento pagamento;
	private ServicoRemessa remessa;
	
	public PedidoFacade()
	{
	}
	
	public PedidoFacade(ServicoEstoque estoque, ServicoPagamento pagamento, ServicoRemessa remessa) {
		this.estoque = estoque;
		this.pagamento = pagamento;
		this.remessa = remessa;
	}
	*/

	public static void registrarPedido(Produto produto)
	{
		ServicoEstoque.isAvailable(produto);
		ServicoPagamento.makePayment();
		ServicoRemessa.shipProduct(produto);
	}
}