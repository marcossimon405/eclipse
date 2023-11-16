package proyectodeberes;
import java.time.Year;
import java . time . YearMonth ;
import java.util.Scanner;

public class ejercicio4ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese su año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();
        
        int anioActual = Year.now().getValue();
        int edad = anioActual - anioNacimiento;
        
        
        if (edad > 0) {
            System.out.println("Tienes" + edad + "años");
        } else {
            System.out.println("Aun no has nacido.");
        }
        
        scanner.close();
    }
}