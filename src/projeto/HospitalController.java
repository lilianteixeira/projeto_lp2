import java.util.Scanner;


public class HospitalController {

	private Scanner sc;
	private final String SENHA;
	
	public HospitalController(){
		this.sc = new Scanner(System.in);
		this.SENHA = "c041ebf8";
	}
	
	public String liberaSistema(String chave){
		//falta exception.
		
		while(chave != SENHA){
			
			System.out.println("Digite a chave de desbloqueio: ");
			chave = sc.nextLine();
			
			if(chave == SENHA){
				geraMatricula();
			}
			
		}
		return "";
	}

	private void geraMatricula() {
		
	}
	
	public void criaFuncionario(){
		
	}
}
