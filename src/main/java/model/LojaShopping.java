package model;

import interfaces.Loja;

public class LojaShopping implements Loja {

    private Float faturamento;

    public LojaShopping(Float faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public Float getFaturamento() {
        return faturamento;
    }

    @Override
    public String getPropaganda() {
        return "Aqui tem LojaDeRoupas";
    }
}
