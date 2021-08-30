package com.curso.colecciones;

import java.util.*;

public class PruebasLinkedHashMap {
	
	public static void main(String[] args) {
		
		// key alumnno value  email 
		Map<Alumno, String> lista = new LinkedHashMap<Alumno, String>();
		
		lista.put(new Alumno(6,"Rafa",1), "rafa@aaa.es");
		lista.put(new Alumno(1,"Laura",1), "laura@aaa.es");
		lista.put(new Alumno(21,"Carlos",1), "carlos@aaa.es");
		
		lista.put(new Alumno(6,"Rafa",1), "rafas@aaa.es");
		
		// permite recorrer la coleccion por orden de insercion
		//ver lista de emails por orden de insercion
		
		Set<Alumno> claves  = lista.keySet();
		for(Alumno clave : claves) {
			System.out.println("email " + lista.get(clave));
		}
		
		
		
		
		
		
	}

}
