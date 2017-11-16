import java.util.ArrayList;
import java.util.List;


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
	
	public void addContato(Contato contato) {
		this.contatos.add(contato);
		return;
	}
	
	public void remContato(Contato contato) {
		this.contatos.remove(contato);
	}
	
	
	public List<Compromisso> getCompromissos(){
		return compromissos;
	}
	
	public void addCompromisso(Compromisso compromisso) {
		this.compromissos.add(compromisso);
	}
	
	public void remCompromisso(Compromisso compromisso) {
		this.compromissos.remove(compromisso);
	}
	
}