package condicional_tarea;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese 2 numeros");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 > n2){
            System.out.println(n1+"Es mayor");
        } else if (n2 > n1) {
            System.out.println("El primer numero es menor");
        }else {
            System.out.println("Numeros invalidos");
        }

        }
    }

