package strategy;

public class Snooper {
	
	private final WebSearchModel model;

    public Snooper(WebSearchModel model) 
    {
        this.model = model;
        model.addQueryObserver( new WebSearchModel.QueryObserver() 
        {
        	FiltrarPalavra filtro=new FiltrarPalavra("friend");
        	@Override
			public void onQuery(String query) 
        	{
        		//filtro.setPalavra("Dia");
				if (filtro.interessa(query)) 
				{
					System.out.println("Oh Yes!"+query);
				}
			}
        });
        model.addQueryObserver(new WebSearchModel.QueryObserver() 
        {
        	FiltrarTamanho filtro=new FiltrarTamanho(60);
        	@Override
			public void onQuery(String frase) 
        	{
				if (filtro.interessa(frase)) 
				{
					System.out.println("So long..."+frase);
				}
			}
        });
    }
}