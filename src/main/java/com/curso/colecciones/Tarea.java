package com.curso.colecciones;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Tarea implements Serializable {
	
	private int id ;
	private LocalDate fechaVencimiento;
	
	
	public Tarea(int id, LocalDate fechaVencimiento) {
		super();
		this.id = id;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Tarea [id=" + id + ", fechaVencimiento=" + fechaVencimiento + "]";
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
		Tarea other = (Tarea) obj;
		return id == other.id;
	}

	
}
