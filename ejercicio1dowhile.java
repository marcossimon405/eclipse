package proyectodeberes;
import java.util.Scanner;

public class ejercicio1dowhile {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número ");
			int N = scanner.nextInt();
			int i = 1;
			while( i<=N ) {
				System.out.println(i);
				i++;
			
			}
		    scanner.close();
}

}
