package proyectodeberes;
import java.util.Scanner;

public class ejercicio5for {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número N: ");
	        int N = scanner.nextInt();

	        if (N < 1) {
	        	
	        } else {

	            for (int i = N; i >= 1; i--) {
	                System.out.println(i);
	            }
	        }	      
	        	scanner.close();

	    }
	}