package com.curso.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class PruebaHashMap {
    
    public static void main(String[] args) {
        
        //key = id value =Alumno
    	//Key  es una coleccione de Set NO DUPLICADO
    	//Coleccion Map no permite dos key iguales
        HashMap<Integer, Alumno> map = new HashMap<Integer, Alumno>();
            
        
        Alumno a1 = new Alumno(2,"Luis",1);
        Alumno a2 = new Alumno(4,"Carlos",1);
        Alumno a3 = new Alumno(1,"Rosa",1);
        
        //  PUT(KEY, VALUE)
        map.put(a1.getId(), a1);  
        map.put(a2.getId(), a2);
        map.put(a3.getId(), a3);
        
        // 2 -> luis  
        // 4 -> Carlos
        // 1 -> Rosa
        
        System.out.println(map.get(1));
        
        map.put(2, new Alumno(2,"Luis Mejorado",3));
        
        
        System.out.println("Mostrar alumno id 2 " + map.get(2));
        
        
        Collection<Alumno> alumnnosMap = map.values();
        for(Alumno a: alumnnosMap) System.out.println(a);
        
        //KEY es una colleccions Set (equals y hascode)
        
        Set<Integer> clavesMap = map.keySet();
        for(Integer i: clavesMap) System.out.println(i);
        
        
        //Map que tiene como key el alunno y como value nota
        HashMap<Alumno, Double> notas = new HashMap();
        
        notas.put(a1, 3.9);
        notas.put(a2, 6.8);
        notas.put(a3, 9.0);
        
        System.out.println("La nota media de "
                + a1.getNombre() + " es " 
                + notas.get(a1));
        
        
        System.out.println("Recorrer map por sus values");
        
        Collection<Double> valores = notas.values();
        
        for(Double a: valores){
            System.out.println(a);
        }
        
        
        System.out.println("Recorrer los keys del map");
        Set<Alumno> claves = notas.keySet();
        for(Alumno k: claves){
            System.out.println(k  + " -> " + map.get(k));
        }
        
        
        
        
        
        
        
    }
    
}
