package br.com.caelum.execicios;

public class Cap3Ex1 {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestres = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMesal = gastosJaneiro + gastosFevereiro + gastosMarco / 3;
		
		System.out.println("Valor gasto no trimestre: " + gastosTrimestres);
		System.out.println("Média do valor gasto no mês: " + mediaMesal);

	}

}
