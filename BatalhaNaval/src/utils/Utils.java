package utils;

import model.Posicao;
import model.Tabuleiro;

public class Utils {
    
    public static void printTabuleiro(Tabuleiro tabuleiroo){
        Posicao[][] tabuleiro = tabuleiroo.getTabuleiro();
        for (Posicao[] tabuleiro1 : tabuleiro) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                Posicao.Estado estado = tabuleiro1[j].getEstado();
                switch(estado){
                    case ATINGIDO: 
                        System.out.print("X ");
                        break;
                    case FALHO:
                        System.out.print("O ");
                        break;
                    case INTACTO:
                        System.out.print(". ");     
                }
            }
            System.out.println("");
        }
        
        
    }
}
