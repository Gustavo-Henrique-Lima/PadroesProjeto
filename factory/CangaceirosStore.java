package factory;

public class CangaceirosStore extends InimigoStore{

	@Override
	protected Inimigos createEnemy(String type) 
	{
		if(type.equals("Canganceiro 1"))
		{
			return new CangaceirosStyle();
		}
		else
		{
			return null;
		}
	}
}