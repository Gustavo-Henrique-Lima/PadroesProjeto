package composite;

import java.util.ArrayList;
import java.util.List;

public class TremDeForca implements Pedaco{

	private List<Pedaco> pecas=new ArrayList<>();

	public TremDeForca()
	{
		pecas.add(new Peca("Motor", 180.00));
		pecas.add(new Peca("Tramissão", 120.00));
		pecas.add(new Peca("Diferencial", 115.00));
		pecas.add(new Peca("Rodas", 100.00));
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