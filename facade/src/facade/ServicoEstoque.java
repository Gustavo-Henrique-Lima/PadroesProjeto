package facade;

public class ServicoEstoque
{
	
	public static boolean isAvailable(Produto product)
	{
		System.out.println(product.getName()+" disponível");
		return true;
	}
}