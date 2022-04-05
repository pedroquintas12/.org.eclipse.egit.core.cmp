
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		
		Cliente cliente = new Cliente ();
		
		
		nico.setNome("Pedro");
		nico.setCpf("129.197.814-30");
		nico.setSalario(1100);
		
		System.out.println("Meu nome é" + nico.getNome());
		System.out.println("CPF" + nico.getCpf());
		System.out.println(nico.getBonificacao());
		
	}
	
}
