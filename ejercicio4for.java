package proyectodeberes;
import java.util.Scanner;

public class ejercicio4for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
        } else {
            long factorial = 1;
        
            
		for (int i = 1; i <= numero; i++) {
            factorial *= i;
        } 
		    	
        System.out.println("El factorial de " + numero + " es " + factorial);

			    
			    scanner.close();

	
	}
    }
}			    