package Atividade2;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class System {
	private ArrayList <Empregado> listEmpregados = new ArrayList<Empregado>();
	private ArrayList <Fornecedor> listFornecedor = new ArrayList<Fornecedor>();
	private ArrayList <Vendedor> listVendedor = new ArrayList<Vendedor>();
	private ArrayList <Administrador> listAdministrador = new ArrayList<Administrador>();
	
	public Pessoa newPessoa () {
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String endereco = JOptionPane.showInputDialog("Digite o endereço: ");
		int telefone = Integer.valueOf(JOptionPane.showInputDialog("Digite o telefone: "));
		Pessoa pessoa  = new Pessoa(nome, endereco, telefone);
		return pessoa;
		
	}
	
	public void newEmpregado () {
		Pessoa newPessoa = newPessoa();
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Valor do salário: "));
		Empregado empregado = new Empregado(newPessoa.getNome(), newPessoa.getEndereco(), newPessoa.getTelefone(), salario);
		listEmpregados.add(empregado);
		
	}
	
	public void newFornecedor() {
		Pessoa newPessoa = newPessoa();
		double valorCredito = Double.parseDouble(JOptionPane.showInputDialog("Valor de Credito: "));
		double valorDivida = Double.parseDouble(JOptionPane.showInputDialog("Valor da Divida: "));
		Fornecedor fornecedor = new Fornecedor(newPessoa.getNome(), newPessoa.getEndereco(), newPessoa.getTelefone(), valorCredito, valorDivida);
		listFornecedor.add(fornecedor);
	}
	
	public void newVendedor() {
		Pessoa newPessoa = newPessoa();
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Valor do salario: "));
		double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Valor da Divida: "));
		double comissao = Double.parseDouble(JOptionPane.showInputDialog("Valor da comissão: "));
		Vendedor vendedor = new Vendedor (newPessoa.getNome(), newPessoa.getEndereco(), newPessoa.getTelefone(), salario, valorVendas, comissao);
		listVendedor.add(vendedor);
	}
	public void newAdm() {
		Pessoa newPessoa = newPessoa();
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Valor do salário: "));
		double ajudaDeCusto = Double.parseDouble(JOptionPane.showInputDialog("Ajuda de Custo: "));
		Administrador adm = new Administrador(newPessoa.getNome(), newPessoa.getEndereco(), newPessoa.getTelefone(), salario, ajudaDeCusto);
		listAdministrador.add(adm);
	}
	
	public static void main(String [] args) {
		System sistema = new System();
			
		while (true) {
			
			String opcao = JOptionPane.showInputDialog(
				"MENU \n" + 
				"1. Cadastrar Empregado \n" + 
				"2. Cadastrar Fornecedor \n" + 
				"3. Cadastrar Vendedor \n" + 
				"4. Cadastrar Administrador \n" + 
				"5. SAIR");
			
			if(opcao.equals("1")) {
				sistema.newEmpregado();
			} 
			else if(opcao.equals("2")){
				sistema.newFornecedor();
				
			}
			else if(opcao.equals("3")) {
				sistema.newVendedor();
			}
			else if(opcao.equals("4")) {
				sistema.newAdm();
			}
			else if(opcao.equals("5")) {
				break;
			}
			
		}
		
	}

}
