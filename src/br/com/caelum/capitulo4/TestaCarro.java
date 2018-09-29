package br.com.caelum.capitulo4;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro meuCarro;
		
		meuCarro = new Carro();
		meuCarro.cor = "Branco";
		meuCarro.modelo = "Ford Fusion";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima =  80;
		
		// liga o carro
		meuCarro.liga();
		
		//acelera o carro
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual + " KM por hora");
		
	}

}
