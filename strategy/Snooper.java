package strategy;

public class Snooper {
	
	private final WebSearchModel model;

    public Snooper(WebSearchModel model) 
    {
        this.model = model;
        model.addQueryObserver( new WebSearchModel.QueryObserver() 
        {
        	Filter filtro=new FiltrarPalavra("friend");
        	@Override
			public void onQuery(String query) 
        	{
				if (filtro.interessa(query)) 
				{
					filtro.print(query);
				}
			}
        });
        model.addQueryObserver(new WebSearchModel.QueryObserver() 
        {
        	Filter filtro=new FiltrarTamanho(60);
        	@Override
			public void onQuery(String query) 
        	{
				if (filtro.interessa(query)) 
				{
					filtro.print(query);
				}
			}
        });
    }
}