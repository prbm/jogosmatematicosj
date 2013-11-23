/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.jogomatematicoj.business;

/**
 *
 * @author Paulo Ricardo
 */
public class Subtracao extends OperacoesBase{

    public Subtracao() {
        setNumeroAcertos(0);
        setNumeroErros(0);
    }

    public void gerar2Inteiros(int maiorNumero) {
        setFator1(getNroRandomico().nextInt(maiorNumero));
        setFator2(getNroRandomico().nextInt(maiorNumero));
        
        if(getFator1()<getFator2()){
            int n = getFator1();
            setFator1(getFator2());
            setFator2(n);
        }
            
    }
    
    public void subtrair2Inteiros(int resposta) {
        if ((int) resposta == (getFator1() - getFator2())) {
            setNumeroAcertos(getNumeroAcertos() + 1);
            setAcertou(true);
        } else {
            setNumeroErros(getNumeroErros() + 1);
            setAcertou(false);
        }
    }
}
