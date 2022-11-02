package model;

import interfaces.Loja;

public class Lanchonete extends LojaDecorator{

    public Lanchonete(Loja loja) {
        super(loja);
    }

    @Override
    public Float getAdicionalFaturamento() {
        return 100000f;
    }

    @Override
    public String getPropagandaPlus() {
        return "Lanchonete";
    }
}
