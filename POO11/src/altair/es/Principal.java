package altair.es;

import java.util.Scanner;

public class Principal {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conductor c= new Conductor("Antonio", 900);
		Autobus[] tAutobuses= {new AutobusUrbano(1, c, 0.4, "B"),new AutobusInterurbano(2, c, 0.05, 1000)};
		
		for (Autobus autobus : tAutobuses) {
			System.out.println("Precio del billete: " + autobus.CalcularPrecio() 
								+ "€ Id: " + autobus.getId() + " Conductor: " +autobus.getConductor().getNombre());
		}
		
		sc.close();
	}

}
