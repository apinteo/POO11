package altair.es;

public class AutobusInterurbano extends Autobus {

	private int km;

	public AutobusInterurbano(int id, Conductor contuctor, double precioBase, int km) {
		super(id, contuctor, precioBase);
		this.km=km;
	}
	
	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public double CalcularPrecio() {
		
		return getKm()*getPrecioBase();
	}

}
