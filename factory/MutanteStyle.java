package factory;

import java.util.Random;

public class MutanteStyle extends Inimigos{
	private final static int min = 1;
	private final static int max = 100;
	private final static Random random=new Random();
	
	public MutanteStyle()
	{
		hp=random.nextInt(max + min) + min;
		name="Mutante";
		description="Mutantes são seres com superforça";
	}
}