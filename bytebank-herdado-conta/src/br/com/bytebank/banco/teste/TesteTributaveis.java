package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente (2222, 2222);
		cc.deposita(100.00);
		SeguroDeVida sdv = new SeguroDeVida();
		CalculadorDeImposto cdi = new CalculadorDeImposto();
		
		cdi.registra(sdv);
		cdi.registra(cc);
		
		System.out.println(cdi.getTotalImposto());
	}
}
