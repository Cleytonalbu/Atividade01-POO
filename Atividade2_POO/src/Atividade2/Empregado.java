package Atividade2;

public class Empregado extends Pessoa{
	private double salario;
	
	public Empregado(String nome, String endereco, int telefone, double Salario) {
		super(nome, endereco, telefone);
		this.salario = Salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Empregado: "+getNome() + "Salario: "+getSalario();
	}
}
