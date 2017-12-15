package controller;

import java.util.List;
import model.Barco;
import model.Jogador;
import model.Jogo;
import model.Posicao;
import model.Posicao.Estado;

public class JogadaController {

    
    
    private Jogo jogo;
    private Jogador jogador1;
    private Jogador jogador2;
    private boolean fim = false;

    public JogadaController(Jogo jogo) {
        this.jogo = jogo;
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void fazerJogada(int x, int y) {
        Posicao posicao = jogo.jogadorAtual().getTabuleiroEnimigo().getTabuleiro()[x][y];
        if (jogadaValida(x,y)) {
            if (posicao.isTemBarco()) {
                posicao.setEstado(Estado.ATINGIDO);
                List<Barco> barcos =jogo.jogadorAtual().getBarcos();
                barcos.stream().forEach((barco) -> {
                    barco.fuiAtingido(x, y);
                });
                if(jogo.jogadorAtual().perdi()) {
                    fim=true;
                }

                
            } else {
                posicao.setEstado(Estado.FALHO);
                jogo.mudarTurno();
            }
        }
    }

    public boolean jogadaValida(int x, int y) {
        Posicao posicao = jogo.jogadorAtual().getTabuleiroEnimigo().getTabuleiro()[x][y];
        return posicao.getEstado() == Estado.INTACTO;
    }
    
    public void mudarTurno(Jogo jogo){
        jogo.mudarTurno();
    }
    
    public boolean getFim() {
        return fim;
    }
}
