package com.curso.entradassalidas;

import java.util.Properties;

public class PropiedadesSistema {

	public static void main(String[] args) {
		
		 //java PropiedadesSistema uno dos 3
		  for(String arg: args)
			  System.out.println(arg);

		  //java -DMiPropiedad=44  PropiedadesSistema uno dos 3
		  
	      Properties props = System.getProperties();
	      props.list(System.out);
	      
	      int dato = Integer.getInteger("MiPropiedad");
	      
	}

}
