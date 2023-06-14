package templatmethod;

public abstract class TextTemplate {

	final String converterTexto(String entrada)
	{
		char[] caracteres=extrairCaracteres(entrada);
		char[] caracteresConvertidos=converterCaracteres(caracteres);
		String resultado=juntarCaracteres(caracteresConvertidos);
		return resultado;
	}
	
	char[] extrairCaracteres(String texto)
	{
		return texto.toCharArray();
	}
	
	String juntarCaracteres(char[] chars)
	{
		String texto="";
		for(int i=0;i<chars.length;i++)
		{
			texto+=String.valueOf(chars[i]);
		}
		return texto;
	}
	
	abstract char[] converterCaracteres(char[] chars);
}