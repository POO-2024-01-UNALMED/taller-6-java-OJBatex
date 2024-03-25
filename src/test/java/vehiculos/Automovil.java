package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private static int automoviles;
	
	public Automovil() {
		
		automoviles += 1;
	}
	
	public Automovil(String placa, String nombre, int precio,
					int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		
		automoviles += 1;
	}
	

 	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	

	public static int getAutomoviles() {
		return automoviles;
	}
	

	public static void setAutomoviles(int automoviles) {
		Automovil.automoviles = automoviles;
	}

}
