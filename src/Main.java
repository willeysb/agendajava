import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.io.IOException  {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int temp = 0;
		System.out.println("O que deseja fazer agora? escolha uma opção:");
		System.out.println("1: Cadastrar novo Compromisso.");
		System.out.println("2: Cadastrar novo Contato.");
		System.out.println("3: Mostrar os Contatos existentes.");
		System.out.println("4: Mostrar os Compromissos existentes.");
		System.out.println("9: Sair do sistema.");
		
		
		while(temp != 9){
			try {
				temp = in.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				in.next();
			}
			
			System.out.println("pressionou");
			switch (temp){
			case 1:
				System.out.println("digitou 1");
				new Compromisso();
				break;
				
			case 2:
				System.out.println("digitou 2");
				new Contato();
				break;
			case 3:
				System.out.println("digitou 3");
				break;
			case 4:
				System.out.println("digitou 4");
				break;
			case 9:
				System.out.println("digitou 9");
				break;
			default: 
				System.out.println("Você escolheu uma opção inválida");
				break;
			}
		}
		
	}

}
