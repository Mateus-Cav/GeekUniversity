package geek_university;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int contador = 0;
		int contador2 = 0;
		
		for(int i = 0; i<=100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		while(contador < 101) {
			System.out.print(contador + " ");
			contador++;
		}
		
		System.out.println();
		
		do {
			System.out.print(contador2 + " ");
			contador2++;
		}
		
		while(contador2 < 101);

	}

}
