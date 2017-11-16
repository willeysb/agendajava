import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Agenda {
	private int id;
	private List<Contato> contatos = new ArrayList<Contato>();
	private List<Compromisso> compromissos = new ArrayList<Compromisso>();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Contato> getContatos(){
		return contatos;
	}
	
	
		
	public List<Compromisso> getCompromissos(){
		return compromissos;
	}
	
	public void novoContato() {
		
		Scanner in2 = new Scanner(System.in);
		Contato contato = new Contato();
		
		int id = this.getContatos().size();
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
		
		this.contatos.add(contato);
		
		return;
	}
	
	public void novoCompromisso() {
		Scanner in3 = new Scanner(System.in);
		Compromisso compromisso = new Compromisso();
		int id = this.getCompromissos().size();
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
		
		this.compromissos.add(compromisso);
		
		
	}
	
	public void listarContatos() {
		System.out.println(this.getContatos().size()+" Contatos Cadastrados:");
		for(int i = 0; i<this.getContatos().size(); i++) {
			Contato contato = this.getContatos().get(i);
			System.out.println("Nome: "+contato.getNome()+"; Telefone: "+contato.getTelefone()+"; Email: "+contato.getEmail()+"; Endereço: "+contato.getEndereco()+"; Data de nascimento: "+contato.getNascimento());
		}
	}
	
	public void listarCompromissos() {
		System.out.println(this.getCompromissos().size()+" Compromissos Cadastrados: ");
		for(int i =0; i<this.getCompromissos().size(); i++) {
			Compromisso compromisso = this.getCompromissos().get(i);
			System.out.println("Compromisso: "+compromisso.getDescricao()+" de: "+compromisso.getInicio().toString()+" até: "+compromisso.getFim().toString());
			
		}
	}
	
	public void removerCompromisso() {
		System.out.println("Digite o número para deletar o compromisso: ");
		for(int i = 0;i<this.getCompromissos().size();i++) {
			System.out.println(i+": "+this.getCompromissos().get(i).getDescricao());
		}
		Scanner in4 = new Scanner(System.in);
		
		try {
			this.getCompromissos().remove(in4.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
			in4.next();
			System.out.println("Você escolheu uma opção inválida, o compromisso não foi removido");
		}
		return;
	}
	
	public void removerContato() {
		System.out.println("Digite o número para deletar o compromisso: ");
		for(int i = 0;i<this.getContatos().size();i++) {
			System.out.println(i+": "+this.getContatos().get(i).getNome());
		}
		Scanner in5 = new Scanner(System.in);
		
		try {
			this.getContatos().remove(in5.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
			in5.next();
			System.out.println("Você escolheu uma opção inválida, o contato não foi removido");
		}
		return;
		
	}
}