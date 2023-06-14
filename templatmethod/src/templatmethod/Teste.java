package templatmethod;

public class Teste {

	public static void main(String[] args) {
		TudoMaiscula m=new TudoMaiscula();
		TudoMinusculo n=new TudoMinusculo();
		String texto="A vida é somente dor e sofrimento";
		String maisculo=m.converterTexto(texto);
		String minusculo=n.converterTexto(texto);
		System.out.println(maisculo);
		System.out.println(minusculo);
	}
}