package decorator;

public class CakeLayers extends Decoracoes {
	
	public CakeLayers(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() 
	{
		return "Multi-layered " + cake.getDescription();
	}
	
	@Override
	public int getCost()
	{
		return cake.getCost()+5;
	}
}