import interfaces.Loja;
import model.Estacionamento;
import model.Lanchonete;
import model.LojaShopping;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LojaTest {

    @Test
    public void lojaSimplesTest(){
        Loja loja = new LojaShopping(100000f);
        assertEquals(100000f, loja.getFaturamento());
    }

    @Test
    public void lojaUmDecoratorTest(){
        Loja loja = new Estacionamento(new LojaShopping(100000f));
        assertEquals(240000f, loja.getFaturamento());
    }

    @Test
    public void lojaDoisDecoratorsTest(){
        Loja loja = new Lanchonete(new Estacionamento(new LojaShopping(100000f)));
        assertEquals(310000f, loja.getFaturamento());
    }

    @Test
    public void lojaSimplesPropagandaTest(){
        Loja loja = new LojaShopping(100000f);
        assertEquals("Aqui tem LojaDeRoupas", loja.getPropaganda());
    }

    @Test
    public void lojaUmDecoratorPropagandaTest(){
        Loja loja = new Estacionamento(new LojaShopping(100000f));
        assertEquals("Aqui tem LojaDeRoupas&Estacionamento", loja.getPropaganda());
    }

    @Test
    public void lojaDoisDecoratorsPropagandaTest(){
        Loja loja = new Lanchonete(new Estacionamento(new LojaShopping(100000f)));
        assertEquals("Aqui tem LojaDeRoupas&Estacionamento&Lanchonete", loja.getPropaganda());
    }




}
