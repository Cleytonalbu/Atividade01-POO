package Atividade2;

public class Pessoa {
	private String nome;
	private String endereco;
	private int telefone;
	
	
	public Pessoa(String Nome, String Endereco, int Telefone) {
		this.nome = Nome;
		this.nome = Endereco;
		this.telefone = Telefone;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String Nome) {
		this.nome = Nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}		
	public void setEndereco(String Endereco) {
		this.endereco = Endereco;
	}
	
	public int getTelefone() {
		return this.telefone;
	}
	public void setTelefone(int Telefone) {
		this.telefone = Telefone;
	}
	
	public String toString() {
		return "Nome:" + getNome() +
				"Endereço: " +getEndereco() +
				"Telefone: " +getTelefone();
		
				
		
	}
	
}
