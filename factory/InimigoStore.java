package factory;

public abstract class InimigoStore {

	public Inimigos orderInimigo(String type)
	{
		Inimigos inimigo;
		
		inimigo=createEnemy(type);
		
		return inimigo;
	}
	
	protected abstract Inimigos createEnemy(String type);
}