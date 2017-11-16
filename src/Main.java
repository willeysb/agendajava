import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
				novoCompromisso(age1);
				break;
				
			case 2:
				novoContato(age1);
				break;
			case 3:
				listarContatos(age1);
				break;
			case 4:
				listarCompromissos(age1);
				break;
			case 5:
				removerCompromisso(age1);
				break;
			case 6:
				removerContato(age1);
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
	
	public static void novoCompromisso(Agenda agenda) {
		Scanner in3 = new Scanner(System.in);
		Compromisso compromisso = new Compromisso();
		int id = agenda.getCompromissos().size();
		compromisso.setId(id+1);
		System.out.println("Digite a descrição para o compromisso em uma linha");
		compromisso.setDescricao(in3.nextLine());
		System.out.println("Digite a data e hora do inicio do compromisso no formato: dd/mm/yyyy HH:mm");
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String strdate = in3.nextLine();
		Date dataInicio = new Date();
		try {
			dataInicio = dateformat.parse(strdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		compromisso.setInicio(dataInicio);
		
		System.out.println("Digite a data e hora do fim do compromisso no formato: dd/mm/yyyy HH:mm");
		strdate = in3.nextLine();
		Date dataFim = new Date();
		try {
			dataFim = dateformat.parse(strdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		compromisso.setFim(dataFim);
		
		agenda.addCompromisso(compromisso);
		
		
	}
	
	public static void novoContato(Agenda agenda) {
		
		Scanner in2 = new Scanner(System.in);
		Contato contato = new Contato();
		
		int id = agenda.getContatos().size();
		contato.setId(id+1);
		System.out.println("Digite o Nome do contato");
		contato.setNome(in2.nextLine());
		System.out.println("Digite o Endereço do contato");
		contato.setEndereco(in2.nextLine());
		System.out.println("Digite o Telefone do contato");
		contato.setTelefone(in2.nextLine());
		System.out.println("Digite o Email do contato");
		contato.setEmail(in2.nextLine());
		System.out.println("Digite a data de nascimento no formato: dd/mm/yyyy");
		SimpleDateFormat dateformat2 = new SimpleDateFormat("dd/MM/yyyy");
		String strdate2 = in2.nextLine();
		Date nascimento = new Date();
		try {
			nascimento = dateformat2.parse(strdate2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

		contato.setNascimento(nascimento);
		
		System.out.println("Salvando Contato em agenda... Por favor Aguarde...");
		
		agenda.addContato(contato);
		
		return;
	}
	
	public static void listarContatos(Agenda agenda) {
		System.out.println(agenda.getContatos().size()+" Contatos Cadastrados:");
		for(int i = 0; i<agenda.getContatos().size(); i++) {
			Contato contato = agenda.getContatos().get(i);
			System.out.println("Nome: "+contato.getNome()+"; Telefone: "+contato.getTelefone()+"; Email: "+contato.getEmail()+"; Endereço: "+contato.getEndereco()+"; Data de nascimento: "+contato.getNascimento());
		}
	}
	
	public static void listarCompromissos(Agenda agenda) {
		System.out.println(agenda.getCompromissos().size()+" Compromissos Cadastrados: ");
		for(int i =0; i<agenda.getCompromissos().size(); i++) {
			Compromisso compromisso = agenda.getCompromissos().get(i);
			System.out.println("Compromisso: "+compromisso.getDescricao()+" de: "+compromisso.getInicio().toString()+" até: "+compromisso.getFim().toString());
			
		}
	}
	
	public static void removerCompromisso(Agenda agenda) {
		System.out.println("Digite o número para deletar o compromisso: ");
		for(int i = 0;i<agenda.getCompromissos().size();i++) {
			System.out.println(i+": "+agenda.getCompromissos().get(i).getDescricao());
		}
		Scanner in4 = new Scanner(System.in);
		
		try {
			agenda.getCompromissos().remove(in4.nextInt());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			in4.next();
			System.out.println("Você escolheu uma opção inválida, o compromisso não foi removido");
		}
		return;
	}
	
	public static void removerContato(Agenda agenda) {
		System.out.println("Digite o número para deletar o compromisso: ");
		for(int i = 0;i<agenda.getContatos().size();i++) {
			System.out.println(i+": "+agenda.getContatos().get(i).getNome());
		}
		Scanner in5 = new Scanner(System.in);
		
		try {
			agenda.getContatos().remove(in5.nextInt());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			in5.next();
			System.out.println("Você escolheu uma opção inválida, o contato não foi removido");
		}
		return;
		
	}

}
