package servicios;

import java.util.Scanner;

import entidades.Punto;

public class PuntoServicio {

	private Scanner sc;

	public PuntoServicio() {
		this.sc = new Scanner(System.in);
	}

	public Punto obtenerDatos() {

		Punto p1 = new Punto();
		System.out.println("Favor de ingresar la coordenada x del punto");

		p1.setCoordenadaX(sc.nextDouble());

		System.out.println("Favor de ingresar la coordenada y del punto");

		p1.setCoordenadaY(sc.nextDouble());

		return p1;

	}

	public void sumarPuntos(Punto p1, Punto p2) {
		Double sumaX = (p1.getCoordenadaX() + p2.getCoordenadaX());
		Double sumaY = (p1.getCoordenadaY() + p2.getCoordenadaY());

		System.out.println("La suma de los puntos es: (" + sumaX + ";" + sumaY + ")");
	}

	public void calcularDistancia(Punto p1, Punto p2) {
		
		//Cateto1 = x1 - x2
		//Cateto1 = y1 - y2
		Double cateto1 = (p2.getCoordenadaX() - p1.getCoordenadaX());
		Double cateto2 = (p2.getCoordenadaY() - p1.getCoordenadaY());

		//Distancia = raizCuadrada(Cateto1^2 + Cateto2^2)
		System.out.println(
				"La distancia entre los dos puntos es: " + Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));

	}

	public void obtenerRecta(Punto p1, Punto p2) {
		
		//validacion para que no se divida por 0
		if ((p1.getCoordenadaX() - p2.getCoordenadaX()) == 0) {
			System.out.println("NO es una funcion de recta");
		} else {
			
			// pendiente = (y1-y2)/(x1 - x2)
			Double pendiente = (p1.getCoordenadaY() - p2.getCoordenadaY())
					/ (p1.getCoordenadaX() - p2.getCoordenadaX());
			
			// Ordenada al origen = -(pendiente * x1) + y1 
			Double ordAlOrigen = pendiente * (-p1.getCoordenadaX()) + p1.getCoordenadaY();
			
			System.out.println("La ecuacion de la recta es: Y = " + pendiente + ".X + " + ordAlOrigen);
		}

	}

}
