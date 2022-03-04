package Condicional;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		int idade= 0, menor21 = 0, maior50 = 0;
		Scanner leia = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.println("digite a sua idade: ");
			idade = leia.nextInt();
			
			if (idade < 21 && idade >=0) {
				menor21++;
			}
			else if (idade > 50) {
				maior50++;
			}
		}
		System.out.println("A quantidade de pessoas que possuem idade inferior a 21 anos é de : " + menor21);
		System.out.println("A quantidade de pessoas que possuem idade superior a 50 anos é de : " + maior50);
		leia.close();	

	}
	

}
