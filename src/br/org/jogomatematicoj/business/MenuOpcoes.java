package br.org.jogomatematicoj.business;

import java.util.Scanner;

/**
 *
 * @author Paulo Ricardo
 */
public class MenuOpcoes {
    private String[] opcoesMenu;
    private int opcaoSelecionada;
    
    public MenuOpcoes(){
        opcoesMenu = new String[]{"Soma", "Subtração", "Multiplicação", "Divisão de Números Inteiros"};
        opcaoSelecionada = 0;
    }
    
    public void mostrarMenu(){
        Scanner leOpcaoUsr = new Scanner(System.in);
        
        System.out.println("Selecione uma das opções abeixo:");
        System.out.println("1 - " + opcoesMenu[0]);
        System.out.println("2 - " + opcoesMenu[1]);
        System.out.println("3 - " + opcoesMenu[2]);
        System.out.println("4 - " + opcoesMenu[3]);
        
        opcaoSelecionada = leOpcaoUsr.nextInt();
        // corrige a opção da lista para pegar a opção correta no vetor
        opcaoSelecionada--;
    }

    public int getOpcaoSelecionada() {
        return opcaoSelecionada;
    }
    
    public String getOpcaoSelecionada(int opcao) {
        return opcoesMenu[opcao];
    }
    
}
