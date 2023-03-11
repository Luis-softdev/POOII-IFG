package br.edu.ifg;
import java.util.Scanner;

import br.edu.ifg.interfaces.tabletInter;

public class Tablet implements tabletInter{
    private String preco;

    public void definirPreco(){
        System.out.println("Digite qual produto será produzido: ");
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
