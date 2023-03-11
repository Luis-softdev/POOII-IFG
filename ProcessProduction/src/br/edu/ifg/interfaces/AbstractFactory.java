package br.edu.ifg.interfaces;

public interface AbstractFactory {
    
    public void definirModelo() throws InterruptedException;
    public void definirNomePeca() throws InterruptedException;
    public void definirMarca() throws InterruptedException;
}

