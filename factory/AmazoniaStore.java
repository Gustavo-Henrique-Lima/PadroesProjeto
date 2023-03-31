package factory;

public class AmazoniaStore extends CenarioStore{

	@Override
	protected Cenario createCenario(String type) 
	{
		if(type.equalsIgnoreCase("Amazonia"))
		{
			return new AmazoniaStyle();
		}
		else
		{
			return null;
		}
	}
}