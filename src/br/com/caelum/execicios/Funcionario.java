package br.com.caelum.execicios;

public class Funcionario {

	//	Atributos

	public String nome;
	public String departamento;
	public double salarioAtual;
	public String dataEntrada;
	public String rg;
	

	//	M�todos
	void recebeAumento(double aumento) {
		double salarioAumento = this.salarioAtual + aumento;
		this.salarioAtual = salarioAumento;
	}
	
	//	M�todo responsavel por devolver o sal�rio divido por 12
	double calculaGanhoAnual() {
		double salarioAumento = this.salarioAtual / 12;
		return salarioAumento;
	}
	
	//	M�todo mostrar todos os atributos
	void mostra() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Sal�rio Atual:" + this.salarioAtual);
		System.out.println("Data de contrata��o:" + this.dataEntrada);
		System.out.println("Rg:" + this.rg);
	}
}
