/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.jogomatematicoj.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 *
 * @author Paulo Ricardo
 */
public class OperacoesBase {
    private Random nroRandomico = new Random();

    private Collection<Integer> inteiros = new ArrayList<Integer>();
    private Integer resultadoSomaInteiros;
    private int numeroAcertos;
    private int numeroErros;
    private boolean acertou;
    private int fator1;
    private int fator2;

    public static final int SOMA = 0;
    public static final int SUBTRACAO = 1;
    public static final int MULTIPLICACAO = 2;
    public static final int DIVISAO = 3;
    
    public Random getNroRandomico() {
        return nroRandomico;
    }

    public void setNroRandomico(Random nroRandomico) {
        this.nroRandomico = nroRandomico;
    }

    public Collection<Integer> getInteiros() {
        return inteiros;
    }

    public void setInteiros(Collection<Integer> inteiros) {
        this.inteiros = inteiros;
    }

    public Integer getResultadoSomaInteiros() {
        return resultadoSomaInteiros;
    }

    public void setResultadoSomaInteiros(Integer resultadoSomaInteiros) {
        this.resultadoSomaInteiros = resultadoSomaInteiros;
    }

    public int getNumeroAcertos() {
        return numeroAcertos;
    }

    public void setNumeroAcertos(int numeroAcertos) {
        this.numeroAcertos = numeroAcertos;
    }

    public int getNumeroErros() {
        return numeroErros;
    }

    public void setNumeroErros(int numeroErros) {
        this.numeroErros = numeroErros;
    }

    public boolean isAcertou() {
        return acertou;
    }

    public void setAcertou(boolean acertou) {
        this.acertou = acertou;
    }

    public int getFator1() {
        return fator1;
    }

    public void setFator1(int fator1) {
        this.fator1 = fator1;
    }

    public int getFator2() {
        return fator2;
    }

    public void setFator2(int fator2) {
        this.fator2 = fator2;
    }

    public Double getPercentualAcertos() {
        return ((double) numeroAcertos / (numeroAcertos + numeroErros)) * 100;
    }    
    
}
