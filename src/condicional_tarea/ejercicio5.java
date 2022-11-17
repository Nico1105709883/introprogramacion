package condicional_tarea;

import java.util.Scanner;

/**
 * Construya un algoritmo que reciba como datos de entrada tres números enteros, y regrese como dato de salida
 * un mensaje que diga si esos tres números enteros pueden ser las medidas de los lados de un triángulo rectángulo.
 */

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese 3 numeros");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double ladom;
        double pow;
        if ( n1 > n2 && n1 > n3){
            ladom = n1;
            pow = Math.pow(n2,2)+Math.pow(n3,2);
            if (ladom == pow){
                System.out.println("Los lados son validos");
            }
        } else if (n2 > n1 && n2 > n3) {
            ladom = n2;
            pow = Math.pow(n1,2)+Math.pow(n3,2);
            if (ladom == pow){
                System.out.println("Los lados son validos");
        }} else if (n3 > n1 && n3 > n2) {
            ladom = n3;
            pow = Math.pow(n1,2)+Math.pow(n2,2);
            if (ladom == pow){
                System.out.println("Los lados son validos");
            }

        }else {
            System.out.println("Error");
        }
    }
}
