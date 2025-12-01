public class archivo {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Uso: java CalculadoraArgs <opcion> <num1> <num2>");
            System.out.println("Opciones: 1=Sumar, 2=Restar, 3=Multiplicar, 4=Dividir");
            System.out.println("Ejemplo: java CalculadoraArgs 1 10 5");
            return;
        }
        int opcion = Integer.parseInt(args[0]);
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (a + b));
                break;
            case 2:
                System.out.println("Resultado: " + (a - b));
                break;
            case 3:
                System.out.println("Resultado: " + (a * b));
                break;
            case 4:
                if (b == 0) System.out.println("Error: no se puede dividir entre 0.");
                else System.out.println("Resultado: " + (a / b));
                break;
            default:
                System.out.println("Opción inválida. Usa 1, 2, 3 o 4.");
        }
    }
}