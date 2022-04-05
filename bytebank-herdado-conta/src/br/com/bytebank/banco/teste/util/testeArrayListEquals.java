package br.com.bytebank.banco.teste.util;


import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class testeArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		Conta cc = new ContaCorrente(222, 333);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(222, 111);
		lista.add(cc2);
		
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		
		Conta cc3 = new ContaCorrente(328, 384);
		lista.add(cc);
		
		Conta cc4 = new ContaCorrente(824, 122);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());
		
		for(Conta conta : lista) {
			System.out.println(conta);
			
			
		}
		
		
	}
	
}
