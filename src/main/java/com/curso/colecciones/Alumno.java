package com.curso.colecciones;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {

    private int id;
    private String nombre;
    private int curso;

    //constructores
    public Alumno(String nombre, int curso) {
        super();
    	this.nombre = nombre;
        this.curso = curso;
    }
     public Alumno(int id, String nombre, int curso) {
       this(nombre,curso);
       this.id= id;
    }
     
    //get y  set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", curso=" + curso + '}';
    }



    @Override
	public int hashCode() {
		return Objects.hash(id);
	}
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return id == other.id;
	}
	
	@Override
    public int compareTo(Alumno o) {
        return this.id - o.getId();
    }

}
