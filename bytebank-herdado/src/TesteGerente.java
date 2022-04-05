
public class TesteGerente {

	public static void main(String[] args) {
	
		Autenticavel referencia = new Cliente();
		
		
		Gerente f1 = new Gerente();
		f1.setNome("Pedro Quintas");
		f1.setCpf("129.197.814-30");
		f1.setSalario(1100.00);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		
		f1.setSenha(222);
		
		boolean autenticou = f1.autentica(222);
		System.out.println(autenticou);
		
		System.out.println(f1.getBonificacao());
	}
	
	
}
