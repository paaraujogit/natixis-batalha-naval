package controller;

import model.Barco;
import view.PosicaoBarcosView;


public class PosicaoBarcosController {
 
    public boolean verificaLimites (int coord){
        if (coord >= 0 && coord <=9){
            return false;
        } else return true;                
    }
    
    public void verificaPosicao(int linha, int coluna, int tamanho, Barco.Orientacao orientacao){
        
    }
    
}
