package proyectodeberes;
import java.util.Scanner;

public class ejercicio3for {
		public static void main(String[] args) {
			
			System.out.println("Ingresa un numero");
	        Scanner scanner = new Scanner(System.in);

				int numero = scanner.nextInt();
				
			    for (int i = 1; i <= 10; i ++) {
		            
			    	int resultado = numero * i;
			    		System.out.println(numero + "x" + i + "=" + resultado);
			    	 
			   }
				    
				    scanner.close();

		
		}
	   
	}			    