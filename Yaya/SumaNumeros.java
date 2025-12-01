import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = entrada.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + resultado);

        entrada.close();
    }
}
