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
public abstract class Abstracao {
    private Componente cmp;

    public Abstracao(Componente cmp) {
        this.cmp = cmp;
    }
    
    public void operacao(){
        cmp.operacao();
    }
    
    public abstract void executa();

    public Componente getCmp() {
        return cmp;
    }

    public void setCmp(Componente cmp) {
        this.cmp = cmp;
    }
}
