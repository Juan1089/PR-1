package ar.edu.ort.p1.extra.examenes.gestion_tickets_v2.src;

public class Bug extends Error {

	private TipoBug tipoBug;
	private int tiempoEstimado;

	public Bug(String cliente, String unidadDeNegocio, String fechaDeCarga, String titulo,
			Empleado empleadoQueLoReporto, String descripcion, String personaQueLoDetecto, TipoBug tipoBug,
			int tiempoEstimado) {
		super(cliente, unidadDeNegocio, fechaDeCarga, titulo, empleadoQueLoReporto, descripcion, personaQueLoDetecto);
		this.tipoBug = tipoBug;
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public int obtenerTiempoDeResolucion() {
		return this.tiempoEstimado;
	}

}
