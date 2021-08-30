package com.curso.colecciones;

import java.awt.Color;
import java.util.*;

public class PuebasSet {
	
	
	public static void main(String[] args) {
		
		//set no duplicados
		//Set<Integer> notas = new HashSet<Integer>();  // no ordenado
		//Set<Integer> notas = new LinkedHashSet<Integer>();  // orden de insercion
		Set<Integer> notas = new TreeSet<Integer>();  // orden de numerico
		
		
		notas.add(41);
		notas.add(41);  //false
		notas.add(2);
		notas.add(46);
		
		
		for(Integer n : notas)  
			System.out.println(n);
		
		
		//set de Punto
		
		Set<Punto> figura = new HashSet<Punto>();
		
		figura.add(new Punto(1,1,Color.BLACK));
		figura.add(new Punto(2,3,Color.BLACK));
		figura.add(new Punto(11,1,Color.RED));
		figura.add(new Punto(1,1,Color.BLACK));
		
		for(Punto p : figura)  System.out.println(p);

		
		
	}

}
