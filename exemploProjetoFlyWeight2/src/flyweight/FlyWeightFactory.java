/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class FlyWeightFactory {

    private static FlyWeightFactory instancia;
    private static ArrayList<IFlyWeight> flyWeights;

    public enum Tipos {
        JOGADOR, INIMIGO_1, INIMIGO_2, INIMIGO_3, CENARIO_1, CENARIO_2;
    }

    private FlyWeightFactory() {

        flyWeights = new ArrayList<>();
        flyWeights.add(new ConcretFlyWeight("jogador.png"));
        flyWeights.add(new ConcretFlyWeight("inimigo1.png"));
        flyWeights.add(new ConcretFlyWeight("inimigo2.png"));
        flyWeights.add(new ConcretFlyWeight("inimigo3.png"));
        flyWeights.add(new ConcretFlyWeight("cenario1.png"));
        flyWeights.add(new ConcretFlyWeight("cenario2.png"));

    }

    public static FlyWeightFactory getInstancia() {
        if (instancia == null) {

            synchronized (FlyWeightFactory.class) {
                if (instancia == null) {
                    instancia = new FlyWeightFactory();
                }
            }

        }

        return instancia;
    }

    public IFlyWeight getFlyWeight(Tipos tipo) {
        switch (tipo) {
            case JOGADOR:
                return flyWeights.get(0);
            case INIMIGO_1:
                return flyWeights.get(1);
            case INIMIGO_2:
                return flyWeights.get(2);
            case INIMIGO_3:
                return flyWeights.get(3);
            case CENARIO_1:
                return flyWeights.get(4);
            case CENARIO_2:
                return flyWeights.get(5);
            default:
                return flyWeights.get(6);

        }
    }

    
}
