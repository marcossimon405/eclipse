package proyectodeberes;
import java.util.Scanner;

public class ejercicio3while {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

			int N = scanner.nextInt();
			int digitos = 0;
			System.out.println("Di un numero");
			while( N != 0 ) {
	            N = N/10;	
	            digitos++;
			}
            System.out.println("Este número tiene"+ " " + digitos + " " + "digitos.");

		    scanner.close();
}

}