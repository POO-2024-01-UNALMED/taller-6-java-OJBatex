package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
	private static int camiones;
	
	public Camion() {
		
		camiones += 1;
	}
	
	public Camion(String placa, String nombre, int precio, int peso,
				Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		
		camiones += 1;
		
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	

	public static int getCamiones() {
		return camiones;
	}
	

	public static void setCamiones(int camiones) {
		Camion.camiones = camiones;
	}
	
	

}
