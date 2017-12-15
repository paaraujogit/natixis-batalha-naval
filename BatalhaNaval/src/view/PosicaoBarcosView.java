package view;

import java.util.Scanner;
import model.Barco;

public class PosicaoBarcosView {

    public static void main(String[] args) {
        pedirBarco(3);
    }

    public static void pedirBarco(int tamanho) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a posicão do barco de tamanho " + tamanho);
        System.out.println("Linha: ");
        int linha = sc.nextInt();
        System.out.println("Coluna: ");
        int coluna = sc.nextInt();
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
                    escolha = true;
            }
            
        } while (escolha);

    }

}
