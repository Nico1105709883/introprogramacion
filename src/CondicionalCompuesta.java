import java.util.Scanner;
    public class CondicionalCompuesta {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la edad");
            int edad = sc.nextInt();
            if ((edad > 0) && (edad <= 150)) {
                if ((edad < 18)) {
                    System.out.println("Eres menor de edad");
                } else if ((edad<= 65)){
                    System.out.println("Eres mayor de edad");
                } else if ((edad<=100)){
                    System.out.println("Eres de la tercera edad");
                } else{
                    System.out.println("Eres una persona sabia");
                }
            }else
                System.out.println("Edad erronea");
            }
        }