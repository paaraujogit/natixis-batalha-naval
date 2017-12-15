package view;

import java.util.Scanner;
import model.Barco;
import controller.PosicaoBarcosController;

public class PosicaoBarcosView {

   public void colocarBarco(int tamanho) {
       
        PosicaoBarcosController controller = new PosicaoBarcosController();

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
        Barco.Orientacao orientacaoB;

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
    }
   
}