package root;

import entidades.Punto;
import servicios.PuntoServicio;

public class Main {

	public static void main(String[] args) {
		
		PuntoServicio puntoServicio = new PuntoServicio();
		
		System.out.println("Pedimos los datos del punto 1");
		Punto p1 = puntoServicio.obtenerDatos();
		
		System.out.println("Pedimos los datos del punto 2");
		Punto p2 = puntoServicio.obtenerDatos();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println("");
		puntoServicio.sumarPuntos(p1, p2);
		
		System.out.println("");
		puntoServicio.calcularDistancia(p1, p2);
		
		System.out.println("");
		puntoServicio.obtenerRecta(p1, p2);
		

	}

}

//Escribir un programa que tome por consola dos puntos del plano cartesiano,
//nos calcule la suma de esos dos puntos,
//la distancia entre esos dos puntos 
//y la ecuacion de la recta que pasa por esos dos puntos.