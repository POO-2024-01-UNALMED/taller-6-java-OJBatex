package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int vehiculos = 0;
	
	public Fabricante() {}
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		Fabricante fabricanteGanador = null;
		ArrayList<Fabricante> lista = new ArrayList<Fabricante>();
		
		for (int i = 0; i<Vehiculo.getCantidadVehiculos(); i++) {
			lista.add(Vehiculo.vehiculos.get(i).getFabricante());
		}
		
		fabricanteGanador = lista.get(0);
		
		for (int fabricante = 1; fabricante < lista.size(); fabricante++) {
			if(lista.get(fabricante).getVehiculos() > fabricanteGanador.getVehiculos()) {
				fabricanteGanador = lista.get(fabricante);
			}
		}
		
		return fabricanteGanador;
	}
	
	
	public void agregarVehiculo() {
		vehiculos += 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public Pais getPais() {
		return pais;
	}
	

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

	public int getVehiculos() {
		return vehiculos;
	}
	

	public void setVehiculos(int vehiculos) {
		this.vehiculos = vehiculos;
	}
	

}
