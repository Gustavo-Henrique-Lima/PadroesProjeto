package factory;

public abstract class Inimigos {

	double hp;
	String name;
	String description;
	
	public String getName() 
	{
		return name;
	}

	public String getDescription() 
	{
		return description+" eles tem "+getHp()+" de vida.";
	}

	public double getHp() 
	{
		return hp;
	}
}