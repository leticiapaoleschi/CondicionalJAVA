package Condicional;

import java.util.Scanner;

public class ExemploWhile2 {

	public static void main(String[] args) {
			int idade = 0, sexo = 0, calma = 0, Hagresseivos = 0, Mnervosas = 0, hab = 1, CaracterPsico = 0, nervosa40 = 0, calma18 = 0,  OutrosCalmos = 0;
			Scanner leia = new Scanner (System.in);
			while (hab<= 150) {
	            System.out.println("\n" + "Pessoa nº. " + hab + "\n");
				
				System.out.println("Digite sua idade: ");
				idade = leia.nextInt();
				
				System.out.println("Sexo: Digite: (1 para feminino | 2 para masculino | 3 para outros)");
				sexo = leia.nextInt();
				
				System.out.println("Características: Digite: (1 para calmo | 2 para nervoso | 3 para agressivo)");
				CaracterPsico = leia.nextInt();
				
				hab++;	
			}
			

			if(CaracterPsico == 1) {
				calma++;
			{
			if(sexo == 1 &&  CaracterPsico == 2) {
				Mnervosas++;
			}
			if(sexo == 2 &&  CaracterPsico == 3) {
				Hagresseivos++;
			}
			if(sexo == 3 &&  CaracterPsico == 1) {
				OutrosCalmos++;
			}
			if(idade > 40 &&  CaracterPsico == 2) {
				nervosa40++;
			}
			if(idade < 18 &&  CaracterPsico == 1) {
				calma18++;
			}
			{
				System.out.println("\n" + "Dentre os habitantes que fizeram parte desta pesquisa: \n");
				System.out.println("Quantia de pessoas que se consideram calmas: " + calma);
				System.out.println("Quantia de mulheres que se consideram nervosas: " + Mnervosas);
				System.out.println("Quantia de homens que se consideram agressivos: " + Hagresseivos);
				System.out.println("Quantia de pessoas de outros gêneros se consideram calmas: " + OutrosCalmos);
				System.out.println("Quantia de pessoas com mais de 40 anos se consideram nervosas: " + nervosa40);
				System.out.println("Quantia de pessoas com menos de 18 anos se consideram calmas: " + calma18);
			}

	}
			}}
}
