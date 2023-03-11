package br.edu.ifg;
import java.util.Scanner;


public class app {

    private String produtoASerProduzido;
    private String quantProdutosProducao;

    public void definirProdutoParaProducao(){
        System.out.println("Digite qual produto será produzido: ");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        this.produtoASerProduzido = resposta;
        scanner.close();
    }

    public void definirQuantidadeDeProdutos(){
        System.out.println("Digite a quantidade de produtos que será produzido: ");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        this.quantProdutosProducao = resposta;
        scanner.close();
    }

    public String getProdutoASerProduzido() {
        return produtoASerProduzido;
    }

    public void setProdutoASerProduzido(String produtoASerProduzido) {
        this.produtoASerProduzido = produtoASerProduzido;
    }

    public String getQuantProdutosProducao() {
        return quantProdutosProducao;
    }

    public void setQuantProdutosProducao(String quantProdutosProducao) {
        this.quantProdutosProducao = quantProdutosProducao;
    }
}
