package Atividade2;

public class Administrador extends Empregado{
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, int telefone, double salario, double ajudaDeCusto) {
		super(nome, endereco, telefone, salario);
		this.ajudaDeCusto = ajudaDeCusto;
		
	}
	public double getAjudaDeCusto() {
		return this.ajudaDeCusto;
	}
	public void setajudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double CalcularSalario() {
		return getSalario() + getAjudaDeCusto();
	}
	

}
