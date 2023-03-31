package factory;

public abstract class CenarioStore {

	public Cenario orderCenario(String type)
	{
		Cenario cenario;
		
		cenario=createCenario(type);
		cenario.iniciar();
		
		return cenario;
	}
	
	protected abstract Cenario createCenario(String type);
}