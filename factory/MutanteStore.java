package factory;

public class MutanteStore extends InimigoStore{

	@Override
	protected Inimigos createEnemy(String type) 
	{
		if(type.equals("Mutante 1"))
		{
			return new MutanteStyle();
		}
		else
		{
			return null;
		}
	}
}