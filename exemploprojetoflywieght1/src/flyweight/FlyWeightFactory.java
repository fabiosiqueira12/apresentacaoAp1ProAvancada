/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.ArrayList;
import movimentos.Chute;
import movimentos.Especial;
import movimentos.IGolpe;
import movimentos.Soco;
import movimentos.Soquinho;

/**
 *
 * @author fabio
 */
public class FlyWeightFactory {
    private static FlyWeightFactory instancia;
    
    private ArrayList<IGolpe> listaGolpes;
    
    public enum Tipos{
        SOCO,CHUTE,SOQUINHO,ESPECIAL;
    }
    
    private FlyWeightFactory(){
        listaGolpes = new ArrayList<>();
        listaGolpes.add(new Soco());
        listaGolpes.add(new Soquinho());
        listaGolpes.add(new Chute());
        listaGolpes.add(new Especial());
    }
    
    public static FlyWeightFactory getInstancia(){
        if (instancia == null){
            
            synchronized (FlyWeightFactory.class){
                 if (instancia == null){
                     instancia = new FlyWeightFactory();
                 }
            }
            
        }
        
        return instancia;
    }
    
    
    public IGolpe getGolpe(Tipos tipo){
        switch (tipo){
            case SOCO:
                return this.listaGolpes.get(0);
            case CHUTE :
                return this.listaGolpes.get(2);
            case SOQUINHO :
                return this.listaGolpes.get(1);
            case ESPECIAL :
                return this.listaGolpes.get(3);
            default:
                return null;
        }
        
    }
    
}
