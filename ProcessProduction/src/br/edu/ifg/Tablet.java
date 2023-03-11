package br.edu.ifg;
import java.util.Scanner;

import br.edu.ifg.interfaces.tabletInterface;

public class Tablet implements tabletInterface{
    private Double preco;
    private String marca;
    private String modelo;
    private String nomePeca;

    public Tablet(String nomePeca, String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.nomePeca = nomePeca;
    }

    public void definirPreco(){
        System.out.println("\nDigite qual o valor do Tablet: ");
        Scanner scanner = new Scanner(System.in);
        Double resposta = scanner.nextDouble();
        this.setPreco(resposta);
        scanner.close();
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
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
