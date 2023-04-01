
package com.mycompany.verificavalor;
import javax.swing.JOptionPane;


public class VerificaValor {

    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        
        if(valor >= 1 && valor <= 9) {
           System.out.println("Valor esta na faixa permetida.");
        }
        else {
        System.out.println("Valor fora da faixa permitida ");
        
        }
    }
    
}
