package singleton;

public class Teste {

	public static void main(String[] args) {
		Configure c1=Configure.getInstance();
		System.out.println(c1.toString());
		Configure c2=Configure.getInstance();
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+"->>"+c2.hashCode());
		System.out.println(c1.getUserName());
	}
}