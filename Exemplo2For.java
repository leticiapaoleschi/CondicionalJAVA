package Condicional;

import java.util.Scanner;

public class Exemplo2For {

	public static void main(String[] args) {
		int numero, n1, par = 0, impar = 0;
		Scanner ler = new Scanner(System.in);
		
		for ( n1 = 1; n1<=10; n1++)
		{
			System.out.print("Digite um número");
			n1=ler.nextInt();
			
			if (n1 % 2 == 0)
			{
				par++;
			}
		    if (n1 % 2 == 1) {
				impar++;
			}
				
			System.out.println("Total de números pares: " + par);
			System.out.println("Total de números ímpares: " + impar);	
			
			
		}
 
	}

}
