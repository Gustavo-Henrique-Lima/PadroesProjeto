package templatmethod;

public class TudoMinusculo extends TextTemplate{

	@Override
	char[] converterCaracteres(char[] chars) {
		char[] newCaracter=new char[chars.length];
		for(int i=0;i<chars.length;i++)
		{
			String temp=String.valueOf(chars[i]);
			newCaracter[i]=temp.toLowerCase().charAt(0);
		}
		return newCaracter;
	}
}