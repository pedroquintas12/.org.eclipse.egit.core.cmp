
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Pedro");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(ev);
		System.out.println(controle.getSoma());
	}
	
}
