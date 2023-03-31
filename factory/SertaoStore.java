package factory;

public class SertaoStore extends CenarioStore{

	@Override
	protected Cenario createCenario(String type) 
	{
		if(type.equalsIgnoreCase("Sertão"))
		{
			return new SertaoStyle();
		}
		else
		{
			return null;
		}
	}

}