package factory;

import java.util.Random;

public class CenarioTestDrive {

	public static void main(String[] args) {
		
		int qtdCangaceiros=enemys();
		CenarioStore cenario=new SertaoStore();
		Cenario c=cenario.orderCenario("Sertão");
		InimigoStore enemy=new CangaceirosStore();
		for(int i=0;i<=qtdCangaceiros;i++)
		{
			Inimigos e=enemy.createEnemy("Canganceiro 1");
			c.addEnemy(e);
		}
		
		System.out.println("Você está no "+c.getName());
		System.out.println("Chegaram "+c.inimigo.size()+" "+c.inimigo.get(0).getName()+"(s)");
		System.out.println("Os inimigos aqui são: "+c.inimigo.get(0).getName()+"s, "+c.inimigo.get(0).getDescription());
		System.out.println();
		
		
		int qtdMutantes=enemys();
		CenarioStore cenario2=new AmazoniaStore();
		Cenario c2=cenario2.orderCenario("Amazonia");
		InimigoStore enemy2=new MutanteStore();
		for(int i=0;i<=qtdMutantes;i++)
		{
			Inimigos e=enemy2.createEnemy("Mutante 1");
			c2.addEnemy(e);
		}
		System.out.println("Você está no "+c2.getName());
		System.out.println("Chegaram "+c2.inimigo.size()+" "+c2.inimigo.get(0).getName()+"(s)");
		System.out.println("Os inimigos aqui são: "+c2.inimigo.get(0).getName()+"s, "+c2.inimigo.get(0).getDescription());
		System.out.println();

		int qtdCrimonoso=enemys();
		CenarioStore cenario3=new RioDeJaneiroStore();
		Cenario c3=cenario3.orderCenario("Rio de Janeiro");
		InimigoStore enemy3=new CriminosoStore();
		for(int i=0;i<=qtdCrimonoso;i++)
		{
			Inimigos e=enemy3.createEnemy("Criminoso 1");
			c3.addEnemy(e);
		}
		System.out.println("Você está no "+c3.getName());
		System.out.println("Chegaram "+c3.inimigo.size()+" "+c3.inimigo.get(0).getName()+"(s)");
		System.out.println("Os inimigos aqui são: "+c3.inimigo.get(0).getName()+"s, "+c3.inimigo.get(0).getDescription());
	}
	
	 static int enemys()
	{
		final int min = 1;
		final int max = 100;
		final Random random=new Random();
		int value = random.nextInt(max + min) + min;
		return value;
	}
}