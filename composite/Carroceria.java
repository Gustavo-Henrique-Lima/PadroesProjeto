package composite;

import java.util.ArrayList;
import java.util.List;

public class Carroceria implements Pedaco{

	private List<Pedaco> pecas=new ArrayList<>();

	public Carroceria()
	{
		pecas.add(new Peca("Para-lamas", 12.00));
		pecas.add(new Peca("Portas", 100.00));
		pecas.add(new Peca("Painéis", 90.00));
		pecas.add(new Peca("Porta-malas", 70.00));
		pecas.add(new Peca("Capô", 150.00));
	}
	
	@Override
	public double calcularPeso() {
		// TODO Auto-generated method stub
		return 0;
	}
}