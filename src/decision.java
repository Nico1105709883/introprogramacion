import java.util.Scanner;

//Programa para determinar si una persona es mayor de edad
public class decision {
    public static void main(String[] args) {
        System.out.printf("%S","Programa para determinar la mayoria de edad\n");
        System.out.println("Ingrese la edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
            System.out.printf("Falta madurar");
        }
    }
}
