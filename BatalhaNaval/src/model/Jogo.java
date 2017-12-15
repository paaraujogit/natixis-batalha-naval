package model;


public class Jogo {     
    enum Turno {
        jogador1{
            @Override
            public Turno mudarTurno() {
                return Turno.jogador2;
            }        
        },
        jogador2{
            @Override
            public Turno mudarTurno() {
                return Turno.jogador1;
            }
        };
        public abstract Turno mudarTurno();
    }
    
    Jogador jogador1;
    Jogador jogado2;
    
    Turno turno = Turno.jogador1;

    public Jogo(Jogador jogador1, Jogador jogado2) {
        this.jogador1 = jogador1;
        this.jogado2 = jogado2;
    }
    
    
    
    
    public void mudarTurno(){
       turno = turno.mudarTurno();
    }
    
    public void jogo(){
        
    }
   
}
