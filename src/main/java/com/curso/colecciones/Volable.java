package com.curso.colecciones;

public interface Volable<T> {
	public void volar(T medida);
}

class Avion implements Volable<Double>{
	@Override
	public void volar(Double medida) {
		// TODO Auto-generated method stub	
	}
}

interface Comparator<T>{
	public int compare(T o1, T o2);
}