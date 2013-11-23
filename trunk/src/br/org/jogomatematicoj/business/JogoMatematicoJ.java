package br.org.jogomatematicoj.business;

import java.util.Scanner;

/**
 *
 * @author Paulo Ricardo
 */
public class JogoMatematicoJ {

    private static MenuOpcoes mo = new MenuOpcoes();
    private static Scanner leConsole = new Scanner(System.in);
    private static String percentAcertos = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcaoMenu = 0;
        int numeroMaximo = 0;

        mo.mostrarMenu();
        opcaoMenu = mo.getOpcaoSelecionada();
        System.out.println("Você escolheu " + mo.getOpcaoSelecionada(opcaoMenu));
        switch (opcaoMenu) {
            case 0:
                Soma soma = new Soma();
                do {
                    System.out.println("Informe o maior número para cada um dos fatores");
                    numeroMaximo = leConsole.nextInt();

                    soma.gerar2Inteiros(numeroMaximo);
//                    soma.soma2Inteiros();
                    System.out.println("\nAperte 1 se você quer somar outra conta:");
                } while (leConsole.nextInt() == 1);

                System.out.print("Você teve " + soma.getNumeroAcertos() + " acertos ");
                System.out.println("e " + soma.getNumeroErros() + " erros");
                percentAcertos = String.format("Ou seja, de 0 a 10, você tirou nota %.1f", soma.getPercentualAcertos()/10);
                System.out.println(percentAcertos);
                break;
            case 1:
                Subtracao subtracao = new Subtracao();
                do {
                    System.out.println("Informe o maior número para cada um dos fatores");
                    numeroMaximo = leConsole.nextInt();

                    subtracao.subtrair2Inteiros(numeroMaximo);
                    System.out.println("\nAperte 1 se você quer somar outra conta:");
                } while (leConsole.nextInt() == 1);

                System.out.print("Você teve " + subtracao.getNumeroAcertos() + " acertos ");
                System.out.println("e " + subtracao.getNumeroErros() + " erros");
                percentAcertos = String.format("Ou seja, de 0 a 10, você tirou nota %.1f", subtracao.getPercentualAcertos()/10);
                System.out.println(percentAcertos);
                break;
            case 2:
                Multiplicacao multiplicacao = new Multiplicacao();
                do {
                    System.out.println("Informe o maior número para cada um dos fatores");
                    numeroMaximo = leConsole.nextInt();

                    multiplicacao.multiplicar2Inteiros(numeroMaximo);
                    System.out.println("\nAperte 1 se você quer somar outra conta:");
                } while (leConsole.nextInt() == 1);

                System.out.print("Você teve " + multiplicacao.getNumeroAcertos() + " acertos ");
                System.out.println("e " + multiplicacao.getNumeroErros() + " erros");
                percentAcertos = String.format("Ou seja, de 0 a 10, você tirou nota %.1f", multiplicacao.getPercentualAcertos()/10);
                System.out.println(percentAcertos);
                break;
        }
    }

}
