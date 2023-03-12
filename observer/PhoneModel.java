package observer;

import java.util.ArrayList;
import java.util.List;

public class PhoneModel {
	private List<Integer> digits = new ArrayList<>();
	public ArrayList<Observador> observadores = new ArrayList<>();

	public void addDigit(int newDigit) 
	{
		digits.add(newDigit);
		for (Observador ob : observadores) 
		{
			ob.notificar(newDigit);
		}
		if(digits.size()>=12)
		{
			System.out.println(observadores.get(observadores.size()-1).discando(digits));
		}
	}

	public List<Integer> getDigits() {
		return digits;
	}

	public void addObservador(Observador o) {
		if (!observadores.contains(o)) {
			observadores.add(o);
		}
	}

	public void removerObservador(Observador o) {
		if (observadores.contains(o)) {
			observadores.remove(o);
		}
	}
}