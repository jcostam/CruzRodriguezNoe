package Tema4;

class NodoPila {
	public static NodoPila createNodoPila(double dato, NodoPila abajo) {
		return new NodoPila(dato, abajo);
	}
	private NodoPila(double dato	, NodoPila	abajo) {
		this.dato =	dato;
		this.abajo = abajo;
	}
	public NodoPila	abajo;
	public double dato;
}