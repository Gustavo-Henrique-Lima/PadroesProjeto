package factory;

import java.util.Random;

public class CriminosoStyle extends Inimigos{
	private final static int min = 1;
	private final static int max = 100;
	private final static Random random=new Random();
	
	public CriminosoStyle()
	{
		hp=random.nextInt(max + min) + min;
		name="Crimonosos";
		description="Criminosos são homens que andam armados e\nespalhando terror ";
	}
}