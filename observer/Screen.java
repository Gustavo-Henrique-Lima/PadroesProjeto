package observer;

import java.util.ArrayList;
import java.util.List;

public class Screen 
{
	   private final PhoneModel model;
	   public ArrayList<Observador> observadores=new ArrayList<>();
	 
	   public Screen(PhoneModel model) 
	   {
	      this.model = model;
	   }
	   
	   public void addObservador(Observador o)
	   {
		   if(!observadores.contains(o))
		   {
			   observadores.add(o);
		   }
	   }
	   
	   public void removerObservador(Observador o)
	   {
		   if(observadores.contains(o))
		   {
			   observadores.remove(o);
		   }
	   }
	   
	   public String discando(List<Integer> num)
	   {
		   String msg="Agora discando ";
		   for (Integer i : num) 
		   {
			   msg+=i;
		   }
		   msg+="...";
		   return msg;
	   }
}