package proyectodeberes;
import java.util.Scanner;

public class ejercicio1for {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
    		System.out.println("Ingresa un numero");

			int N = scanner.nextInt();
			
			for (int i = 1; i <= N; i++) {
			    System.out.println(i);
			}
		    scanner.close();

		}
	}
	
}
