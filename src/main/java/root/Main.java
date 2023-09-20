package root;

import java.util.ArrayList;
import java.util.List;

import entidades.Persona;
import servicios.PersonaServicio;
import servicios.PersonaServicioImpl;

public class Main {

	public static void main(String[] args) {

		PersonaServicio personaServicio = new PersonaServicioImpl();

		List<Persona> lista = new ArrayList<>();

		Persona persona1 = new Persona("Nico", "Ramos", 31, "H", 70, 1.70);
		lista.add(persona1);

		Persona persona2 = new Persona("Eugenia", "Cabrera", 15, "M", 60, 1.60);
		lista.add(persona2);

		Persona persona3 = new Persona("Cristian", "Copado", 20, "H", 140, 1.80);
		lista.add(persona3);

		Persona persona4 = new Persona("Natalia", "Candeloro", 12, "M", 50, 1.80);
		lista.add(persona4);

		for (Persona persona : lista) {
			int resultado = personaServicio.calcularImc(persona);

			if (resultado == 1) {
				System.out.println(persona.getNombre() + " Esta en sobrepeso");
			}

			if (resultado == 0) {
				System.out.println(persona.getNombre() + " Esta en su peso ideal");
			}

			if (resultado < 0) {
				System.out.println(persona.getNombre() + " Esta en bajopeso");
			}

		}
		
		System.out.println("");
		
		for (Persona persona : lista) {
			
			if(personaServicio.esMayorDeEdad(persona)) {
				System.out.println("Podes pasar amigo");
			}
			else {
				System.out.println("Te queda afuera pibe");
			}
		}

	}
}

//2) Realizar una clase llamada Persona que tenga los siguientes atributos:
//nombre,edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir
//algún otro atributo, puede hacerlo. Los métodos que se implementarán son:
//• Un constructor por defecto.
//• Un constructor con todos los atributos como parámetro.
//• Métodos getters y setters de cada atributo.
//Servicio:

//• Método crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
//Si no es correcto se deberá mostrar un mensaje

//• Método calcularIMC(): calculará si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
//función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
//(incluidos), significa que el peso está por debajo de su peso ideal y la función devuelve
//un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la
//persona tiene sobrepeso, y la función devuelve un 1. Se recomienda hacer uso de
//constantes para devolver estos valores.

//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.

//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos
//todos los métodos para cada objeto, deberá comprobar si la persona está en su peso
//ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si
//la persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
//en distintas variables, para después en el main, calcular un porcentaje de esas 4
//personas cuántas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
//encima, y también calcularemos un porcentaje de cuántos son mayores de edad y
//cuantos menores