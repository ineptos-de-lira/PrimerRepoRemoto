import java.util.Scanner; 

class Calcualdora {
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el dividendo");
		double a = sc.nextDouble();

		System.out.println("Ingresa el divisor");
		double b = sc.nextDouble();
		
		sc.close();

		double div = division(a,b);
		System.out.println("El resultado de la división entre " + a + " y " + b + " es: " + div);
	

	}

	public static double division (double a, double b){
		double div = a/b; 

		return div; 
	}
}
