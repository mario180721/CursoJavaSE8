package com.curso.colecciones;

import java.util.Comparator;

public class OrdenarAlumnoPorCursoAlumno 
        implements Comparator<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
    	//COMPARO POR CURSO Y LUEGO POR NOMBRE
        // retun 0  - si son iguales
        // return >0  si soy mayor
        // return <0  si soy menor

        int r = 0;

        int cursoCompara = o1.getCurso() - o2.getCurso();
        int nombreCompara = o1.getNombre().compareTo(o2.getNombre());

        if (cursoCompara == 0 && nombreCompara == 0) {
            //iguales
            r = 0;
        } else if (cursoCompara != 0) {
            r = cursoCompara;
        } else {
            //curso es igual . comparo por nombre
            r = nombreCompara;
        }
        return r;
    }
    
}
