package fntr;

import java.util.Scanner;

public class app {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculadora Básica ===");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Selecciona una operación:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        
        double resultado = 0;
        String operacion = "";
        
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                operacion = "+";
                break;
            case 2:
                resultado = restar(num1, num2);
                operacion = "-";
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                operacion = "*";
                break;
            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                    operacion = "/";
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                scanner.close();
                return;
        }
        
        System.out.println("Resultado: " + num1 + " " + operacion + " " + num2 + " = " + resultado);
        scanner.close();
    }
    
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static double restar(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        return a / b;
    }
}
