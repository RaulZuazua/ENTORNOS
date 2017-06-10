package busquedaVector;

public class BusquedaVector {
	
	static int contador=0;
	
	public static  int busquedaVector (int numero, int [] vector) {
				
		for (int i = 0; i < vector.length; i++) {
			
			if(vector[i]==numero)
				return i;
		}
		
		return -1;
	}
				

}
