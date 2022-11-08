import java.util.Scanner;
/**
 *  programa para devolver el dia de la semana en palabras dado un numero del 1 al 7
 *  Creado por Motolo
 */
public class SeleccionSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numemro del 1 al 7");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println("lUNES");
            case 2 -> System.out.println("MARTES");
            case 3 -> System.out.println("MIERCOLES");
            case 4 -> System.out.println("JUEVES");
            case 5 -> System.out.println("VIERNES");
            case 6 -> System.out.println("SABADO");
            case 7 -> System.out.println("DOMINGO");
            default -> System.out.println("Numero erroneo");
        }
    }
}