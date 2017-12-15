package model;


public class Barco {
    public enum Orientacao{HORIZONTAL, VERTICAL};
    
    int linha;
    int coluna;
    int tamanho;
    int tirosAcertados = 0;
    private final Orientacao orientacao;

    public Barco(int linha, int coluna, int tamanho, Orientacao orientacao) {
        this.linha = linha;
        this.coluna = coluna;
        this.tamanho = tamanho;
        this.orientacao = orientacao;
    }
    
    public boolean afundou (){
        return tirosAcertados == tamanho;
    }
    
    
    
}
