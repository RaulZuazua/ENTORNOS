package pensionesColegio;

public class PensionesColegio {

	public static String pension(String dia) {

		int dianun = 0;
		
		try{
			
		dianun = Integer.valueOf(dia);
		
		}catch (Exception e) {
			
			return "error";
		}
		

		if (dianun >= 1 && dianun<=10) {

			return "No tiene recargo";
		}

		if (dianun >= 11 && dianun<=20) {

			return "Recargo del 2%";
		}
		
		
		if (dianun >= 21 && dianun<=30) {

			return "Recargo del 4%";
		}
		
		else 
			return "error";
		


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pension("hola"));

	}

}
