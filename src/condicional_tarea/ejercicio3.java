package condicional_tarea;

import javax.swing.*;

/**
 * Haga un algoritmo que dado 2 numeros determine si uno es divisor del otro
 */
public class ejercicio3 {
    public static void main(String[] args) {
        String num1  = JOptionPane.showInputDialog("Ingrese primer numero");
        String num2  = JOptionPane.showInputDialog("Ingrese el segundo numero");
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        if (n1%n2==0){
            JOptionPane.showMessageDialog(null,n2+"Es divisor de "+n1);
        } else if (n2%n1==0) {
            JOptionPane.showMessageDialog(null,n1+"Es divisor de "+n2);
        }else {
            JOptionPane.showMessageDialog(null,"No son divisibles entre ellos");
        }

    }
}
