package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Cenario {

	String name;
	List<Inimigos> inimigo=new ArrayList<>();
	
	void iniciar()
	{
		System.out.println("Os inimigos estão a caminho!!\nPrepare-se!!");
	}

	public String getName() 
	{
		return name;
	}

	public void addEnemy(Inimigos e)
	{
		inimigo.add(e);
	}
		
}