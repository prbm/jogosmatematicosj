/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.jogomatematicoj.business;

/**
 *
 * @author Paulo Ricardo
 */
public class Divisao extends OperacoesBase {

    private int limiteFator1 = 200;
    private int limiteFator2 = 10;

    public Divisao() {
        setNumeroAcertos(0);
        setNumeroErros(0);
    }

    public void gerar2Inteiros() {
        setFator1(getNroRandomico().nextInt(limiteFator1));

        do {
            setFator2(getNroRandomico().nextInt(limiteFator2));
        } while (getFator2() == 0);

        while ((getFator1() % getFator2()) != 0) {
            setFator1(getNroRandomico().nextInt(limiteFator1));
            do {
                setFator1(getNroRandomico().nextInt(limiteFator1));
            } while (getFator1() == 0);
        }
    }

    public void dividir2Inteiros(int resposta) {
        if ((int) resposta == (getFator1() / getFator2())) {
            setNumeroAcertos(getNumeroAcertos() + 1);
            setAcertou(true);
        } else {
            setNumeroErros(getNumeroErros() + 1);
            setAcertou(false);
        }
    }
}
