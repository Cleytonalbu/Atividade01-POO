package Atividade2;

public class Fornecedor extends Pessoa{
	private double valorCredito;
	private double valorDivida;

	public Fornecedor (String nome, String endereco, int telefone, double Valorcredito, double Valordivida) {
		super(nome, endereco, telefone);
		this.valorCredito = Valorcredito;
		this.valorDivida = Valordivida;
		
	}
	
	public double getValorCredito() {
		return this.valorCredito;
		
	}
	public void setValorCredito(double ValorCredito) {
		this.valorCredito = ValorCredito;
	}
	
	public double getValorDivida() {
		return this.valorDivida;
	}
	
	public void setValorDivida(double ValorDivida) {
		this.valorDivida = ValorDivida;
	}
	
	public String toString() {
		return "Valor de Credito: " +getValorCredito() + "Valor da Divida: "+getValorDivida();
	}
	
	public double obterValor() {
		return getValorCredito() - getValorDivida();
		
	}
}
	