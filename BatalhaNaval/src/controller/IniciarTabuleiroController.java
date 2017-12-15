
package controller;

import art.Intro;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Jogador;
import model.Jogo;
import model.Tabuleiro;

public class IniciarTabuleiroController {

    Intro in = new Intro();
    
    public IniciarTabuleiroController() {
       
        try {
            in.printBatalhaNaval();
        } catch (IOException ex) {
            Logger.getLogger(IniciarTabuleiroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(IniciarTabuleiroController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Jogo menu()  {
    
        System.out.println("******* MENU *******");
        System.out.println("Sélectionnez une option:");
        System.out.println("1 - Play!");
        System.out.println("2 - Exit!");
        
        Scanner scan = new Scanner(System.in);
        
        String option = scan.nextLine();

        Jogo jogo = null;
        if(option.equals("1")) {
            
            
            
            Tabuleiro tab1 = new Tabuleiro();
            Tabuleiro tab2 = new Tabuleiro();
            
            System.out.println("Nome jogador1:");
            String nomeJog1 = scan.nextLine();
            Jogador jog1 = new Jogador(nomeJog1, tab1, tab2); 
            System.out.println("Nome jogador2:");
            String nomeJog2 = scan.nextLine();
            Jogador jog2 = new Jogador(nomeJog2, tab2, tab1);
            jogo = new Jogo(jog1, jog2);
            
        } 
        
        return jogo;
        
    }

    
}
