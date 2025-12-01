import java.util.InputMismatchException;
import java.util.Scanner;
/**Prueba.
 */

public class numeroMayor {
  /**Prueba.
   */
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el primero numero:");
      int n1 = sc.nextInt();
      System.out.println("Ingrese el segundo numero:");
      int n2 = sc.nextInt();
      System.out.println("Ingrese el tercero numero:");
      int n3 = sc.nextInt();
      if (n1 > n2) {
        if (n1 > n3) {
          System.out.println("El mayor es el primero: " + n1);
        }
      } else {
        if (n2 > n3) {
          System.out.println("El mayor es el segundo: " + n2);
        
        } else {
          System.out.println("El tercero es el mayor: " + n3);
        }
      }
      sc.close();
    } catch (InputMismatchException e) {
      System.out.println("Error lol, solo numeros enteros plis, nada de decimales y letras.");
    }  
  }
}