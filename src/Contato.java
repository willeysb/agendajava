import java.util.Date;

public class Contato {
	private int id;
	private String nome;
	private String telefone;
	private String email;
	private String endereco;

	private Date nascimento;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	

	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone=telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	public Date getNascimento(){
		return nascimento;
	}
	
	public void setNascimento(Date nascimento) {
		this.nascimento=nascimento;
	}

}
