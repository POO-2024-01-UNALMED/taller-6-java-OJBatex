package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	
	public Pais() {}
	
	public Pais(String nombre) {
		this.setNombre(nombre);
		
	}
	
	public static Pais paisMasVendedor() {
		
		ArrayList<Pais> lista = new ArrayList<Pais>();
		Pais paisGanador = null;
		
		int comparador = 0;
		int contadorPais = 0;
		
		for (int i = 0; i<Vehiculo.getCantidadVehiculos(); i++) {
			lista.add(Vehiculo.vehiculos.get(i).getFabricante().getPais());
		}
		
		for (int pais_a_comparar = 0; pais_a_comparar < lista.size(); pais_a_comparar++) {
			
			contadorPais = 0;
			
			for (int paisComparado = 0; paisComparado < lista.size(); paisComparado++) {
				
				if (lista.get(pais_a_comparar) == lista.get(paisComparado)) {
					
					contadorPais += 1;
				}
				
			} if (contadorPais > comparador) {
				
				paisGanador = lista.get(pais_a_comparar);
				comparador = contadorPais;
			}
			
		}
		
		return paisGanador;
		
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

}
