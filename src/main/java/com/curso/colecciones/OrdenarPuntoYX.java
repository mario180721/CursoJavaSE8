package com.curso.colecciones;

import java.util.Comparator;

public class OrdenarPuntoYX implements Comparator<Punto> {

	@Override
	public int compare(Punto o1, Punto o2) {
		
	if(o1.getX() == o2.getX() && o1.getY() == o2.getY() ) return 0;
		
		int res = o1.getY() - o2.getY();
		if( res == 0 ) {
			return o1.getX() - o2.getX();
		}
		return res;
		
	}

}
