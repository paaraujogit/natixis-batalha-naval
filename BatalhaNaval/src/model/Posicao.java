
package model;


public class Posicao {
    public enum Estado{ATINGIDO, FALHO, INTACTO};
    
    private Estado estado = Estado.INTACTO;
    private boolean temBarco;

    public Posicao(boolean temBarco) {
        this.temBarco = temBarco;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isTemBarco() {
        return temBarco;
    }

    public void setTemBarco(boolean temBarco) {
        this.temBarco = temBarco;
    }
    
    
    
}
