package altair.es;

public abstract class Autobus {
	
	private int id;
	private Conductor conductor;
	private double precioBase;
	
	public Autobus(int id, Conductor contuctor, double precioBase) {
		super();
		this.id = id;
		this.conductor = contuctor;
		this.precioBase = precioBase;
	}
	
	
	public Autobus() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	

	public abstract double CalcularPrecio();
	
	

}
