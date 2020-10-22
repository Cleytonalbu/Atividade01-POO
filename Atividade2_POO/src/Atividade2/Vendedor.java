package Atividade2;

public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, int telefone, double salario, double valorVendas, double comissao) {
		super(nome, endereco, telefone, salario);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public double getValorVendas () {
		return this.valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getComissao () {
		return this.comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return getSalario() + getComissao();
	}
	
	public String toString() {
		return "Vendedor: "+getNome() + "Valor de vendas: "+getValorVendas() + "Comissão: "+getComissao();
	}
		
}
