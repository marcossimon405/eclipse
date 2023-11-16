package proyectodeberes;
import java.util.Scanner;

public class ejercicio2dowhile {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número ");
			int N = scanner.nextInt();
			
			int suma = 0;
			int numero = 2;

			do {
				suma += numero;
				numero += 2;
				
			}while (numero <= N);
		        System.out.print("La suma de números pares de 2 hasta " + N + "es:" + suma);

				scanner.close();	

	 }
}