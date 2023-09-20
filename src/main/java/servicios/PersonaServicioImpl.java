package servicios;

import java.util.Scanner;

import entidades.Persona;

public class PersonaServicioImpl implements PersonaServicio {

	Scanner sc;
	final int PESO_IDEAL = 0;
	final int SOBREPESO = 1;
	final int BAJO_PESO = -1;

	public PersonaServicioImpl() {
		this.sc = new Scanner(System.in);
	}

	@Override
	public Persona crearPersona() {
		Persona persona = new Persona();
		System.out.println("Favor de ingresar su nombre: ");
		persona.setNombre(sc.nextLine());

		System.out.println("Favor de ingresar su apellido");
		persona.setApellido(sc.nextLine());

		System.out.println("Favor de ingresar su edad");
		persona.setEdad(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Favor de ingresar su sexo:");
		String sexo = sc.nextLine().toUpperCase();

		if (sexo.equals("M") || sexo.equals("H") || sexo.equals("O")) {
			persona.setSexo(sexo);
		} else {
			System.out.println("El sexo ingresado es incorrecto.");
		}

		System.out.println("Favor de ingresar su peso en Kg: ");
		persona.setPeso(sc.nextDouble());

		System.out.println("Favor de ingresar su altura en Metros: ");
		persona.setAltura(sc.nextDouble());

		return persona;
	}

	@Override
	public int calcularImc(Persona persona) {
		// kg/(altura^2)
		double imc = (persona.getPeso() / (Math.pow(persona.getAltura(), 2)));

		if (imc < 20) {
			return BAJO_PESO;
		}
		if (imc >= 20 && imc <= 25) {
			return PESO_IDEAL;
		}
		return SOBREPESO;
	}

	@Override
	public Boolean esMayorDeEdad(Persona persona) {
		
		 return (persona.getEdad() >= 18) ? true : false;
	}

	@Override
	public String Saludar() {
		
		return "Hola desde proyecto Demo";
	}

}
