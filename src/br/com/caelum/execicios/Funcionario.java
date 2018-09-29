package br.com.caelum.execicios;

public class Funcionario {

	//	Atributos

	public String nome;
	public String departamento;
	public double salarioAtual;
	public String dataEntrada;
	public String rg;
	

	//	Métodos
	void recebeAumento(double aumento) {
		double salarioAumento = this.salarioAtual + aumento;
		this.salarioAtual = salarioAumento;
	}
	
	//	Método responsavel por devolver o salário divido por 12
	double calculaGanhoAnual() {
		double salarioAumento = this.salarioAtual / 12;
		return salarioAumento;
	}
	
	//	Método mostrar todos os atributos
	void mostra() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Salário Atual:" + this.salarioAtual);
		System.out.println("Data de contratação:" + this.dataEntrada);
		System.out.println("Rg:" + this.rg);
	}
}
