package com.curso.colecciones;

import java.util.ArrayList;
import java.util.List;

public class PruebaGenericos {

	public static void main(String[] args) {
		

		List lista = new ArrayList(); //coleccion de Objects
		
		lista.add(new Integer(2));
		lista.add(new Alumno(2,"llll",2));
		lista.add("hola");
		
		for(Object o: lista) {
			if( o instanceof Alumno) {
				((Alumno)o).getNombre();
			}
		}
		
		List<Alumno> listaAl = new ArrayList<Alumno>();
		
		//listaAl.add("hola");
		 for(Alumno a: listaAl) {
			 a.getNombre();
		 }


	}

}
