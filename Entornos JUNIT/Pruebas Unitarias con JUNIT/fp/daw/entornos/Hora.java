package fp.daw.entornos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hora {

	
	
	public static boolean validar(String  hora, String minutos){
		return true;
		
	}
	
	
	public static boolean validar(String  hora){
		
		Scanner s =new Scanner(hora);
		s.useDelimiter(":");
		
		int hh=s.nextInt();
		int mm=s.nextInt();	
		
		return hh>=0 && hh<24 && mm>=0 && mm <60;
		
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {
				
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Introduce la hora: " );
		System.out.println(validar(br.readLine()));

	}

}
