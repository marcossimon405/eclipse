package proyectodeberes;

import java.util.Scanner;

public class ejercicio2ifelse {
public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un numero");
    double numero = scanner.nextDouble();
    
    if (numero > 0) {
        System.out.println("Es positivo.");
    } else if (numero < 0) {
        System.out.println("Es negativo.");
    } else {
        System.out.println("Es cero.");
    }

 
    scanner.close();
}
}
