package proyectodeberes;
import java.util.Random;
import java.util.Scanner;

public class ejercicio4while {
	 public static <random> void main(String[] args) {

			Random random = new Random();
			int aleatorio =  random.nextInt(100) + 1;;
	        Scanner scanner = new Scanner(System.in);
	        int intentos = 0;
	        
	        System.out.print("Ingresa un número ");


			while( true ) {
	            System.out.println("Introduce lo que crees:");
	            int crees = scanner.nextInt();
	            intentos++;
	            
			
			if (crees == aleatorio) {
				System.out.println("Adivinaste el numero en" + intentos + "intentos.");
				break;
			} else if  (crees < aleatorio) {
				System.out.println("El número es mayor");
				
			}else {
				System.out.println("El número es menor");

			}
			}
			 scanner.close();

			}

		   

}
