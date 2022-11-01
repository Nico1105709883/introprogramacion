import java.util.Scanner;

public class diasemana {
    public static void main(String[] args) {
        System.out.printf("%s","programa para saber el dia\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 1 al 7");
        int n = sc.nextInt();
        if (n == 1)
            System.out.println("Es lunes");
        else if (n == 2)
            System.out.println("Es martes");
        else if (n == 3)
            System.out.println("Es miercoles");
        else if (n == 4)
            System.out.println("Es jueves");
        else if (n == 5)
            System.out.println("Es viernes");
        else if (n == 6)
            System.out.println("Es sabado");
        else
            System.out.println();

    }
}
