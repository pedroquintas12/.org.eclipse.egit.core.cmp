
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

	Conta c = new Conta ();
	try {
		c.Deposita(); 
		
	}catch(MinhaExcecao ex) {
		
		System.out.println("tratamento... ");
	}
	
	}
	
}
