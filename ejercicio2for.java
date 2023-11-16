package proyectodeberes;
import java.util.Scanner;

public class ejercicio2for {
	public static void main(String[] args) {
		
		System.out.println("Ingresa un numero");
        Scanner scanner = new Scanner(System.in);

			int N = scanner.nextInt();
			int suma =0;
			
		    for (int i = 1; i <= N; i ++) {
		    	
		    	 
		    	if (i %2==0) {
		    		suma = suma + i;

			    }
		   }
			    
			    System.out.println("La suma de los números pares desde 1 hasta N es: " + suma);
			    scanner.close();

	
	}
   
}			    


