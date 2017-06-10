package maximoComunDiv;

import java.util.Scanner;

public class MaxComDiv {

	public static int maxCom(int num1 ,int num2){
		
		//try{
		
		
		if (num1<=0 || num2<=0){
			
			return -1;
			
		}
		
		
		int resto = 0;
		int max = Math.max(num1, num2);
	    int min = Math.min(num1, num2);
		
		do {
			
			resto = min;
			min= max%min;
	        max = resto;
		} while (min!=0);
		
		
		return resto;
		
		
		//}catch (Exception e) {
			
			//return -1;
		//}
		
	}

		
		
		
	

	public static void main(String[] args) {
		

	

        System.out.println( maxCom(27,12));        
    }

	 
   		
		
	
}
