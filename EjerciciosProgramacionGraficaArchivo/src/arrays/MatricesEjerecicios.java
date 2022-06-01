package arrays;

public class MatricesEjerecicios {

	public static void ejercicio1() {
		
		int matriz [][] = new int [5][5];
		
		int num = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				num += 1;
				matriz[i][j] = num;
				System.out.println(matriz[i][j]);
			}
		}
		
	}
	
	public static void ejercicio2() {
		
		int matriz[][] = new int[10][10];
		
		int mult;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
				mult = (i+1) * (j+1);
				matriz[i][j] = mult;
				System.out.println((i+1) + " * " + (j+1) + " = " + matriz[i][j]);
			}
		}
		
	}
	
	public static void ejercicio3() {
		
		
		
	}

	public static void ejercicio4() {
		// TODO Auto-generated method stub
		
	}

	public static void ejercicio5() {
		// TODO Auto-generated method stub
		
	}
	
	

}
