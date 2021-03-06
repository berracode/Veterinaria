package veterinaria.herencia.clases_no_abstractas;

public class Ave extends Animal {
	
	private boolean puedeVolar;
	private boolean depredador;
	
	
	public Ave(boolean puedeVolar, boolean depredador) {
		
		this.puedeVolar = puedeVolar;
		this.depredador = depredador;
	}


	public boolean isPuedeVolar() {
		return puedeVolar;
	}


	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}


	public boolean isDepredador() {
		return depredador;
	}


	public void setDepredador(boolean depredador) {
		this.depredador = depredador;
	}

	
	public void desplazarse() {
		System.out.println("volando");
	}

	@Override
	public String toString() {
		return "Ave [puedeVolar=" + puedeVolar + ", depredador=" + depredador + "]";
	}
	
	
	
	
	

}
