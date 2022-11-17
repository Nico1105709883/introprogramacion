package condicional_tarea;

import javax.swing.*;

/**
 * Haga un algoritmo que dada una fecha entre 01/01/1990 al 31/12/2010 determine si es correcta o no (tenga en cuenta los bisiestos)
 */

public class ejercicio2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Ingrese dia mes y año");
        String d = JOptionPane.showInputDialog("Ingrese el dia");
        String m = JOptionPane.showInputDialog("Ingrese el mes");
        String a = JOptionPane.showInputDialog("Ingrese el año");
        int day = Integer.parseInt(d);
        int month = Integer.parseInt(m);
        int year = Integer.parseInt(a);
        if (year >= 1990 && year <= 2010){
            if(year%4==0){

            }
        }
    }
}

