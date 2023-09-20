package servicios;

import entidades.Persona;

public interface PersonaServicio {
	
	public Persona crearPersona();
	
	public int calcularImc(Persona persona);
	
	public Boolean esMayorDeEdad(Persona persona);
	
	public String Saludar();

}
