package proyectodeberes;

import java.util.Scanner;

public class ejercicio2switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num2; 
		char ope ; 
		System.out.println("Ingrese un numero para operar");
		num = sc.nextInt();
		System.out.println("Ingrese una operacion para realizar(+ - * /)");
		ope = sc.next().charAt(0);
		System.out.println("Ingrese un numero para operar");
		num2 = sc.nextInt();
		sc.close();
		switch(ope) {
			case '+':
				System.out.println("A seleccionado la suma "+num+"+"+num2+" = "+(num+num2));
			break;
			case '-':
				System.out.println("A seleccionado la suma "+num+"-"+num2+" = "+(num-num2));
			break;
			case '*':
				System.out.println("A seleccionado la suma "+num+"*"+num2+" = "+(num*num2));
			break;
			case '/':
				System.out.println("A seleccionado la suma "+num+"/"+num2+" = "+(num/num2));
			break;
		}
		
	}

}
