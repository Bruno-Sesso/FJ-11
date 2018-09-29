package br.com.caelum.capitulo4;

public class Carro {
	String cor;
	String modelo;
	int velocidadeMaxima;
	int velocidadeAtual;
	
	//metodo ligar carro
	void liga() {
		System.out.println("O carro está ligado");
	}
	
	
	//acelera uma certa quantidade
	void acelera(int quantidade) {
		int velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	//devolve a marcha do carro
	int pegarMarcha() {
		if(this.velocidadeAtual < 0) {
			return -1;
		}
		if(this.velocidadeAtual >= 0 && velocidadeAtual <= 40) {
			return 1;
		}
		if(this.velocidadeAtual >= 40 && velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}
