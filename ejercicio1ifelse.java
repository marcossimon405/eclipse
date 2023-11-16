package proyectodeberes;

import java.util.Scanner;

public class ejercicio1ifelse {
public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in); 
    	
		System.out.print("Ingrese su calificación en el examen (un número entre 0 y 100): ");
		int calificacion = scanner.nextInt();
		
		if ( calificacion >=60){
			System.out.print("Aprobado");
		} else {
			System.out.print("Suspenso");

		}
	}

}

