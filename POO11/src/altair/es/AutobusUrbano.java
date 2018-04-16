package altair.es;

public class AutobusUrbano extends Autobus {

	private String ruta;
	
	
	public AutobusUrbano(int id, Conductor contuctor, double precioBase, String ruta) {
		super(id, contuctor, precioBase);
		this.ruta=ruta;
	}
	

	public String getRuta() {
		return ruta;
	}


	public void setRuta(String ruta) {
		this.ruta = ruta;
	}


	@Override
	public double CalcularPrecio() {
		
		
		if(getRuta().equalsIgnoreCase("A"))
			return getPrecioBase()*1.1;
		else
			return getPrecioBase()*1.2;
		
	}

}
