package examen;

import java.util.Scanner;

public class complemento {

	final static String comple_1 = "Complemento 1000€ ";

	final static String comple_2 = "Complemento 500€";

	final static String comple_3 = "Complemento 300€";

	final static String comple_4 = "Complemento 100 €";

	public static String comple(String cadena) {

		String totalComple = null;
		Scanner sc = new Scanner(cadena);

		int COD;
		String[] nombre;
		String nombreA;
		int antiguedad;
		String plus;

		sc.useDelimiter(";");
		
		
		
		

		// TODO: CODIGO

		while (sc.hasNext() == true) {

			COD = sc.nextInt();
			if (COD <= 0 || COD >= 1000) {

				throw new RuntimeException();
			}
			
			
			
			
			

			// TODO: NOMBRE Y APELLIDOS

			nombreA = sc.next();
			nombre = new String[nombreA.length()];
			for (int i = 0; i < nombre.length; i++) {
				nombre[i] = nombreA;
			}

			if (nombre.length <= 19 || nombre.length >= 21) {
				System.out.println("Nombre debe tener 20 caracteres");

			}
			
			
			
			
			

			// TODO:ANTIGUEDAD

			antiguedad = sc.nextInt();
			if (antiguedad <= 0 && antiguedad > 100) {

				throw new RuntimeException();
			}

			plus = sc.next();

			if (plus.equalsIgnoreCase("SI") || (plus.equalsIgnoreCase("NO"))) {

				if (antiguedad < 5 && plus.equalsIgnoreCase("NO"))
					totalComple = comple_1;
				else if (antiguedad >= 5 && plus.equalsIgnoreCase("NO"))
					totalComple = comple_2;
				else if (antiguedad < 5 && plus.equalsIgnoreCase("SI"))
					totalComple = comple_3;
				else
					totalComple = comple_4;

			}

			else

				throw new RuntimeException();

		}

		sc.close();

		return totalComple;
	}

}
