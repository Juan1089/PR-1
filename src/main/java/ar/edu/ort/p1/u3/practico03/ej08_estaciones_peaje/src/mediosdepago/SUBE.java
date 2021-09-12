package ar.edu.ort.p1.u3.practico03.ej08_estaciones_peaje.src.mediosdepago;

public class SUBE extends MedioDePagoElectronico {

	private static final double DCTO = 0.10;

	public SUBE(int cantDiasDemoraPago) {
		super(cantDiasDemoraPago);
	}

	@Override
	public double getDescuento() {
		return DCTO;
	}
}
