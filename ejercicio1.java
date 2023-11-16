package proyectodeberes;
import java.util.Scanner;


public class ejercicio1 {
	/**
	 * te dice lo que va a hacer este metodo
	 * @param args
	 */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     System.out.print("Ingresa cantidad dinero: ");
        
     	double dinero = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ingresa la moneda euros (E) dólares (D)");
        char convertir = sc1.next().charAt(0);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("¿Desea convertirlo a la otra moneda? si (Y) no (N)");
        char pregunta = sc2.next().charAt(0);
        
        if (pregunta == 'Y') {
        	switch (convertir) {
        	case 'E':
        		dinero = dinero * 1.06;
        		System.out.println(dinero);
        		break;
        	default:
        		dinero = dinero / 1.06;
        		System.out.println(dinero);
        	}
        }
        else {
        	System.out.println(dinero);
        }
     	
    }
}