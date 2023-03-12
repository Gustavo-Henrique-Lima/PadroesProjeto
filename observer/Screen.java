package observer;

import java.util.List;

public class Screen implements Observador {
	private final PhoneModel model;

	public Screen(PhoneModel model) 
	{
		this.model = model;
	}

	@Override
	public void notificar(int num) 
	{
		System.out.println(num);
	}

	@Override
	public String discando(List<Integer> num) 
	{
		String msg = "Agora discando ";
		for (Integer i : num) {
			msg += i;
		}
		msg += "...";
		return msg;
	}
}