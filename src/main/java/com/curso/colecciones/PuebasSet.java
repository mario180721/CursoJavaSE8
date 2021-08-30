package com.curso.colecciones;

import java.awt.Color;
import java.util.*;

public class PuebasSet {
	
	
	public static void main(String[] args) {
		
		//set NO DUPLICADOS - NO INDEXADO
		//Set<Integer> notas = new HashSet<Integer>();  // no ordenado
		//Set<Integer> notas = new LinkedHashSet<Integer>();  // orden de insercion
		Set<Integer> notas = new TreeSet<Integer>();  // orden de numerico
		
		//Integer es la clase Wrapper de int
		
		
		notas.add(41);
		notas.add(41);  //false
		notas.add(2);
		notas.add(46);
		
		
		for(Integer n : notas)  
			System.out.println(n);
		
		
		//set de Punto
		
		Set<Punto> figura =  new TreeSet<Punto>();
				 //new LinkedHashSet<Punto>();
				//new HashSet<Punto>();
		
		figura.add(new Punto(1,1,Color.BLACK));
		figura.add(new Punto(0,0,Color.BLACK));
		figura.add(new Punto(0,3,Color.BLACK));
		figura.add(new Punto(11,1,Color.RED));
		figura.add(new Punto(1,1,Color.BLACK));
		
		for(Punto p : figura)  System.out.println(p);

		System.out.println("........ TREESET CON COMMPARATOR ......");

		Set<Punto> figura2 =  new TreeSet<Punto>(new OrdenarPuntoYX());
				 //new LinkedHashSet<Punto>();
				//new HashSet<Punto>();
		
		figura2.add(new Punto(3,8,Color.BLACK));
		figura2.add(new Punto(0,0,Color.BLACK));
		figura2.add(new Punto(1,8,Color.BLACK));
		figura2.add(new Punto(11,1,Color.RED));
		figura2.add(new Punto(1,1,Color.BLACK));
		
		for(Punto p : figura2)  System.out.println(p);

		
		
		
		
	}

}
