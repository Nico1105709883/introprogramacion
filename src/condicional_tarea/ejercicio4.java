package condicional_tarea;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Escriba un algoritmo para calcular el valor de la presión en libras por pulgada
 * cuadrada (psi) de una onda descrita como sigue:
 * • Para tiempo, t, igual a o menor que 35 segundos, la presión es 0.46t psi, y para tiempo mayor que 35 segundos la presión es 0.19t + 9.45 psi.
 * • El programa deberá pedir el tiempo como entrada y deberá desplegar la
 * presión como salida.
 */
public class ejercicio4 {
    public static void main(String[] args) {
        String tiempo = JOptionPane.showInputDialog(null,"Ingrese tiempo(t) en segundos");
        int t = Integer.parseInt(tiempo);
        DecimalFormat df = new DecimalFormat("#.00");
        double presion;
        if (t <= 35){
            presion = 0.46*t;
        } else {
          presion = 0.19*t + 9.45;
        }
        JOptionPane.showMessageDialog(null,"La presion es "+df.format(presion));
    }
}
