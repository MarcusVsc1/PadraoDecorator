package model;

import interfaces.Loja;

public abstract class LojaDecorator implements Loja {

    private Loja loja;

    public LojaDecorator(Loja loja) {
        this.loja = loja;
    }

    @Override
    public Float getFaturamento() {
        return this.loja.getFaturamento() + this.getAdicionalFaturamento() * 0.7f;
    }

    @Override
    public String getPropaganda() {
        return this.loja.getPropaganda() + "&" + this.getPropagandaPlus();
    }

    public abstract Float getAdicionalFaturamento();

    public abstract String getPropagandaPlus();
}
