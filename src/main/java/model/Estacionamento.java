package model;

import interfaces.Loja;

public class Estacionamento extends LojaDecorator{

    public Estacionamento(Loja loja) {
        super(loja);
    }

    @Override
    public Float getAdicionalFaturamento() {
        return 200000f;
    }

    @Override
    public String getPropagandaPlus() {
        return "Estacionamento";
    }
}
