package factory;

public class CriminosoStore extends InimigoStore{

	@Override
	protected Inimigos createEnemy(String type) 
	{
		if(type.equals("Criminoso 1"))
		{
			return new CriminosoStyle();
		}
		else
		{
			return null;
		}
	}
}