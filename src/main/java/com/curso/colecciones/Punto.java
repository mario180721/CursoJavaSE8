package com.curso.colecciones;

import java.awt.Color;
import java.util.Objects;

public class Punto {
	
     private int x;
     private int y;
     private Color color;
     
	public Punto(int x, int y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punto2 [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return x == other.x && y == other.y;
	}
	
	
     
     
}
