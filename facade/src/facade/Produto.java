package facade;

public class Produto {

	public int productId;
	public String name;
	
	public Produto()
	{
		
	}
	
	public Produto(int idProduto, String name)
	{
		this.productId=idProduto;
		this.name=name;
	}

	public int getProductId()
	{
		return productId;
	}

	public void setProductId(int productId)
	{
		this.productId = productId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
}