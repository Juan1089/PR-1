package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Puerto {

	private ArrayList<Amarra> amarras;

	public Puerto() {
		this.amarras = new ArrayList<Amarra>();
		inicializarPuerto();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo barcosConAlquilerMayorA de la clase Puerto que reciba
	 * como parametro un importe y devuelva la cantidad de barcos que abonan un
	 * importe mayor al indicado en concepto de alquiler de su amarra.
	 */
	public int barcosConAlquilerMayorA(double monto) {

		int cont = 0;

		for (Amarra a : this.amarras) {
			if (a.getMontoAlquiler() > monto) {
				cont++;
			}
		}
		return cont;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo barcoConMayorConsumo de la clase Puerto que debe
	 * devolver el barco deportivo (de lujo o no) de mayor consumo en todo el
	 * puerto.
	 */

	public Deportivo barcoConMayorConsumo() {

		double mayorConsumo = 0;
		Deportivo deportivoMayorConsumo = null;

		for (Amarra a : this.amarras) {
			Embarcacion emb = a.getEmbarcacion();
			if (!a.estaDisponible() && emb instanceof Deportivo) {
				Deportivo dep = (Deportivo) emb;
				if (dep.calcularConsumo() > mayorConsumo) {
					mayorConsumo = dep.calcularConsumo();
					deportivoMayorConsumo = dep;
				}
			}
		}
		return deportivoMayorConsumo;
	}

	@Override
	public String toString() {
		return "Puerto [amarras=" + amarras + "]";
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public String mostrar() {
		Gson gson = new Gson();
		return "Puerto: " + gson.toJson(this, Puerto.class);
	}

	private void inicializarPuerto() {

		// Agrego amarras
		this.amarras.add(new Amarra(101, Ubicacion.NORTE, new Velero("ARG-5999", 7.8, 2014, "Alejandro", 2, 500, 130)));
		this.amarras.add(new Amarra(102, Ubicacion.NORTE));
		this.amarras.add(new Amarra(103, Ubicacion.NORTE,
				new DeportivoLujo("ARG-6322", 12.5, 2012, "Marcela", 500, 165, 8000, 6)));
		this.amarras.add(new Amarra(104, Ubicacion.NORTE,
				new DeportivoLujo("ARG-1050", 10.0, 2005, "Hernan", 500, 165, 6500, 5)));
		this.amarras.add(new Amarra(105, Ubicacion.NORTE));
		this.amarras.add(new Amarra(106, Ubicacion.NORTE));
		this.amarras.add(new Amarra(107, Ubicacion.NORTE));

		this.amarras.add(new Amarra(201, Ubicacion.ESTE));
		this.amarras.add(new Amarra(202, Ubicacion.ESTE));

	}

}
