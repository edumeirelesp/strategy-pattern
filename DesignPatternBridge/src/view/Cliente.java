/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Abstracao;
import model.AbstracaoRefinada;
import model.ComponenteA;


/**
 *
 * @author usuar
 */
public class Cliente {
    public static void main(String[] args){
       Abstracao absR = new AbstracaoRefinada(new ComponenteA());
       
       absR.executa();
    }
}
