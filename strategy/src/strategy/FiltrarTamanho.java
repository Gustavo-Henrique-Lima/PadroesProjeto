package strategy;

public class FiltrarTamanho implements Filter
{
	private Integer tamanho;
	
	public FiltrarTamanho(Integer tamanho)
	{
		this.tamanho=tamanho;
	}

	public Integer getTamanho() 
	{
		return tamanho;
	}

	public void setTamanho(Integer tamanho) 
	{
		this.tamanho = tamanho;
	}

	@Override
	public boolean interessa(String frase) 
	{
		return frase.length()>=this.tamanho?true:false;
	}
}