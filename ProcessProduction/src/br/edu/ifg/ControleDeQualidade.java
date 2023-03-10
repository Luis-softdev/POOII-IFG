package br.edu.ifg;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ControleDeQualidade {
    
    public static void testarPecas() throws InterruptedException {
        Random aleatorio = new Random();
        int num = 0;

        System.out.println("\nPreparando as pecas para teste");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("\nIniciando testes:");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("\nTestando a Placa Mae:");
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("\n[#####-----------------------] 25%");

        num = aleatorio.nextInt(20);

        while(num == 4 || num == 18) {
            System.out.println("\nPlaca Mae com defeito, selecinando outra e testando");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\n[#####-----------------------] 25%");
            num = aleatorio.nextInt(20);
        }

        System.out.println("\nTestando a Memoria RAM:");
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("\n[###############-------------] 50%");

        num = aleatorio.nextInt(20);

        while(num == 4 || num == 18) {
            System.out.println("\nMemoria RAM com defeito, selecinando outra e testando");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\n[###############-------------] 50%");
            num = aleatorio.nextInt(20);
        }

        System.out.println("\nTestando a Tela:");
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("\n[######################------] 75%");

        num = aleatorio.nextInt(20);

        while(num == 4 || num == 18) {
            System.out.println("\nTela com defeito, selecinando outra e testando");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\n[######################------] 75%");
            num = aleatorio.nextInt(20);
        }

        System.out.println("\nTestando a Bateria:");
        TimeUnit.SECONDS.sleep(2);

        num = aleatorio.nextInt(20);

        while(num == 4 || num == 18) {
            System.out.println("\nBateria com defeito, selecinando outra e testando");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\n[######################------] 75%");
            num = aleatorio.nextInt(20);
        }
        
        System.out.println("\n[############################] 100%");
        
    }

    public static void testarPecasEmConjunto() throws InterruptedException {
        Random aleatorio = new Random();
        int num = 4;

        System.out.println("\nMontando as pecas selecionadas, por favor aguarde:");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("\nPecas montadas:");

        while(num == 4 || num == 18) {
            System.out.println("\nPreparando conjunto de pecas montadas para teste");
            TimeUnit.SECONDS.sleep(3);

            System.out.println("\nIniciando testes:");
            TimeUnit.SECONDS.sleep(3);

            System.out.println("\nTeste em andamento:");
            TimeUnit.SECONDS.sleep(3);
            num = aleatorio.nextInt(20);
       
            if(num == 4 || num == 18) {
                System.out.println("\nConjunto falho, reparando");

                TimeUnit.SECONDS.sleep(2);
            }
            
        }
        
        System.out.println("\nTeste concluido com sucesso:");
    }

    public static void testarProduto() throws InterruptedException {
        Random aleatorio = new Random();
        int num = 4;

        while(num == 4 || num == 18) {
            System.out.println("\nPreparando produto para teste");
            TimeUnit.SECONDS.sleep(3);

            System.out.println("\nIniciando testes:");
            TimeUnit.SECONDS.sleep(3);

            System.out.println("\nTeste em andamento:");
            TimeUnit.SECONDS.sleep(3);
            num = aleatorio.nextInt(20);
       
            if(num == 4 || num == 18) {
                System.out.println("\nProduto com defeito, reparando");

                TimeUnit.SECONDS.sleep(2);
            }
            
        }
        
        System.out.println("\nTeste concluido com sucesso:");
    }
}