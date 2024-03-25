package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	
	public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	private static int cantidadVehiculos;
	
	public Vehiculo() {
		vehiculos.add(this);
	}
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre,
					int precio, int peso, String traccion, Fabricante fabricante) {
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		this.fabricante.agregarVehiculo();
		
		cantidadVehiculos += 1;
		
		vehiculos.add(this);
	}
	
	public String vehiculosPorTipo() {
		
		return "Automoviles: " + Automovil.getAutomoviles() +"" +
				"\nCamionetas: " + Camioneta.getCamionetas() +"" +
				"\nCamiones: " + Camion.getCamiones() +"";
		
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidad) {
		velocidadMaxima = velocidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	

	public static ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	

	public static void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		Vehiculo.vehiculos = vehiculos;
	}
	

}
