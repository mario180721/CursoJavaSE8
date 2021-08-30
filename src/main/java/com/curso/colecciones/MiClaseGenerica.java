package com.curso.colecciones;

public class MiClaseGenerica<I,T> {
	
	private I id;
	private T valor;
	
	
	//const
	public MiClaseGenerica(I id, T valor) {
		super();
		this.id = id;
		this.valor = valor;
	}
	
	//getters y setter
	
	public I getId() {
		return id;
	}
	
	public T getValor() {
		return valor;
	}
	
	
	public static void main(String[] args) {
		
		MiClaseGenerica<Integer, Alumno> mio = new MiClaseGenerica<Integer, 
				                              Alumno>(2, new Alumno("lll", 1));
		
		Integer i = mio.getId();
		
		
		MiClaseGenerica<Integer, Integer> mio2 = new MiClaseGenerica<Integer,Integer>(2, 2);
		
		
	}
	
}
