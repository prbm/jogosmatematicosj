/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.jogomatematicoj.business;

/**
 *
 * @author Paulo Ricardo
 */
public class Multiplicacao extends OperacoesBase {

    private int limiteFator1 = 500;
    private int limiteFator2 = 10;

    public Multiplicacao() {
        setNumeroAcertos(0);
        setNumeroErros(0);
    }

    public void gerar2Inteiros() {
        do {
            setFator1(getNroRandomico().nextInt(limiteFator1));
        } while (getFator1() == 0);

        do {
            setFator2(getNroRandomico().nextInt(limiteFator2));
        } while (getFator2() == 0);

        if (getFator1() < getFator2()) {
            int n = getFator1();
            setFator1(getFator2());
            setFator2(n);
        }

    }

    public void multiplicar2Inteiros(int resposta) {
        if ((int) resposta == (getFator1() * getFator2())) {
            setNumeroAcertos(getNumeroAcertos() + 1);
            setAcertou(true);
        } else {
            setNumeroErros(getNumeroErros() + 1);
            setAcertou(false);
        }
    }
}
