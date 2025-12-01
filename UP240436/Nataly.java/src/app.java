import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones vas a ingresar? ");
        int n = sc.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Calificación " + i + ": ");
            double cal = sc.nextDouble();
            suma += cal;
        }

        double promedio = suma / n;
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}


