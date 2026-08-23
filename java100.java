package Ativ_2;

import javax.swing.JOptionPane;

public class Fluxo_2 {
    public static void main(String[] args) {
        String resultado = "";
        
        for (int i = 1; i <= 100; i++) {
            resultado += "JAVA\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}