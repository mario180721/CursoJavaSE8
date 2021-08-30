package com.curso.colecciones;

import java.util.PriorityQueue;
import java.util.Queue;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class PruebaQueue {
	
	public static void main(String[] args) {
		
		
		Queue<Integer> cola1  = new LinkedList<Integer>();
			
		cola1.add(7);
		cola1.add(1);
		cola1.add(34);
		cola1.add(3);
		
		for(Integer i : cola1) System.out.println(i);
		
		//System.out.println("ver elemento cola " + cola1.peek()); // entrega el elemeno pero no lo borra
		System.out.println("ver elemento cola " + cola1.poll());
		
		for(Integer i : cola1) System.out.println(i);

		Queue<Tarea>  cola = new PriorityQueue<Tarea>(new CompararPorFechaVto());
		
		
		// 1 a 12
		LocalDate fechaT1 = LocalDate.of(2021, 5, 20);
		LocalDate fechaT2 = LocalDate.of(2021, 3, 20);
		LocalDate fechaT3 = LocalDate.of(2021, 3, 25);
		LocalDate fechaT4 = fechaT3.minusDays(80);
		
		cola.add(new Tarea(1, fechaT1));
		cola.add(new Tarea(2, fechaT2));
		cola.add(new Tarea(3, fechaT3));
		cola.add(new Tarea(4, fechaT4));
		
		System.out.println(".... recorrer");
		for(Tarea t : cola) {
			System.out.println(t);
		}
		
		System.out.println("peek " + cola.peek());
		System.out.println("peek " + cola.peek());
		System.out.println(".... recorrer");
		for(Tarea t : cola) {
			System.out.println(t);
		}
		
		System.out.println("poll " + cola.poll());
		System.out.println(".... recorrer");
		for(Tarea t : cola) {
			System.out.println(t);
		}
		
		System.out.println("poll " + cola.poll());
		
		System.out.println("poll " + cola.poll());
	}

}

/*
 * Nota . Si no programamos un comparable o 
 * comparetor  lanza la siguiente excepcion
 * java.lang.ClassCastException: com.curso.colecciones.Tarea cannot be cast to java.lang.Comparable
	at java.util.Priori
	*/
