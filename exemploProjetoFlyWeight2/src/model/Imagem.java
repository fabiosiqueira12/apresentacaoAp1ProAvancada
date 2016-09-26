/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fabio
 */
public class Imagem {
    private String nomeImg;

    public Imagem(String nomeImg) {
        this.nomeImg = nomeImg;
    }
    
    public void DesenhaImg(){
        System.out.println(this.nomeImg + "Desenhada!");
    }
    
    
}
