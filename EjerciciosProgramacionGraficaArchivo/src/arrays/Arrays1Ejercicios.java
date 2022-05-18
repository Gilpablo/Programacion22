package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays1Ejercicios {
	
	public static void ejercicio1() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		int num;
		
		int vNums[];
		
		vNums = new int [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextInt();
			
			vNums [i] = num;
		
		}
		
		for (int j = 0; j < vNums.length; j++) {
			System.out.println(vNums[j]);
		}
		
	}
	
	public static void ejercicio2() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		int num;
		
		int suma = 0;
		
		int vNums[];
		
		vNums = new int [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextInt();
			
			vNums [i] = num;
		
		}
		
		for (int j = 0; j < vNums.length; j++) {			
			suma = suma + vNums[j];
		}
		
		System.out.println(suma);
		
		
	}

	public static void ejercicio3() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		int num;
		
		
		
		int vNums[];
		
		vNums = new int [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextInt();
			
			vNums [i] = num;
		
		}
		
		int mayor = 0 , menor = vNums[0];
		
		for (int i = 0; i < vNums.length; i++) {
			
			if (vNums[i]>mayor) {
				mayor = vNums[i];
			}
			if (vNums[i]<menor) {
				menor=vNums[i];
			}
		}
		System.out.println("El mayor es el " + mayor + " y el menos es el " + menor);
		
	}

	public static void ejercicio4() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		int num;
		
		int posi = 0 , nega = 0;
		
		int vNums[];
		
		vNums = new int [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextInt();
			
			vNums [i] = num;
		
		}
		
		for (int i = 0; i < vNums.length; i++) {
			
			
			if (vNums[i]>0) {
				posi = posi + vNums[i];
			}
			
			if (vNums[i]<0) {
				nega += vNums[i];
			}
			
		}
		
		System.out.println("Suma positivos : " + posi + " Negativos: " + nega);
		
		
	}

	public static void ejercicio5() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		float num;
		
		float suma = 0;
		
		float media = 0;
		
		float vNums[];
		
		vNums = new float [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextFloat();
			
			vNums [i] = num;
		
		}
		
		for (int i = 0; i < vNums.length; i++) {
			
			suma += vNums[i];
			
		}
		
		media = suma / 4;
		
		System.out.println(media);
		
		
	}

	public static void ejercicio6() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("dime el numero n");
		
		int n , m;
		
		n = leer.nextInt();
		
		System.out.println("dime el numero m");
		
		m = leer.nextInt();
		
		int array[];
		
		array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i]= m;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

	public static void ejercicio7() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("dime el numero p");
		
		int p , q;
		
		p = leer.nextInt();
		
		System.out.println("dime el numero q");
		
		q = leer.nextInt();
		
		int diferencia=0;
		
		int array[];
		
		diferencia = q - p +1;
		
		array = new int[diferencia];
		
		
			
						
			for (int i = 0; i < array.length; i++) {
				
				if(array[0] == p ) {
					array[i] = p+1;
					p +=1;
				}else {
					array[i] = p;
					p +=1;
				}
				
			}
			
	
	
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
	}

	public static void ejercicio8() {
		
	
		Scanner leer = new Scanner (System.in);
	
		double aleatorios [] = new double[100];
		
		for (int i = 0; i < aleatorios.length; i++) {
			
			double num = Math.random()*1+0;
			
			aleatorios[i] = num;
			
		}
		
		System.out.println("Dime un número del 0 al 1:");
		
		double compara = leer.nextDouble();
		int cont=0;
		
		for (int i = 0; i < aleatorios.length; i++) {
			
			if(aleatorios[i]>= compara) {
				cont += 1;
			}
			
		}
		
		System.out.println(cont);
		
	
		
		
	}

	public static void ejercicio9() {
		
		int array[] = new int [100];
		
		for (int i = 0; i < array.length; i++) {
			
			int num = (int) (Math.random()*10+1);
			
			array[i] = num;	
			
		}
		
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime un número entre el 1 y el 10:");
		
		int numero = leer.nextInt();
	
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				System.out.println(i);
			}
		}
			
		
	}

	public static void ejercicio10() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime cuantas personas quieres medir:");
		
		int numPersonas = leer.nextInt();
		
		double array [] = new double [numPersonas];
		
		double altura, media, max = 0 , min, suma=0;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Dime la altura de la persona " + (i+1));
			
			altura = leer.nextDouble();
			
			array[i] = altura;			
			
		}
		
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			
			if (array[i] > max) {
				max = array[i];
			}
			
		}
		
		min = max;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]<min) {
				min = array[i];
			}
		}
		
		media = suma / numPersonas;
		
		int contMax = 0, contMin=0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > media) {
				contMax +=1;
			}else if (array[i] < media) {
				contMin += 1;
			}
		}
		
		System.out.println("La media es: " + media + ". La altura maxima es: " + max + ". La altura mínima es: " + min 
				+ ". Hay " + contMax + " pesonas por encima de la media y " + contMin + " personas por debajo de la meida");
	}

	public static void ejercicio11() {

		int array1 [] = new int [100];
		
		int array2 [] = new int [100];
		
		for (int i = 0; i < array1.length; i++) {
			
			array1[i] = i+1;
			
		}
		
		int cont = 0;
	
		for (int i = array1.length-1; i >= 0; i--) {
			
			array2[cont] = array1[i];
			cont += 1;
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.print(array1[i] + " ");
			
		}
		
		System.out.println("");
		
		for (int i = 0; i < 100; i++) {
			System.out.print(array2[i] + " ");
			
		}
	}

	public static void ejercicio12() {
		
		Scanner leer = new Scanner (System.in);
		
		int array[] = new int [10];
		
		System.out.println("Elige 3 opciones: ");
		System.out.println("a. Mostrar valores.\n"
				+ "b. Introducir valor.\n"
				+ "c. Salir.");
		
		String elegir = leer.next();
		
		int valor, posi;
		
		switch (elegir) {
		case "a":
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
			System.out.println("Elige otra vez: a - b - c");
			elegir = leer.next();
			
			break;

		case "b":
				
			System.out.println("Dime un valor y una posicion para el array (posicion del 0 al 9)");
			
			valor = leer.nextInt();
			posi = leer.nextInt();
			
			array[posi] = valor;
			
			System.out.println("Elige otra vez: a - b - c");
			elegir = leer.next();
			
			break;
		default:
			break;
		}
	
	}
	
	
	
	
	
	

}
