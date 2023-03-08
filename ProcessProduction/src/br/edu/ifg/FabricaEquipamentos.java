package br.edu.ifg;

import br.edu.ifg.interfaces.AbstractFactory;

public class FabricaEquipamentos implements AbstractFactory {

    private String marca;
    private String modelo;
    private String nomePeca;


    @Override
    public void definirMarca() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void definirModelo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void definirNomePeca() {
        // TODO Auto-generated method stub
        
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
