package br.edu.ifg;
import java.util.Scanner;

import br.edu.ifg.interfaces.tabletInter;

public class tablet implements tabletInter {
    private String preco;

    public void definirPreco(){
        System.out.println("Digite o valor do produto final: ");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        this.preco = resposta;
        scanner.close();
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
