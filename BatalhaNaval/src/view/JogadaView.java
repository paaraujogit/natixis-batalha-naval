/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.JogadaController;
import java.util.Scanner;
import model.Jogo;
import model.Posicao;
import model.Tabuleiro;
import utils.Utils;

/**
 *
 * @author Formacao
 */
public class JogadaView {
    
    private Jogo jogo;

    public void jogadaView(Jogo jogo){
        JogadaController jc = new  JogadaController(jogo);
        Utils.printTabuleiro(jogo.jogadorAtual().getTabuleiroEnimigo());
        Scanner scan = new Scanner(System.in);
        int linha=-1;
        int coluna = -1;
        
        do{
            while(linha<0 || linha > Tabuleiro.COLUNAS){
            System.out.println("Insere o número da linha 0-9: ");
            linha = scan.nextInt();
        }
       
        
        while(coluna<0 || coluna >Tabuleiro.LINHAS){
                System.out.println("Insere o número da coluna 0-9: ");
                coluna = scan.nextInt();
        }
        
        if (!jc.jogadaValida(linha, coluna)){
            System.out.println("Jogada inválida. Submeta outra.");
        }
        }while(!jc.jogadaValida(linha, coluna));
        
        jc.fazerJogada(linha, coluna);
        Utils.printTabuleiro(jogo.jogadorAtual().getTabuleiroEnimigo());
        jc.mudarTurno(jogo);
        
        
    }
    
}
