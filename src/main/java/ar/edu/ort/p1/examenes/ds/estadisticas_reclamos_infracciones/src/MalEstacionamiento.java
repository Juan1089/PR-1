package ar.edu.ort.p1.examenes.ds.estadisticas_reclamos_infracciones.src;

import ar.edu.ort.p1.util.Fecha;

public class MalEstacionamiento extends Infraccion {

	private final static int CANT_UNIDADES = 7;
	private final static int DIAS_CADUCIDAD = 365;

	public MalEstacionamiento(double valorUnidad, Fecha fecha) {
		super(valorUnidad, fecha);
	}

	/**
	 * Ejercicio C: El metodo caducada() de las clases que considere necesario, que
	 * debe indicar si la infraccion esta caducada o no.
	 */
	@Override
	public boolean caducada() {
		System.out.println("Infraccion con fecha: " + super.getFecha() + " (Dias transcurridos: "
				+ super.getFecha().getCantidadDiasHastaHoy() + ")");
		return verFecha().getCantidadDiasHastaHoy() > MalEstacionamiento.DIAS_CADUCIDAD;
	}

	@Override
	public double valorInfraccion() {
		return MalEstacionamiento.CANT_UNIDADES * getValorUnidad();
	}

	@Override
	public String toString() {
		return "Tipo MalEstacionamiento\t" + super.toString();
	}

}
