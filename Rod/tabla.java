import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de la tabla que deseas crear: ");
        int n = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            int res  = i * n;
            System.out.println(i + " X " + n + " = " + res);
        }

        sc.close();

    }
}

