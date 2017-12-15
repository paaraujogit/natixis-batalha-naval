/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.JogadaController;
import java.util.Scanner;
import model.Jogador;
import model.Tabuleiro;
import utils.Utils;

/**
 *
 * @author Formacao
 */
public class JogadaView {
    
    public JogadaController jc = new  JogadaController();
    
    public void jogadaView(Jogador jogador){
        
        Utils.printTabuleiro(jogador.getTabuleiroEnimigo());
        Scanner scan = new Scanner(System.in);
        int linha=-1;
        
        while(linha<0 || linha > Tabuleiro.COLUNAS){
            System.out.println("Insere o número da linha 0-9: ");
            linha = scan.nextInt();
        }
        
        int coluna = -1;
        while(coluna<0 || coluna >Tabuleiro.LINHAS){
            System.out.println("Insere o número da coluna 0-9: ");
            coluna = scan.nextInt();
        }
        // enviar as coordenadas para o jc ver estado das coordenadas
        // 
        
  
        
        
    }
    
}
