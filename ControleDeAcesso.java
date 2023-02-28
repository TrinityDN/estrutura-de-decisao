
public class ControleDeAcesso {
	
	public static void main(String [] args) {
		
		int idadeDoConvidado1 = 17;
		int idadeDoConvidado2 = 18;
		int idadeDoConvidado3 = 19;
		
		int acessoDoConvidado = idadeDoConvidado1;
		
		if(acessoDoConvidado >= 18) {
			
			System.out.println("O convidado pode entrar no recinto");
			
		}else{
			
			System.out.println("O convidado não pode entrar no recinto");
		}
		
		
	}

}
