import java.util.Scanner;
    public class CondicionalDoble {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la edad");
            int edad = sc.nextInt();
            if ((edad > 0) && (edad <= 150)) {
                if (edad >= 18) {
                    System.out.println("Eres mayor de edad");
                    System.out.println("Estas casi listo para ir a la U");
                }else {
                    System.out.println("Aun estas peke");
                }
            }else{
            System.out.println("error");
            }
        }
    }

