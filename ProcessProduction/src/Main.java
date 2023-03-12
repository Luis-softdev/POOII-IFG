import java.util.Scanner;

import br.edu.ifg.App;
import br.edu.ifg.FabricaEquipamentos;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        FabricaEquipamentos fabrica;

        System.out.println("\n\n\t\t\tSeja bem vindo a nossa Fabrica.");
        
        app.definirProdutoParaProducao();
        app.definirQuantidadeDeProdutos();

        fabrica = new FabricaEquipamentos(app.getProdutoASerProduzido());

        if (app.getProdutoASerProduzido().equals("tablet")) {
            fabrica.getTablet().definirPreco();
            System.out.println("\t\t\t\tProduto: " + fabrica.getTablet().getNomePeca());
            System.out.println("\t\t\t\tMarca: " + fabrica.getTablet().getMarca());
            System.out.println("\t\t\t\tModelo: " + fabrica.getTablet().getModelo());
            System.out.println("\t\t\t\tQuantidade: " + app.getQuantProdutosProducao());
            System.out.println("\t\t\t\tPreco: " + fabrica.getTablet().getPreco());
        } else {
            fabrica.getSmartphone().definirPreco();
            System.out.println("\t\t\t\tProduto: " + fabrica.getSmartphone().getNomePeca());
            System.out.println("\t\t\t\tMarca: " + fabrica.getSmartphone().getMarca());
            System.out.println("\t\t\t\tModelo: " + fabrica.getSmartphone().getModelo());
            System.out.println("\t\t\t\tQuantidade: " + app.getQuantProdutosProducao());
            System.out.println("\t\t\t\tPreco: " + fabrica.getSmartphone().getPreco());
        }
        
        verDetalhes(fabrica);

    }

    public static void verDetalhes(FabricaEquipamentos fabrica) {
        System.out.println("\nExibindo detalhes do Produto");
    
        System.out.println("\n\t\t\t\t" + fabrica.getNomePeca().get(0)+ ":");
        System.out.println("\t\t\t\tMarca: " + fabrica.getMarca().get("Placa Mae"));
        System.out.println("\t\t\t\tModelo: " + fabrica.getModelo().get("Placa Mae"));
        System.out.println("\n\t\t\t\t" + fabrica.getNomePeca().get(1)+ ":");
        System.out.println("\t\t\t\tMarca: " + fabrica.getMarca().get("Memoria RAM"));
        System.out.println("\t\t\t\tModelo: " + fabrica.getModelo().get("Memoria RAM"));
        System.out.println("\n\t\t\t\t" + fabrica.getNomePeca().get(2)+ ":");
        System.out.println("\t\t\t\tMarca: " + fabrica.getMarca().get("Tela"));
        System.out.println("\t\t\t\tModelo: " + fabrica.getModelo().get("Tela"));
        System.out.println("\n\t\t\t\t" + fabrica.getNomePeca().get(3)+ ":");
        System.out.println("\t\t\t\tMarca: " + fabrica.getMarca().get("Bateria"));
        System.out.println("\t\t\t\tModelo: " + fabrica.getModelo().get("Bateria"));
    }
}
