import java.util.Scanner;

public class atividade_6 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("digite um valor positivo: ");
		n1=entrada.nextInt();
		
		while(n1<0) {
			
			System.out.println("digite um valor valido: ");
			n1=entrada.nextInt();
			
		}
		
		System.out.println("digite o segundo valor: ");
		n2=entrada.nextInt();
		
		while(n2<0) {
			
			System.out.println("Digite um valor valido: ");
			n2=entrada.nextInt();
		}
	
	System.out.println("a soma dos valores é de: "+ n1+n2);
		
	}
	

}
