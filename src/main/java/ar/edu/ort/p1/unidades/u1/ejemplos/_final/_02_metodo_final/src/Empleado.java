package ar.edu.ort.p1.unidades.u1.ejemplos._final._02_metodo_final.src;

import ar.edu.ort.p1.util.pojo.Persona;

public class Empleado extends Persona {
	
	protected int sueldo;

	public Empleado(String nombre, int edad, int sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	public void imprimirSueldo() {
		System.out.println("El sueldo es: " + sueldo);
	}

	/**
	 * No podemos reescribir el metodo 'esMayor' para la clase Empleado indicando
	 * que 6 anios es mayor de edad
	 */
	
	/*
	public final boolean esMayor() {
		if (edad >= 6)
			return true;
		else
			return false;
	}
	*/

}