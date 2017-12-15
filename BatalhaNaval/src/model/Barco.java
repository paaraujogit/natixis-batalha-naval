package model;


public class Barco {

    /**
     * @return the afundado
     */
    public boolean isAfundado() {
        return afundado;
    }
    public enum Orientacao{HORIZONTAL, VERTICAL};
    
    private final int linha;
    private final int coluna;
    private final int tamanho;
 
    private boolean afundado = false;
    private int tirosAcertados = 0;
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
    
    public void afundou (){
        if( tirosAcertados == tamanho) afundado = true;
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
                afundou();
                return true;
            }
        }
        else {
            if(colunaa == coluna && linhaa >= linha && linhaa < linha + tamanho){
                incrementaTirosAcertados();
                afundou();
                return true;
            }
        }
        return false;
    }
    
    
}
