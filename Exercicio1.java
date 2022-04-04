package geek_university;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int limitador = 0;
		
		for(int i=1; i<20; i++){

		      if(i%3 == 0){

		        System.out.print(i + " ");
		        limitador++;
		        if(limitador == 5) {
		        	break;
		        }
		      }
		    }

	}

}
