package view;

import java.util.Scanner;
import model.Barco;
import controller.PosicaoBarcosController;
import model.Jogo;

public class PosicaoBarcosView {
    
     PosicaoBarcosController controller;
     Jogo jogo;
        
        public PosicaoBarcosView(Jogo jogo) {
            this.jogo = jogo;
            controller = new PosicaoBarcosController(jogo);
    }

        public void init(){
            colocarBarco(3);
            colocarBarco(3);
            colocarBarco(2);
            colocarBarco(2);
            colocarBarco(2);
            colocarBarco(1);
            colocarBarco(1);
            colocarBarco(1);
            colocarBarco(1);
            colocarBarco(4);
            jogo.mudarTurno();
            colocarBarco(3);
            colocarBarco(3);
            colocarBarco(2);
            colocarBarco(2);
            colocarBarco(2);
            colocarBarco(1);
            colocarBarco(1);
            colocarBarco(1);
            colocarBarco(1);
            colocarBarco(4);
        }
        
        
   public void colocarBarco(int tamanho) {
       
       

        Scanner sc = new Scanner(System.in);
        int linha = -1;
        int coluna = -1;

        System.out.println("Qual a posicão do barco de tamanho " + tamanho);

        do {
            System.out.println("Linha: ");
            linha = sc.nextInt();
        } while (controller.verificaLimites(linha));

        do {
            System.out.println("Coluna: ");
            coluna = sc.nextInt();
            sc.nextLine();
        } while (controller.verificaLimites(coluna));

        System.out.println("Qual a posicão do barco de tamanho " + tamanho);
        System.out.println("Linha: ");
        linha = sc.nextInt();
        System.out.println("Coluna: ");
        coluna = sc.nextInt();
        sc.nextLine();

        String orientacao = "";
        Barco.Orientacao orientacaoB = null;

        boolean escolha = false;
        do {

            switch (orientacao) {
                case "h":
                    orientacaoB = Barco.Orientacao.HORIZONTAL;
                    escolha = false;
                    break;
                case "v":
                    orientacaoB = Barco.Orientacao.VERTICAL;
                    escolha = false;
                    break;
                default:
                    System.out.println("Orientação (H/V)");
                    orientacao = sc.nextLine().toLowerCase();
                    System.out.println("Hor " + orientacao);

                    escolha = true;
            }

        } while (escolha);
        
        controller.criarBarco(tamanho, linha, coluna, orientacaoB);
    }

    
   
}