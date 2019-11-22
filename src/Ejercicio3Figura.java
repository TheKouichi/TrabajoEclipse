// FUNCIONA
package AmorIvan;

public class Ejercicio3Figura 
{

	public static void main(String[] args) 
	{
		char letra = 'P';
		resultadoFigura(letra);
	}
	/////////////////////////////////////////////////////////////////////////////
	public static void resultadoFigura(char letra)
	{
		for(int i = 1; i <= 3; i++) 
		{
			for(int j = 1; j <= i; j++) 
			{
				
				System.out.print(letra);
			}
			System.out.println();
			
		}
		for(int k = 2; k >= 1; k--)
		{
			for(int l = 1; l <= k; l++)
			{
				System.out.print(letra);
			}
			System.out.println();
		}
	}
}
