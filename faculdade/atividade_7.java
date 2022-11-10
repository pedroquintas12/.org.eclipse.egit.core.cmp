import java.util.Scanner;

public class atividade_7 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		
		
		System.out.println("digite um valor: ");
		n1=entrada.nextInt();
		
		while(n1>=101) {
			
			System.out.println("Numero invalido");
			System.out.println("digite um valor entre 1 e 100");
			n1=entrada.nextInt();			
			
		}
		while(n1<=0) {
			System.out.println("numero invalido");
			System.out.println("digite um valor entre 1 e 100");
			n1=entrada.nextInt();	
		
	}

		if(n1%2==0) {
		
		System.out.println("seu numero e par");
			
	}else {
		
		System.out.println("seu numero e impar");
		
	}
	
		
	}
}
