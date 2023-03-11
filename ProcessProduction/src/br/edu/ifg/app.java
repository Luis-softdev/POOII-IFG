package br.edu.ifg;
import java.util.Scanner;

public class App {

    private String produtoASerProduzido;
    private int quantProdutosProducao;

    public void definirProdutoParaProducao(){
        System.out.println("\nDigite qual produto será produzido: ");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        resposta = resposta.toLowerCase();
        this.setProdutoASerProduzido(resposta);
    }

    public void definirQuantidadeDeProdutos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite a quantidade de produtos que será produzido: ");
        int resposta = scanner.nextInt();
        this.setQuantProdutosProducao(resposta);
    }

    public String getProdutoASerProduzido() {
        return produtoASerProduzido;
    }

    public void setProdutoASerProduzido(String produtoASerProduzido) {
        this.produtoASerProduzido = produtoASerProduzido;
    }

    public int getQuantProdutosProducao() {
        return quantProdutosProducao;
    }

    public void setQuantProdutosProducao(int quantProdutosProducao) {
        this.quantProdutosProducao = quantProdutosProducao;
    }
}

