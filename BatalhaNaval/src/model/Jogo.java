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

    Turno turno = Turno.jogador1;


    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void mudarTurno() {
        turno = turno.mudarTurno();
    }


    public Jogo(Jogador jogador1, Jogador jogado2) {
        this.jogador1 = jogador1;
    }
    
    
    
    
    public void mudarTurno(){
       turno = turno.mudarTurno();
    }
    
    public void jogo(){
        
    }
   
>>>>>>> 23f8c53dfe4550a6018565cf4d224396512a429b
}
