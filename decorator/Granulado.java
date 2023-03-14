package decorator;

public class Granulado extends Decoracoes {
	
	public Granulado(Cake cake) 
	{
		this.cake = cake;
	}

	@Override
	public String getDescription() 
	{
		return cake.getDescription()+" with sprinkles";
	}
	
	@Override
	public int getCost()
	{
		return cake.getCost()+2;
	}
}