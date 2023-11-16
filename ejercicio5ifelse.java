package proyectodeberes;
import java.util.Scanner;

public class ejercicio5ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número:");
        int numero = scanner.nextInt();
          
        if (numero >= 1 && numero <= 100) {
            System.out.println("El número está dentro del rango (1-100).");
        } else {
            System.out.println("El número está fuera del rango (1-100).");
        }
        
        scanner.close();
    }
}