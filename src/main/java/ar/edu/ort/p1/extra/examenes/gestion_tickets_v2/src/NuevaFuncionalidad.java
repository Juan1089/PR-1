package ar.edu.ort.p1.extra.examenes.gestion_tickets_v2.src;

public class NuevaFuncionalidad extends Ticket {
	private String descripcionFuncional;
	private int tiempoEstimado;
	private Prioridad prioridad;

	public NuevaFuncionalidad(String cliente, String unidadDeNegocio, String fechaDeCarga, String titulo,
			Empleado empleadoQueLoReporto, String descripcionFuncional, int tiempoEstimado, Prioridad prioridad) {
		super(cliente, unidadDeNegocio, fechaDeCarga, titulo, empleadoQueLoReporto);
		this.descripcionFuncional = descripcionFuncional;
		this.tiempoEstimado = tiempoEstimado;
		this.prioridad = prioridad;
	}

	@Override
	public int obtenerTiempoDeResolucion() {
		return this.tiempoEstimado;
	}

}
