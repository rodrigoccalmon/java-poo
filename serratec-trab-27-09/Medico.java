package exmedico;

public class Medico {
	int crm;
	String nome;
	int salario;
	int valorConsulta;
	
	public Medico (int crm, String nome, int salario, int valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
	}
	
	public void pagamentoDinheiro() {
		System.out.println("Pagamento feito em dinheiro. ");
		this.salario = 300;
		System.out.println("Valor do sal�rio R$ " + this.salario);
		System.out.println("===================================");
	}
	public void pagamentoPlano() {
		System.out.println("Pagamento feito pelo plano de sa�de.");
		System.out.println("Receber� 70% do valor da consulta. ");
		this.salario = (int) (300 * 0.70);
		System.out.println("Valor do sal�rio R$ " + this.salario);
		System.out.println("====================================");
		
	}
	public void status() {
		System.out.println("Nome do m�dico: " + this.nome);
		System.out.println("Sal�rio do m�dico: " +this.salario);
		System.out.println("Valor da consulta do m�dico R$: "+this.valorConsulta);
	}
}
