package br.org.jogomatematicoj.business;

/**
 *
 * @author Paulo Ricardo
 */
public class Soma extends OperacoesBase {

    public Soma() {
        setNumeroAcertos(0);
        setNumeroErros(0);
    }

    public void gerar2Inteiros(int maiorNumero) {
        setFator1(getNroRandomico().nextInt(maiorNumero));
        setFator2(getNroRandomico().nextInt(maiorNumero));
    }

    public void soma2Inteiros(int resposta) {
        if ((int) resposta == (getFator1() + getFator2())) {
            setNumeroAcertos(getNumeroAcertos() + 1);
            setAcertou(true);
        } else {
            setNumeroErros(getNumeroErros() + 1);
            setAcertou(false);
        }
    }

}
