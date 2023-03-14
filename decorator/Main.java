package decorator;

public class Main {

	public static void main(String[] args) 
	{
		 // Create the order
        Order order = new Order();
        Cake cake=new ChocolateCake();
        Cake cake2=new VanillaCake();
        cake2=new CakeWithSay(cake2, "PLAIN!");
        Cake cake3=new VanillaCake();
        cake3=new Granulado(cake3);
        cake3=new CakeWithSay(cake3, "FANCY!");
        Cake cake4=new StrawberryCake();
        cake4=new CakeLayers(cake4);
        cake4=new Granulado(cake4);
        cake4=new Granulado(cake4);
        cake4=new CakeWithSay(cake4, "One of");
        cake4=new CakeWithSay(cake4, "EVERYTHING");
        //Adding orders
        order.addCake(cake);
        order.addCake(cake2);
        order.addCake(cake3);
        order.addCake(cake4);
        // Print the order
        order.printOrder();
	}
}