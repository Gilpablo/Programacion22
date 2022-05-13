package bucles;

import java.util.Scanner;

public class bucles2Ejercicios {
	
	public static void ejercicio1() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce un número y te dire cuantos multiplos de 3 hay");
		
		int num = leer.nextInt();
		
		int cont = 0;
		
		if (num%3==0) {
			do {
				num = num - 3;
				
				cont = cont + 1;
			} while (num!=0);
		}else {
			num = num -1 ;
			
			if (num%3==0) {
				do {
					num = num - 3;
					
					cont = cont + 1;
				} while (num!=0);
				
			}else {
		
				num = num - 1 ;
				
				if (num%3==0) {
					do {
						num = num - 3;
						
						cont = cont + 1;
					} while (num!=0);
				
				}		
	
			}
	
		}
		
		System.out.println("Cantidad de multiplos de 3:" + cont);
		
	}
	
	public static void ejercicio2() {
		
		System.out.println("Dime un número entero positivo y te dire si es primo o no.");
		
		Scanner leer = new Scanner (System.in);
		int n;
		boolean primo = false;
		n = leer.nextInt();
		
		int contador = 0;
		for(int i = n; i > 0; i--){
		    if(n % i == 0 ){
		        contador++;
		    }
		}
		if(contador == 2){
		    primo = true;
		}
		
		
		if (primo == true) {
			System.out.println("es primo");
		}else if (primo == false) {
			System.out.println("no es primo");
		}
	}
	
	public static void ejericio3() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime un número inicial: ");
		
		int num = leer.nextInt();
		
		int fallos = 0;
		
		int cont = 0;
		
		do {
			
			int viejo = num;
			
			System.out.println("Dime un número: ");
			
			num = leer.nextInt();
			
			cont = cont + 1;
			
			if(num < viejo) {
				fallos = fallos + 1;
										
				System.out.println("Fallo, es menor");
			}
		} while (num != 0);
		
		System.out.println("Total de números introducidos: " + cont);
		System.out.println("Números fallados: " + fallos);
		
	}
	
	
	public static void ejercicio4() {
		
		int cuadrado;
		
		int suma = 0;
		
		for (int i = 1; i < 6; i++) {
			
			cuadrado = i * i;		
			
			suma = suma + cuadrado;
			
			System.out.println(i + " * " + i + " = " + cuadrado);
		}
		
		System.out.println("La suma total es de " + suma);
	}
	
	
	public static void ejercicio5() {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int num = leer.nextInt();
		
		if (num<0) {
			System.out.println(" * ");
		}else {
			
			for (int i = 0; i < num; i++) {
				
				System.out.print(" * ");
			}	
		}
	}
	
	
	public static void ejercicio6() {
	
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int num = leer.nextInt();
		
		for (int i = 1; i < num+1; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
			
		}
		
	}
	
	public static void ejercicio7() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 2 números (el segundo tiene que ser mayor) : ");
		
		int a = leer.nextInt();
		
		int b = leer.nextInt();
		
		int cont = 0;
		
		while (a >= b) {

			System.out.println("El segundo tiene que ser mayor, dime otro: ");
			
			b = leer.nextInt();
		}
	
		for (int i = a; i < b+1; i++) {
			System.out.print(i + " ");
			
			if (i%2==0) {
				cont = cont + 1;
			}
		}
		System.out.println(" ");
		System.out.println("Hay un total de " + cont + " números pares.");
		
	}
	
	
	public static void ejercicio8(int num) {
		
		for(int altura = 1; altura<=num; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=num-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
		
            System.out.println("");
		
	}
	
	}
	
	
	
}
