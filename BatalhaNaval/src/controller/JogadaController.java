package controller;

import model.Jogador;
import model.Jogo;
import model.Posicao;
import model.Posicao.Estado;

public class JogadaController {

    
    
    private Jogo jogo;
    private Jogador jogador1;
    private Jogador jogador2;

    public JogadaController(Jogo jogo) {
        this.jogo = jogo;
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void fazerJogada(int x, int y) {
        if (jogadaValida(posicao)) {
            if (posicao.isTemBarco()) {
                posicao.setEstado(Estado.ATINGIDO);
                
                jogo.mudarTurno();
                
            } else {
                posicao.setEstado(Estado.FALHO);
                jogo.mudarTurno();
            }
        }
    }

    public boolean jogadaValida(Posicao posicao) {
        return posicao.getEstado() == Estado.INTACTO;
    }
}
