package factory;

public class RioDeJaneiroStore extends CenarioStore{

	@Override
	protected Cenario createCenario(String type) 
	{
		if(type.equalsIgnoreCase("Rio de Janeiro"))
		{
			return new RioDeJaneiroStyle();
		}
		else
		{
			return null;
		}
	}
}