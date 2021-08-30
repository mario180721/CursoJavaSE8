
package com.curso.colecciones;

import java.util.*;


public class PruebaSetAlumnos {
    
    public static void main(String[] args) {
        	
    	
    	//1. Set  - 3 tipos
    	//  colleccion de objetos Alumno
    	// recorrer para mostrar datos del alumno
    	
    	
    	//  1. recorrer cualquier orden
    	//  2. recorrer en orden de insercion
    	//  3. recorrer en orde de id
    	//  4. recorrer en orden de curso, nombre Alumno
 
        
        Set<Alumno> lista =  new TreeSet(new  OrdenarAlumnoPorCursoAlumno());//new HashSet();
        
        Alumno a = new Alumno(3,"Pedro", 1);
        Alumno b = new Alumno(2,"Laura", 1);
        Alumno c = new Alumno(6,"Mario", 1);
        
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(new Alumno(6,"Maria", 1));
        
        
        for(Alumno a2: lista)
            System.out.println(a2);
        
        
        
        
            
    }
    
}
