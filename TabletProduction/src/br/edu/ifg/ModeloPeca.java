package br.edu.ifg;

public class ModeloPeca {
	
	protected String marca;
	protected String modelo;
	protected String nomePeca;
	
	public ModeloPeca(String marca, String modelo, String nomePeca) {
		super();
		this.definirMarca(marca);
		this.definirModelo(modelo);
		this.definirNomePeca(nomePeca);
	}
	
	public void definirMarca(String marca) {
		String marcaPeca;
		marcaPeca = marca;
		
		this.setMarca(marcaPeca);
	}
	
	public void definirModelo(String modelo) {
		String modeloPeca;
		modeloPeca = modelo;
		
		this.setModelo(modeloPeca);
	}
	
	public void definirNomePeca(String nome) {
		String nomePeca;
		nomePeca = nome;
		
		this.setMarca(nomePeca);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNomePeca() {
		return nomePeca;
	}

	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}
	
	
	
}
