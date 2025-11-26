import java.util.Scanner;

class Hola {
  public static void main(String[] args) throws Exception{
    Saludar.saludar();
  }
}

class Saludar{
  static String obtenerNombre(){
    Scanner s = new Scanner(System.in);
    System.out.println("Ingresa tu nombre: ");
    String nombre = s.nextLine();
    return nombre;
  }

  static void saludar(){
    String nombre = obtenerNombre();
    System.out.println("Hola " + nombre);
  }
}
