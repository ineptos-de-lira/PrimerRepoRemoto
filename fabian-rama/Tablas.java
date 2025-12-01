import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de la tabla que quieres: ");
        int n = sc.nextInt();

        int[] tabla = new int[10];  // Guardará los resultados de la tabla

        // Guardar los resultados en el array
        for (int i = 0; i < 10; i++) {
            tabla[i] = n * (i + 1);
        }

        // Imprimir la tabla
        System.out.println("Tabla del " + n + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(n + " x " + (i + 1) + " = " + tabla[i]);
        }
    }
}
