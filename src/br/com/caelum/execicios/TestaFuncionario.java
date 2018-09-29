package br.com.caelum.execicios;

import java.text.DecimalFormat;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1;
		f1 = new Funcionario();
		DecimalFormat formata = new DecimalFormat("0.00");
		
		f1.nome = "Bruno Brandão";
		f1.departamento = "Asset";
		f1.salarioAtual = 38400.40;
		f1.dataEntrada = "01/02/2018";
		f1.rg = "1234567";
		
		f1.recebeAumento(1000.0);
		System.out.println("Salário atual: " + "R$"+formata.format(f1.salarioAtual));
		System.out.println("Salário por mês " + "R$"+ formata.format(f1.calculaGanhoAnual()));
		
		
	}

}
