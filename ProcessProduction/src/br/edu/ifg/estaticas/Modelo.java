package br.edu.ifg.estaticas;

import java.util.ArrayList;

public class Modelo {
    public static ArrayList<String> modeloProduto() {
        ArrayList<String> modelo = new ArrayList<>();

        modelo.add("Galaxy A22 5G");
        modelo.add("A23");
        modelo.add("Poco M4 Pro");
        modelo.add("Poco M1 Pro");
        modelo.add("Poco M4");
        modelo.add("Redmi 10A");
        modelo.add("Redmi 9A");
        modelo.add("10C");
        modelo.add("Moto G41");
        modelo.add("Moto E22");
        modelo.add("9i");
        modelo.add("Iphone 14");
        modelo.add("Iphone X");

        return modelo;
    }

    public static ArrayList<String> modeloPecas(){
        ArrayList<String> modeloPecas = new ArrayList<>();

        modeloPecas.add("A22");
        modeloPecas.add("A23");
        modeloPecas.add("M4 Pro");
        modeloPecas.add("M1 Pro");
        modeloPecas.add("M4");
        modeloPecas.add("10A");
        modeloPecas.add("9A");
        modeloPecas.add("10C");
        modeloPecas.add("G41");
        modeloPecas.add("E22");
        modeloPecas.add("9i");
        modeloPecas.add("14");
        modeloPecas.add("X");

        return modeloPecas;
    }
}
