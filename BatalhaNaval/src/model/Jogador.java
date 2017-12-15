package model;

import java.util.List;

public class Jogador {

    /**
     * @param barcos the barcos to set
     */
    private String nome;
    private Tabuleiro tabuleiroProprio;
    private Tabuleiro tabuleiroEnimigo;
    private List<Barco> barcos;

    public Jogador(String nome, Tabuleiro tabuleiroProprio, Tabuleiro tabuleiroEnimigo) {
        this.nome = nome;
        this.tabuleiroProprio = tabuleiroProprio;
        this.tabuleiroEnimigo = tabuleiroEnimigo;
    }

    public Tabuleiro getTabuleiroProprio() {
        return tabuleiroProprio;
    }

    public Tabuleiro getTabuleiroEnimigo() {
        return tabuleiroEnimigo;
    }

    public List<Barco> getBarcos() {
        return barcos;
    }

    public boolean perdi() {
        return barcos.stream().noneMatch(barco -> !barco.isAfundado());
    }

    public void setBarcos(List<Barco> barcos) {
        this.barcos = barcos;
    }

}
