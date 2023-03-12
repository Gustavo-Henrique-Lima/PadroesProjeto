package observer;

import java.util.ArrayList;
import java.util.List;

public class PhoneModel implements Observador {
	private List<Integer> digits = new ArrayList<>();

	public void addDigit(int newDigit) 
	{
		digits.add(newDigit);
		notificar(newDigit);
	}

	public List<Integer> getDigits() 
	{
		return digits;
	}

	@Override
	public void notificar(int num) 
	{
		System.out.println(num);
	}
}