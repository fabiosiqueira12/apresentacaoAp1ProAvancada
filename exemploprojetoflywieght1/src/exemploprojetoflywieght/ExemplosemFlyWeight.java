/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploprojetoflywieght;

import java.util.Arrays;
import java.util.List;
import movimentos.Chute;
import movimentos.IGolpe;
import movimentos.Soco;

/**
 *
 * @author fabio
 */
public class ExemplosemFlyWeight {

    public static void main(String[] args) {

        List<IGolpe> combo1 = Arrays.asList(new Soco(), new Chute(), new Soco(),
                new Soco(), new Soco());
        
        System.out.println(combo1);
        
        List<IGolpe> combo2 = Arrays.asList(new Soco(), new Chute(), new Soco(),
                new Soco(), new Soco());
        
        System.out.println(combo2);
        
        for (IGolpe iGolpe : combo2) {
            
            System.out.println(iGolpe.executa());
        }
    }

}
