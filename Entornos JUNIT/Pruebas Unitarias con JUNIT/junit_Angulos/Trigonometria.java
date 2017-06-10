package junit_Angulos;

import java.util.Scanner;

public class Trigonometria {

	
	public static String ClasificarAngulo (int x, int y){
		
		
		
		if(y >= 0 && x > 0){
			return "Agudo";
		}
		
		else if(y >= 0 && x < 0){
			return "Obtuso";
		}
		
		if(y > 0 && x == 0){
			return "Recto";
		}
		
		else
			throw new RuntimeException();
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
