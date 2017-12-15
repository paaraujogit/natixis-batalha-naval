package controller;

import java.util.ArrayList;
import java.util.List;
import model.Barco;
import model.Jogo;


public class PosicaoBarcosController {
 
    List<Barco> barcos = new ArrayList<>();
    Jogo jogo;

    public PosicaoBarcosController(Jogo jogo) {
        this.jogo = jogo;
    }
    
    public boolean verificaLimites (int coord){
        if (coord >= 0 && coord <=9){
            return false;
        } else return true;                
    }
    
    public void criarBarco(int tamanho, int linha, int coluna, Barco.Orientacao orientacao){
    Barco b1 = new Barco(tamanho, linha, coluna, orientacao);   
    
    barcos.add(b1);      
    }
    
    public void setBarcos(){
        jogo.jogadorAtual().setBarcos(barcos);
    }
    
}
