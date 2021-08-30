package com.curso.colecciones;

import java.util.Comparator;

public class CompararPorFechaVto 
               implements Comparator<Tarea>{

	@Override
	public int compare(Tarea t1, Tarea t2) {
		
		if (t1.getFechaVencimiento()
				.equals(t2.getFechaVencimiento())) {
			return 0;
		}
		
		if (t1.getFechaVencimiento()
				.isBefore(t2.getFechaVencimiento())) {
			return -1;
			
		}else {
			return 1;
		}
	}

}
