/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author usuar
 */
public class AbstracaoRefinada extends Abstracao{

    public AbstracaoRefinada(Componente cmp) {
        super(cmp);
    }

    @Override
    public void executa() {
        operacao();
    }
    
}