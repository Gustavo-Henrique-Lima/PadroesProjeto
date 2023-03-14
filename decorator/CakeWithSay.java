package decorator;

public class CakeWithSay extends Decoracoes {
	
	private String fala;
	
	public CakeWithSay(Cake cake,String fala) 
	{
		this.cake = cake;
		this.fala=fala;
	}

	@Override
	public String getDescription() 
	{
		return cake.getDescription()+" with saying "+fala;
	}

	@Override
	public int getCost()
	{
		return cake.getCost()+0;
	}
}