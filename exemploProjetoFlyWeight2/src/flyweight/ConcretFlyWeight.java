/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import model.Imagem;
import model.Ponto;

/**
 *
 * @author fabio
 * 
 */
public class ConcretFlyWeight implements IFlyWeight{
    private Imagem imagem;

    public ConcretFlyWeight(String nomeImagem) {
        imagem = new Imagem(nomeImagem);
    }
    
    
    @Override
    public void desenhaImagem(Ponto ponto) {
         imagem.DesenhaImg();
         System.out.println("No Ponto ("+ponto.getX()+","+ponto.getY()+")!");
    }
    
    
    
}
