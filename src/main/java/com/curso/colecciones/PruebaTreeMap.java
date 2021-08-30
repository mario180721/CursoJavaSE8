package com.curso.colecciones;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PruebaTreeMap {

	
	public static void main(String[] args) {
	
		
		Map<Alumno, String> lista = new TreeMap<Alumno, String>(new OrdenarAlumnoPorCursoAlumno());
		
		lista.put(new Alumno(6,"Rafa",1), "rafa@aaa.es");
		lista.put(new Alumno(1,"Laura",1), "laura@aaa.es");
		lista.put(new Alumno(21,"Carlos",6), "carlos@aaa.es");
		lista.put(new Alumno(2,"Carlos",1), "carlos@aaa.es");
		
		lista.put(new Alumno(6,"Rafa",1), "rafas@aaa.es");
		
		// permite recorrer la coleccion por orden de insercion
		//ver lista de emails por orden KEY (Compoarable dice que ordene por id
		
		Set<Alumno> claves  = lista.keySet();  
		// lista por COMPARATOR  curso nombre
		for(Alumno clave : claves) {
			System.out.println("email " + lista.get(clave));
		}
		
		
		System.out.println("----------------");
		
		Collection<String> listaEmails = lista.values();
		for(String email : listaEmails) {
			System.out.println("email " + email);
		}
		
		
		
		
	}
}
