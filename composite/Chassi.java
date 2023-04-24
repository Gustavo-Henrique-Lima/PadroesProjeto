package composite;

import java.util.ArrayList;
import java.util.List;

public class Chassi implements Pedaco{

	private List<Pedaco> pecas=new ArrayList<>();
	
	public Chassi()
	{
		pecas.add(new Peca("Suspensão",430.00));
		pecas.add(new TremDeForca());
	}

	@Override
	public double calcularPeso() {
		double total=0;
		for(Pedaco p:pecas)
		{
			total+=p.calcularPeso();
		}
		return total;
	}
}