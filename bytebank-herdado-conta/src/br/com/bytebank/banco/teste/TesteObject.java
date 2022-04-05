package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		
		
		Object cc = new ContaCorrente (222, 333);
		Object cp = new ContaPoupanca (111, 222);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
			
		//println(cliente);
		
	}

	static void println() {	
	}
	
	static void println(int a) {
			}
	static void println(boolean valor) {
			}
	static void println(Object referencia) {
			}
}

