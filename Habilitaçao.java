
public class Habilitaçao {
	
	public static void main(String [] args) {
		
		String nomeDaPessoa1 = "Antônio";
		int idadeDeAntonio = 16;
		String nomeDaPessoa2 = "Luiz";
		int idadeDeLuiz = 18;
		
		if(idadeDeAntonio >= 18) {
			
			System.out.println(nomeDaPessoa1 + " pode tirar habilitação");
			
		}else{
			
			System.out.println(nomeDaPessoa1 + " não pode tirar habilitação");
			
		}
		
		if(idadeDeLuiz >= 18 ) {
			
			System.out.println(nomeDaPessoa2 + " pode tirar habilitação");
			
		}else{
			
			System.out.println(nomeDaPessoa2 + " não pode tirar habilitação");
		}
	
	}

}
