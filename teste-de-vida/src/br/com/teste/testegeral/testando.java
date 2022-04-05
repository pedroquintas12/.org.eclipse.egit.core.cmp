package br.com.teste.testegeral;

public class testando {

	protected double saldo;
	private int Agencia;
	private int Numero;
	private static int total = 0;
	
	public Conta (int Agencia, int Numero);
	
	
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return Agencia;
	}
	public void setAgencia(int agencia) {
		Agencia = agencia;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		testando.total = total;
	}
	
	
	
}
