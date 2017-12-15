package model;


public class Tabuleiro {

    private Posicao[][] tabuleiro;
    
    public static final int COLUNAS = 10;
    public static final int LINHAS = 10;
    
    public Tabuleiro(){
        tabuleiro = new Posicao[LINHAS][COLUNAS];
    }
    
    public Posicao[][] getTabuleiro() {
        return tabuleiro;
    }
}
