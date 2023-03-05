package br.edu.ifg;

import java.util.Scanner;

public class Produto extends ModeloPeca{
	private Float preco;

	public Produto(String marca, String modelo, String nomePeca) {
		super(marca, modelo, nomePeca);
		this.definirPreco();
	}
	
	public void definirPreco() {
		Scanner sc = new Scanner(System.in);
		Float preco = (float) 0;
		
		System.out.println("Digite o valor do aparelho");
		preco = sc.nextFloat();
		
		this.setPreco(preco);
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
}
