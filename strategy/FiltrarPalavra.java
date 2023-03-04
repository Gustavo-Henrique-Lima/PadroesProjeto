package strategy;

public class FiltrarPalavra implements Filter
{
	private String palavra;

	public FiltrarPalavra(String palavra) 
	{
		this.palavra = palavra;
	}
	
	
	public String getPalavra() 
	{
		return palavra;
	}

	public void setPalavra(String palavra) 
	{
		this.palavra = palavra;
	}

	@Override
	public boolean interessa(String frase) 
	{
		return frase.toLowerCase().contains(this.palavra)?true:false;
	}


	@Override
	public void print(String frase) 
	{
		System.out.println("Oh Yes!"+frase);
	}
}
