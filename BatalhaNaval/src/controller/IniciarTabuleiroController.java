
package controller;

import art.Intro;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Jogador;
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
    
    public void menu()  {
    
        System.out.println("******* MENU *******");
        System.out.println("Sélectionnez une option:");
        System.out.println("1 - Play!");
        System.out.println("2 - Exit!");
        
        Scanner scan = new Scanner(System.in);
        
        String option = scan.nextLine();

        if(option.equals("1")) {
            
            Tabuleiro tab1 = new Tabuleiro();
            Tabuleiro tab2 = new Tabuleiro();
            
            System.out.println("What's my name?: #DrakeFeatRhianna");
            System.out.println("https://www.youtube.com/watch?v=U0CGsw6h60k");
            System.out.println("==>");
            String nomeJog = scan.nextLine();
            Jogador jog = new Jogador(nomeJog, tab1, tab2);    
            
        } else if(option.equals("2")) {
            
            System.exit(1);
        }
        
    }

    
}
