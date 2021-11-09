package br.com.traducao.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TraducaoTest {
    @Test
    public void testeTraducao(){
        Linguas linguas = new Linguas();
        String traducao = linguas.encontrarTraducao("brasil");

        Assert.assertEquals("brasil", traducao);
    }
}
