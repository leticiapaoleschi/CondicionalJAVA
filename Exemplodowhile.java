package Condicional;

import java.util.Scanner;

public class Exemplodowhile {

	public static void main(String[] args) {
		int n1, soma=0;
		Scanner leia = new Scanner(System.in);
		do {
        
        	System.out.print("Digite um numero");
            n1=leia.nextInt();
        	soma = n1 + soma;
        }
       while (n1 != 0);
		System.out.println("A soma dos números digitados é: " + soma);
		leia.close();
	}

}
