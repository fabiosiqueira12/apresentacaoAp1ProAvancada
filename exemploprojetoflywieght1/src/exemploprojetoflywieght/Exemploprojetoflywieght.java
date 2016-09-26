/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploprojetoflywieght;

import flyweight.FlyWeightFactory;
import java.util.Arrays;
import java.util.List;
import movimentos.Chute;
import movimentos.IGolpe;
import movimentos.Soco;

/**
 *
 * @author fabio
 */
public class Exemploprojetoflywieght {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlyWeightFactory teste = FlyWeightFactory.getInstancia();
        
       
        List<IGolpe> combo1 = Arrays.asList(teste.getGolpe(FlyWeightFactory.Tipos.SOCO),
                teste.getGolpe(FlyWeightFactory.Tipos.CHUTE),
                teste.getGolpe(FlyWeightFactory.Tipos.SOCO),
                teste.getGolpe(FlyWeightFactory.Tipos.SOCO),teste.getGolpe(FlyWeightFactory.Tipos.ESPECIAL));
        
        System.out.println(combo1);
        
        List<IGolpe> combo2 = Arrays.asList(teste.getGolpe(FlyWeightFactory.Tipos.SOCO),
                teste.getGolpe(FlyWeightFactory.Tipos.CHUTE),
                teste.getGolpe(FlyWeightFactory.Tipos.SOCO),
                teste.getGolpe(FlyWeightFactory.Tipos.SOCO),teste.getGolpe(FlyWeightFactory.Tipos.ESPECIAL));
        
        System.out.println(combo2);
        
        for (IGolpe iGolpe : combo2) {
            
            System.out.println(iGolpe.executa());
        }
    }
    
}
