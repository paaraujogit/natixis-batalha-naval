package model;


public class Barco {
    public enum Orientacao{HORIZONTAL, VERTICAL};
    
    private final int linha;
    private final int coluna;
    private final int tamanho;
 
    int tirosAcertados = 0;
    private final Orientacao orientacao;

    public Barco(int linha, int coluna, int tamanho, Orientacao orientacao) {
        this.linha = linha;
        this.coluna = coluna;
        this.tamanho = tamanho;
        this.orientacao = orientacao;
    }
    
     public int getTirosAcertados() {
        return tirosAcertados;
    }


    
    private void incrementaTirosAcertados(){
        this.tirosAcertados++;
    }
    
    public boolean afundou (){
        return tirosAcertados == tamanho;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Orientacao getOrientacao() {
        return orientacao;
    }
    
    public boolean fuiAtingido(int linhaa, int colunaa) {
        if(orientacao==Orientacao.HORIZONTAL) {
            if(linhaa == linha && colunaa >= coluna && colunaa < coluna + tamanho){
                incrementaTirosAcertados();
                return true;
            }
        }
        else {
            if(colunaa == coluna && linhaa >= linha && linhaa < linha + tamanho){
                incrementaTirosAcertados();
                return true;
            }
        }
        return false;
    }
    
    
}
