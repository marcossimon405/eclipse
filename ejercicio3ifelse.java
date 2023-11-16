package proyectodeberes;
import java.util.Scanner;

public class ejercicio3ifelse {
	public static void main(String [] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print(" Ingrese un numero ");
	    int numero = scanner.nextInt();
	    
	    if(numero %2 == 0) {
	        System.out.println("Es par");
	    }else {
	        System.out.println("Es impar");

	    }
	    scanner.close();

}
}
