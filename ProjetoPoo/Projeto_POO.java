package ProjetoPoo;

import java.util.Scanner;

public class Projeto_POO {
	

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in); 

		entreterimento Pista = new entreterimento();
		
		Pista.setNome("Pista Executiva");
		Pista.setPreço(80.00);
		Pista.setId(0);

		entreterimento Pista2 = new entreterimento();
		
		Pista2.setNome("Pista Kids");
		Pista2.setPreço(30.00);
		Pista2.setId(1);
		
		entreterimento Pista3 = new entreterimento();
		
		Pista3.setNome("Pista Confra");
		Pista3.setPreço(50.00);
		Pista3.setId(2);
	
		Alimento Coxinha = new Alimento();
		
		Coxinha.setNome("Coxinha");
		Coxinha.setPreço(5.00);
		Coxinha.setQntd(3);
		
		Alimento Pizza = new Alimento();
		
		Pizza.setNome("Pizza");
		Pizza.setPreço(30.00);
		Pizza.setQntd(5);
		
		Alimento Lasanha = new Alimento();
		
		Lasanha.setNome("Lasanha");
		Lasanha.setPreço(50.00);
		Lasanha.setQntd(2);
	
		Alimento Lagosta = new Alimento();
		
		Lagosta.setNome("Salame");
		Lagosta.setPreço(100.00);
		Lagosta.setQntd(2);
		
		Alimento CocaCola = new Alimento();
		
		CocaCola.setNome("Coca-Cola");
		CocaCola.setPreço(6.00);
		CocaCola.setQntd(7);
		
		Alimento Agua = new Alimento();
	
		Agua.setNome("Agua");
		Agua.setPreço(3.00);
		Agua.setQntd(10);
		
		Alimento Suco = new Alimento();
		
		Suco.setNome("Suco");
		Suco.setPreço(4.00);
		Suco.setQntd(7);
		
		Alimento Whisky = new Alimento();
		
		Whisky.setNome("Whisky Escocês (Shot)");
		Whisky.setPreço(120.00);
		Whisky.setQntd(3);
		
		
		
		System.out.println("Bem vindo ao Boliche prime, deseja continuar?");
		System.out.println("[1] Sim\n[2] Não ");
		int ResEntrada = entrada.nextInt();
		
		if(ResEntrada==1) {
			String Nome;
			System.out.println("Qual o seu nome?");
			Nome=entrada.next();
		
			System.out.println("Bem vindo " + Nome + " Qual pista você deseja?");
			
			System.out.println("[1] " + Pista.getNome() + " valor por hr: " + Pista.getPreço()+ "\n" +
					"[2] " + Pista2.getNome() + " valor por hr: " + Pista2.getPreço() + "\n" +
					"[3] " + Pista3.getNome() + " valor por hr: " + Pista3.getPreço()+ "\n") ;
			
			int ResPista = entrada.nextInt();
			while(ResPista<1 || ResPista >3) {
				System.out.println("Numero invalido, tente novamente!");
				System.out.println("Coloque uma opção valida");
				System.out.println("[1] " + Pista.getNome() + " valor por hr: " + Pista.getPreço()+ "\n" +
								"[2] " + Pista2.getNome() + " valor por hr: " + Pista2.getPreço() + "\n" +
								"[3] " + Pista3.getNome() + " valor por hr: " + Pista3.getPreço()+ "\n") ;
				ResPista = entrada.nextInt();
				
			}
			
			if(ResPista == 2 || ResPista == 3) {
				System.out.println("perfeito! , escolha o cardapio!");
				
				System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
								"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
								"[3] " + Pizza.getNome() + " valor: " + Lasanha.getPreço()+ "\n");		
				int ResAlimento = entrada.nextInt();
				
				while (ResAlimento < 0 || ResAlimento > 3){
					
					System.out.println("Número invalido, tente novamente!");
					System.out.println("Coloque uma opção valida! ");
					System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
							"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
							"[3] " + Pizza.getNome() + " valor: " + Lasanha.getPreço()+ "\n");
					 ResAlimento = entrada.nextInt();
				}
					
			}else if (ResPista == 1) {
				
				System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
						"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
						"[3] " + Pizza.getNome() + " valor: " + Lasanha.getPreço()+ "\n" + 
						"[4] " + Lagosta.getNome() + " valor: " + Lagosta.getPreço() + "\n" );	
				int ResAlimento = entrada.nextInt();
				
				while (ResAlimento < 0 || ResAlimento > 4){
					
					System.out.println("Número invalido, tente novamente!");
					System.out.println("Coloque uma opção valida! ");
					System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
							"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
							"[3] " + Pizza.getNome() + " valor: " + Lasanha.getPreço()+ "\n" + 
							"[4] " + Lagosta.getNome() + " valor: " + Lagosta.getPreço() + "\n" );
					 ResAlimento = entrada.nextInt();
				}
				}


			}else if (ResEntrada==2) {
				System.out.println("Obrigado pela atenção");
			
			}else {
				
				System.out.println("Número invalido, tente novamente");
				
				
			}
		
	}	
				
			
			
			
				
			

			
		
		

		
		
}
	


