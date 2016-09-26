/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import flyweight.FlyWeightFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import movimentos.Chute;
import movimentos.IGolpe;
import movimentos.Soco;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabio
 */
public class TesteComESemFlyWeight {

    private static final int TOTAL = 10000000;

    public TesteComESemFlyWeight() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testaAdicionar() {
        System.out.println("Adicionando Sem FlyWeight");
        
        List<IGolpe> combo = new ArrayList<>();
        for (int i = 0; i < TOTAL; i++) {
            Soco soco = new Soco();
            
            combo.add(soco);
            
        }
       

        
        
        assertTrue(combo.size() == TOTAL);

    }

    @Test
    public void testaAdicionarFlyWeight() {
        
        System.out.println("Adicionando Com FlyWeight");
        FlyWeightFactory teste = FlyWeightFactory.getInstancia();
        List<IGolpe> combo = new ArrayList<>();
        for (int i = 0; i < TOTAL; i++) {
            combo.add(teste.getGolpe(FlyWeightFactory.Tipos.SOCO));
           
        }

        assertTrue(combo.size() == TOTAL);
    }

    private void exibirTempo(double diferencaTempo) {

        float tempoAtual;
        tempoAtual = (float) (diferencaTempo / 1000) % 60;

        if (tempoAtual < 60) {
            System.out.printf("%s -> tempo: %f segundos <-\n", tempoAtual);
        } else {
            float minutos = (float) (diferencaTempo / 60000) % 60;
            System.out.printf("%s -> tempo: %f minuto(s) <-\n", minutos);
        }

    }

}
