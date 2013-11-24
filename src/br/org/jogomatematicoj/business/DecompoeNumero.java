/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.jogomatematicoj.business;

/**
 *
 * @author Paulo Ricardo
 */
public class DecompoeNumero {

    public int[] decompoeInteiro(int num) {
        String numStr = Integer.toString(num);
        int arr[] = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            arr[i] = Integer.parseInt(Character.toString(c));
        }
        
        return arr;
    }

    public int[] decompoeInteiro(String num) {
        String numStr = num;
        int arr[] = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            arr[i] = Integer.parseInt(Character.toString(c));
        }
        
        return arr;
    }
    
}
