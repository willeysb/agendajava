import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.io.IOException  {
		// TODO Auto-generated method stub
		Agenda age1 = new Agenda();
		
		
		Scanner in = new Scanner(System.in);
		int temp = 0;
		
		
		
		while(temp != 9){
			System.out.println("O que deseja fazer agora? escolha uma opção:");
			System.out.println("1: Cadastrar novo Compromisso.");
			System.out.println("2: Cadastrar novo Contato.");
			System.out.println("3: Mostrar os Contatos existentes.");
			System.out.println("4: Mostrar os Compromissos existentes.");
			System.out.println("5: Remover um compromisso.");
			System.out.println("6: Remover um contato.");
			System.out.println("9: Sair do sistema.");
			try {
				temp = in.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				in.next();
			}
			
			switch (temp){
			case 1:
				age1.novoCompromisso();
				break;
				
			case 2:
				age1.novoContato();
				break;
			case 3:
				age1.listarContatos();
				break;
			case 4:
				age1.listarCompromissos();
				break;
			case 5:
				age1.removerCompromisso();
				break;
			case 6:
				age1.removerContato();
				break;
			case 9:
				System.out.println("Você escolheu sair do programa.");
				break;
			default: 
				System.out.println("Você escolheu uma opção inválida");
				break;
			}
		}
		
		
	}
	
	
	
	
	
	

}
