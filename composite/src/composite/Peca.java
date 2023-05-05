package composite;

public class Peca implements Pedaco{

	private String nome;
	private Double peso;

	public Peca(String nome,Double peso)
	{
		this.nome=nome;
		this.peso=peso;
		System.out.println("Adicionando "+getNome()+" que pesa: "+String.format("%.2f", getPeso()));
	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;
	}

	@Override
	public double calcularPeso() {
		return getPeso();
	}
}