package geek_university;

import java.util.Scanner;

public class Exercicio5 {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int soma = 0, ordenador = 1;
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + ordenador + "º número: ");
			int num = ler.nextInt();
			soma = soma + num;
			ordenador++;
		}
		
		System.out.println("A soma é: " + soma);

	}

}
