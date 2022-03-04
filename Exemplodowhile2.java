package Condicional;

import java.util.Scanner;

public class Exemplodowhile2 {

	public static void main(String[] args) {
		int n1, media=0, soma=0, multiplos = 0;
		Scanner leia = new Scanner(System.in);
		do {
			System.out.print("Digite um número");
			n1=leia.nextInt();
			if (n1 % 3 == 0 && n1 !=0) {
				multiplos++;
				soma = + n1;
				
			}
		}
		while (n1 !=0);
		media = soma / multiplos;
		
		System.out.println("A média dos números digitados que são números múltiplos de 3 é: " + media);
		
		

	}

}
