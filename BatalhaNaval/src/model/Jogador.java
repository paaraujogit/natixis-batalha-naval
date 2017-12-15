package model;

import java.util.List;

public class Jogador {
    private String nome;
    private Tabuleiro tabuleiroProprio;
    private Tabuleiro tabuleiroEnimigo;
    private List<Barco> barcos;

    public Jogador(String nome, Tabuleiro tabuleiroProprio, Tabuleiro tabuleiroEnimigo) {
        this.nome = nome;
        this.tabuleiroProprio = tabuleiroProprio;
        this.tabuleiroEnimigo = tabuleiroEnimigo;
    }
    
    
}
