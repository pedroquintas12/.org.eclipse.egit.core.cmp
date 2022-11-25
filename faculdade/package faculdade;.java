

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProvafinalPoo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String Nome;
		
		
		System.out.println("Bem vindo a nossa agencia de viagem, Top Viagens!!");
		System.out.println("Você quer continuar? ");
		int ResEntrada = entrada.nextInt();
		if(ResEntrada == 1) {
			
		System.out.println("Qual o seu nome?");
		Nome=entrada.next();
		
		
		System.out.println("ola "+Nome+" qual destino voce quer ir?");
		System.out.println("[1] Praia - R$150.00 ");
		System.out.println("[2] Cidade - R$200.00 ");
		System.out.println("[3] Interior - R$100.00");
		
		List<String> lista = new ArrayList<>(List.of("Taxa de serviÃ§o")); //lista de nomes
		List<Double> listaPreco = new ArrayList<>();//lista de preÃ§os
		listaPreco.add(5.0);//taxa de serviÃ§o
		
		double soma = listaPreco.get(0);
		
		int ResLugar = entrada.nextInt();
		if(ResLugar==1) {
			
			System.out.println("Pegar um bronze ne? Otima escolha!!!");
			
			lista.add("Praia");
			listaPreco.add(150.00);
				soma+= 150.00;
				
		}else if(ResLugar==2){
			
			System.out.println("Gosta de lugares mais movimentados ne?");
			
			lista.add("Cidade");
			listaPreco.add(200.00);
			soma+= 200.00;
			
		}else if(ResLugar==3) {
			
			System.out.println("Quer uma viagem mais tranquila ne?");
			
			lista.add("Interior");
			listaPreco.add(100.00);
			soma+=100.00;
			
		}else {
		
			System.out.println("Digite uma opcao valida!");
			return;
		}
		

		
		if(ResLugar==1) {
			
			System.out.println("Oque voce vai comer la?");
			System.out.println("[1]Carangueijo - R$100.00");
			System.out.println("[2]Camarao - R$70.00");
			System.out.println("[3]Peixada - R$150.00");
			System.out.println("[4]Nada - R$0.00");
			int ResComida = entrada.nextInt();
			
			switch (ResComida) {
			case 1-> {
				lista.add("Carangueijo");
				listaPreco.add(100.00);
				soma+=100.00;
			}case 2->{
				
				lista.add("Camarao");
				listaPreco.add(70.00);
				soma+=70.00;
			}case 3 ->{
				
				lista.add("Peixada");
				listaPreco.add(150.00);
				soma+=150.00;
			
			}case 4 ->{
				
				lista.add("Nada");
				listaPreco.add(00.00);
				soma+=00.00;
			}
		}
		}else if(ResLugar==2) {
			System.out.println("Oque voce vai comer la?");

			System.out.println("[1]Rodizio de carne - R$100.00");
			System.out.println("[2]Rodizio de sushi - R$150.00");
			System.out.println("[3]Comida basica(feijÃ£o, arroz, carne, macarrao) - R$40.00");
			System.out.println("[4]Nada - R$0.00");
			
			int ResComida = entrada.nextInt();
			
			switch (ResComida) {
			case 1-> {
				lista.add("Rodizio de carne");
				listaPreco.add(100.00);
				soma+=100.00;
			}case 2->{
				
				lista.add("Rodizio de sushi");
				listaPreco.add(150.00);
				soma+=150.00;
			}case 3 ->{
				
				lista.add("Comida Basica");
				listaPreco.add(40.00);
				soma+=40.00;
			
			}case 4 ->{
				
				lista.add("Nada");
				listaPreco.add(00.00);
				soma+=00.00;
			}
		}
			
			
			
		}else if(ResLugar==3) {
			System.out.println("Oque voce vai comer la?");

			System.out.println("[1]Buchada - R$50.00");
			System.out.println("[2]Escondidinho - R$70.00");
			System.out.println("[3]Prato de cuzcuz - R$30.00");
			System.out.println("[4]Nada - R$0.00");
			int ResComida = entrada.nextInt();
			
			switch (ResComida) {
			case 1-> {
				lista.add("Buchada");
				listaPreco.add(50.00);
				soma+=50.00;
			}case 2->{
				
				lista.add("Escondidinho");
				listaPreco.add(70.00);
				soma+=70.00;
			}case 3 ->{
				
				lista.add("Prato de cuzcuz");
				listaPreco.add(30.00);
				soma+=30.00;
			
			}case 4 ->{
				
				lista.add("Nada");
				listaPreco.add(00.00);
				soma+=00.00;
			}
		}
		}else {
			
			System.out.println("Obrigado por escolher a gente !");
			
		}
		
		if(ResLugar==1||ResLugar==2||ResLugar==3) {
			
			System.out.println("O que voce deseja beber?");
			
			System.out.println("[1]Agua - R$5.00");
			System.out.println("[2]Refrigerante - R$7.00");
			System.out.println("[3]Cerveja - R$10.00");
			System.out.println("[4]Nada - R$0.00");
			
			int ResBebida = entrada.nextInt();
			
			
			switch (ResBebida) {
			case 1-> {
					lista.add("Agua");
					listaPreco.add(5.00);
					soma+=5.00;
			}case 2->{
				
				lista.add("Refrigerante");
				listaPreco.add(7.00);
				soma+=7.00;
			}case 3->{
				
				lista.add("Cerveja");
				listaPreco.add(10.00);
				soma+=10.00;
			}case 4->{
				
				lista.add("Nada");
				listaPreco.add(00.00);
				soma+= 00.00;
			}
		
			
			
		}
		}else {
			
			System.out.println("Opcao invalida");
			
		}
		//----------------------------------------------------------------------------
		System.out.println("Voce escolheu: "+ lista.get(1));
		System.out.println("Valor:" + listaPreco.get(1));
		System.out.println("----------------------------------------------");
		System.out.println("Para comer voce escolheu: "+lista.get(2));
		System.out.println("Valor: "+ listaPreco.get(2));
		System.out.println("----------------------------------------------");
		System.out.println("Para beber voce escolheu: "+lista.get(3));
		System.out.println("Valor: "+listaPreco.get(3));
		System.out.println("----------------------------------------------");
		
		System.out.println("Valor da taxa: "+listaPreco.get(0));
		System.out.println("Valor total: "+soma);
		
		
		entrada.close();
		}else{
			
			System.out.println("Volte Sempre");
			
		}
	}
		
	}

