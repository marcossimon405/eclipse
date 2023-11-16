package proyectodeberes;
import java.util.Scanner;

public class ejercicio1switch {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     System.out.print("Ingresa un número del 1 al 7: ");
        
     	int numero = sc.nextInt();
     	
     	sc.close();
     	String diaSemana;
        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número no válido";
    }

        	System.out.println("El día de la semana correspondiente es: " + diaSemana);
    }
}
