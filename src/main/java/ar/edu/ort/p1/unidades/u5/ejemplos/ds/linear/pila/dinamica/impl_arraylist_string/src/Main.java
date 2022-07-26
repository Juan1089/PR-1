package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.dinamica.impl_arraylist_string.src;

public class Main {
	
	static PilaStringArraylist pila = new PilaStringArraylist();

	public static void main(String[] args) {

		isVacia();
		pila.push("Lunes");
		pila.push("Martes");
		pila.push("Sabado");
		pila.push("Domingo");

		isVacia();
		System.out.println(pila);
		System.out.println("Stack Size:" + pila.count());
		System.out.println("Peek Top Element:" + pila.peek());
		System.out.println("After peek:" + pila);
		System.out.println("Pop Top Element:" + pila.pop());
		System.out.println("After pop:" + pila);
		System.out.println("Stack Size now:" + pila.count());

	}

	private static void isVacia() {
		System.out.println("La pila esta vacia? " + pila.isEmpty());
	}
}
