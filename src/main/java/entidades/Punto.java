package entidades;

public class Punto {
	
	private double coordenadaX;
	private double coordenadaY;
	
	public Punto() {
		
	}

	public Punto(double coordenadaX, double coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public double getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(double coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public double getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(double coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	@Override
	public String toString() {
		return "Punto [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + "]";
	}
	
	

}
