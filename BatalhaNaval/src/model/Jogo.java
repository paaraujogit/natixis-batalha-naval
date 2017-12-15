package model;

public class Jogo {

    enum Turno {

        jogador1 {
                    @Override
                    public Turno mudarTurno() {
                        return Turno.jogador2;
                    }
                },
        jogador2 {
                    @Override
                    public Turno mudarTurno() {
                        return Turno.jogador1;
                    }
                };

        public abstract Turno mudarTurno();
    }

    private Jogador jogador1;
    private Jogador jogador2;

    private Turno turno = Turno.jogador1;


    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }
    
    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void mudarTurno() {
        turno = turno.mudarTurno();
    }


    public Jogador jogadorAtual(){
        if(turno == turno.jogador1){
            return jogador1;
        }
        return jogador2;
    }
    
   

}
