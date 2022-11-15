package repeticon_while;

import javax.swing.*;

/**
 * Generar la tabla de multiplocar hasta el 10 de un numero ingresado por teclado
 */
public class TablaMultiplicacion {
    public static void main(String[] args) {
        //System.out.println("Programa para generar la tabla de multiplicar");
        JOptionPane.showMessageDialog(null,"Programa para generar la tabla de multiplocar hasta el 10 de un numero ingresado por teclado");
        //System.out.println("Ingrese  un numero");
        String num = JOptionPane.showInputDialog("Ingrese un numero");
        String acumulador = "";
        int contador = 1;
        while (contador<= 10){
            int mult = Integer.parseInt(num) * contador; //convertimos valor str a int
            String salida = num + 'X' + String.valueOf(contador) + '=' + String.valueOf(mult)+'\n';
            acumulador = acumulador +salida;
            contador = contador + 1;

        }
    JOptionPane.showMessageDialog(null, acumulador);
    }


}
