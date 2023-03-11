package br.edu.ifg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import br.edu.ifg.estaticas.Marcas;
import br.edu.ifg.estaticas.Modelo;
import br.edu.ifg.interfaces.AbstractFactory;

public class FabricaEquipamentos implements AbstractFactory {

    protected Map<String, String> marca = new HashMap<String, String>();
    protected Map<String, String> modelo = new HashMap<String, String>();
    protected ArrayList<String> nomePeca;
    private Tablet tablet;
    private Smartphone smartphone;
    private String  produtoASerProduzido;

    public FabricaEquipamentos(String produtoASerProduzido) throws InterruptedException {
        this.produtoASerProduzido = produtoASerProduzido;
        this.definirNomePeca();
        this.definirMarca();
        this.definirModelo();
        ControleDeQualidade.testarPecas();
        ControleDeQualidade.testarPecasEmConjunto();

        Random aleatorio = new Random();
        int numMarca = aleatorio.nextInt(Marcas.marcas().size());
        int numModelo = aleatorio.nextInt(Modelo.modeloProduto().size());

        if(this.produtoASerProduzido == "Taablet") {
            this.tablet = new Tablet("Tablet",Marcas.marcas().get(numMarca), Modelo.modeloProduto().get(numModelo));
        } else {
            this.smartphone = new Smartphone("SmartPhone",Marcas.marcas().get(numMarca), Modelo.modeloProduto().get(numModelo));
        }
        ControleDeQualidade.testarProduto();
    }

    @Override
    public void definirMarca() throws InterruptedException {
        String placaMae, memoriaRAM, tela, bateria;
        ArrayList<String> marcas = Marcas.marcas();
        int quantNumeros = marcas.size();

        Random aleatorio = new Random();

        System.out.println("Selecionando marcas das pecas");
        TimeUnit.SECONDS.sleep(5);

        int num = aleatorio.nextInt(quantNumeros);
        placaMae = marcas.get(num);
        this.marca.put("Placa Mae", placaMae);

        num = aleatorio.nextInt(quantNumeros);
        memoriaRAM = marcas.get(num);
        this.marca.put("Memoria RAM", memoriaRAM);

        num = aleatorio.nextInt(quantNumeros);
        tela = marcas.get(num);
        this.marca.put("Tela", tela);

        num = aleatorio.nextInt(quantNumeros);
        bateria = marcas.get(num);
        this.marca.put("Bateria", bateria);

        System.out.println("Marcas selecionadas");
    }

    @Override
    public void definirModelo() throws InterruptedException {
        String placaMae, memoriaRAM, tela, bateria;
        ArrayList<String> modelo = Modelo.modeloPecas();
        int quantNumeros = modelo.size();

        Random aleatorio = new Random();

        System.out.println("Selecionando modelo das pecas");
        TimeUnit.SECONDS.sleep(5);

        int num = aleatorio.nextInt(quantNumeros);
        placaMae = modelo.get(num);
        this.modelo.put("Placa Mae", placaMae);

        num = aleatorio.nextInt(quantNumeros);
        memoriaRAM = modelo.get(num);
        this.modelo.put("Memoria RAM", memoriaRAM);

        num = aleatorio.nextInt(quantNumeros);
        tela = modelo.get(num);
        this.modelo.put("Tela", tela);

        num = aleatorio.nextInt(quantNumeros);
        bateria = modelo.get(num);
        this.modelo.put("Bateria", bateria);

        System.out.println("Modelos selecionados");
        
    }

    @Override
    public void definirNomePeca() {
        this.nomePeca.add("Placa Mae");
        this.nomePeca.add("Memoria RAM");
        this.nomePeca.add("Tela");
        this.nomePeca.add("Bateria");
        
    }

    public Map<String, String> getMarca() {
        return marca;
    }

    public void setMarca(Map<String, String> marca) {
        this.marca = marca;
    }

    public Map<String, String> getModelo() {
        return modelo;
    }

    public void setModelo(Map<String, String> modelo) {
        this.modelo = modelo;
    }

    public ArrayList<String> getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(ArrayList<String> nomePeca) {
        this.nomePeca = nomePeca;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    public String getProdutoASerProduzido() {
        return produtoASerProduzido;
    }

    public void setProdutoASerProduzido(String produtoASerProduzido) {
        this.produtoASerProduzido = produtoASerProduzido;
    }
    
}