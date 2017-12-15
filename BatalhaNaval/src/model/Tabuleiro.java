package model;


public class Tabuleiro {

    private Tabuleiro[][] tabuleiro;
    
    public static final int COLUNAS = 10;
    public static final int LINHAS = 10;
    
    public Tabuleiro(){
        tabuleiro = new Tabuleiro[LINHAS][COLUNAS];
    }
}
