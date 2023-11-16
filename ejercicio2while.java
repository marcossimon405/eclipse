package proyectodeberes;
import java.util.Scanner;

public class ejercicio2while {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número ");
			int N = scanner.nextInt();
			while( N>=1 ) {
	            System.out.println(N);

				N--;
			
			}
		    scanner.close();
}

}