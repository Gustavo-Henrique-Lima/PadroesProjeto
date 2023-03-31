package factory;

import java.util.Random;

public class CangaceirosStyle extends Inimigos{
	private final static int min = 1;
	private final static int max = 100;
	private final static Random random=new Random();
	
	public CangaceirosStyle()
	{
		hp=random.nextInt(max + min) + min;
		name="Cangaceiros";
		description="Cangaceiro são homens que andam armados e\nem bandos pelo sertão do nordeste espalhando terror";
	}
}