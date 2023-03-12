package observer;

import java.util.ArrayList;
import java.util.List;

public class PhoneModel implements Observador {
	private List<Integer> digits = new ArrayList<>();
	public ArrayList<Observador> observadores = new ArrayList<>();

	public void addDigit(int newDigit) 
	{
		digits.add(newDigit);
		notificar(newDigit);
	}

	public List<Integer> getDigits() 
	{
		return digits;
	}

	public void addObservador(Observador o) 
	{
		if (!observadores.contains(o)) 
		{
			observadores.add(o);
		}
	}

	public void removerObservador(Observador o) 
	{
		if (observadores.contains(o)) 
		{
			observadores.remove(o);
		}
	}

	@Override
	public void notificar(int num) 
	{
		System.out.println(num);
	}
}