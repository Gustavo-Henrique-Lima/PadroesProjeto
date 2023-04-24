package composite;

import java.util.ArrayList;
import java.util.List;

public class Carro implements Pedaco{

	private List<Pedaco> pecas=new ArrayList<>();
	
	public Carro()
	{
		pecas.add(new Chassi());
		pecas.add(new Carroceria());
	}

	@Override
	public double calcularPeso() {
		double total=0;
		for(Pedaco p:pecas)
		{
			total+=p.calcularPeso();
		}
		System.out.println("Peso final do carro: "+String.format("%.2f", total));
		return total;
	}
}
