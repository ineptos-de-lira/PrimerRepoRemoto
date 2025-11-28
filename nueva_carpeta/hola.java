import java.util.Scanner;

public class hola {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = lector.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes comprar cheves!");
        } else {
          	System.out.println("Todavia no puedes comprar cheves");
        }
    }
}
