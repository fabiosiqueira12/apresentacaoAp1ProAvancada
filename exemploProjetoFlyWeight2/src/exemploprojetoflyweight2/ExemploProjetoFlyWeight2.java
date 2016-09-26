/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploprojetoflyweight2;

import flyweight.FlyWeightFactory;
import flyweight.FlyWeightFactory.Tipos;
import model.Ponto;

/**
 *
 * @author fabio
 */
public class ExemploProjetoFlyWeight2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlyWeightFactory factory = FlyWeightFactory.getInstancia();
 
    factory.getFlyWeight(Tipos.CENARIO_1).desenhaImagem(new Ponto(0, 0));
 
    factory.getFlyWeight(Tipos.JOGADOR).desenhaImagem(new Ponto(10, 10));
 
    factory.getFlyWeight(Tipos.INIMIGO_1).desenhaImagem(
            new Ponto(100, 10));
    factory.getFlyWeight(Tipos.INIMIGO_1).desenhaImagem(
            new Ponto(120, 10));
    factory.getFlyWeight(Tipos.INIMIGO_1).desenhaImagem(
            new Ponto(140, 10));
 
    factory.getFlyWeight(Tipos.INIMIGO_2).desenhaImagem(
            new Ponto(60, 10));
    factory.getFlyWeight(Tipos.INIMIGO_2).desenhaImagem(
            new Ponto(50, 10));
 
    factory.getFlyWeight(Tipos.INIMIGO_3).desenhaImagem(
            new Ponto(170, 10));
    }
    
}
