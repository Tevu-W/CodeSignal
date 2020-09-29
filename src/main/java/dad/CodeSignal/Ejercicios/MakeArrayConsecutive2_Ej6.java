package dad.CodeSignal.Ejercicios;

import java.util.Arrays;

public class MakeArrayConsecutive2_Ej6 {

	public static int makeArrayConsecutive2(int[] statues) {
		int cont = 0;
		return cont;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		int [] array = { 6, 2, 3, 8 }; //Falta 4, 5 y 7
		
		Arrays.sort(array);
		
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
				
		System.out.println("Contador: " +cont);
	}

}
