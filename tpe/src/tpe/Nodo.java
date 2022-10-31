package tpe;

import java.util.Iterator;

public class Nodo implements Comparable, Iterator{
	
	private Nodo iterador;
	private Comparable<Object> valor;
	private Nodo siguiente;
	

	public Nodo(Comparable valor){
		this.valor = valor;
		this.siguiente = null;
	}

	public void setSiguiente(Nodo nodo){
		this.siguiente = nodo;
	}
	
	public Nodo getSiguiente(){
		return this.siguiente;
	}

	public Object getValor(){
		return valor;
	}
 
	@Override
	public int compareTo(Object o) {
		Nodo otro = (Nodo) o;
		return this.valor.compareTo(otro.getValor());
	}


	@Override
	public boolean hasNext() {
		System.out.println();
		return this.iterador != null;
	}

	@Override
	public Object next() {
		Nodo toReturn = this.iterador;
		this.iterador = this.iterador.getSiguiente();
		return toReturn;
	}

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + "]";
	}
	
	public void setIterador(Nodo oto) {
		this.iterador = oto;
	}
		
}