import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero del 1 al 3");
        int n = sc.nextInt();
        switch (n){
            case 1 :
                System.out.println("Ingrese la base del triangulo");
                int b = sc.nextInt();
                System.out.println("Ingrese la altura del triangulo");
                int h = sc.nextInt();
                int At = (b*h)/2;
                System.out.println("El area es "+ At);
                break;
            case 2 :
                System.out.println("Ingrese el radio de la circunferencia");
                double r = sc.nextDouble();
                double Acir = (Math.PI*Math.pow(r,2));
                System.out.println("El area de la circunferencia es "+ Acir);
                break;
            case 3 :
                System.out.println("Ingrese el valor del lado");
                double l = sc.nextDouble();
                double Ac = Math.pow(l,2);
                System.out.println("El area del cuadrado es = "+ Ac);
                break;
            default:
                System.out.println("El numero ingresad no esta en el rango");
                break;
        }
    }
}
