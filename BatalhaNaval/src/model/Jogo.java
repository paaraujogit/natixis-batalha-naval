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
    
    
    public void mudarTurno(){
        turno.mudarTurno();
    }
    
   
}
