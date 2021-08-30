package com.curso.colecciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PruebaProperties {
	
	public static void main(String[] args) {
		
			Properties propiedadesApp = new Properties();
			try {
				//load lee del fichero las propiedades y crea el map
				propiedadesApp.load(new FileInputStream("app.properties"));
				
				// busca por key si no encuentra devuelve null
				String cuentas = (String) propiedadesApp.get("totalCuentas"); 
				
				//buscar por key si no lo encuenta devuelve 4
				String cuentas2= propiedadesApp.getProperty("totalCuentas", "4");
				System.out.println("cuentas a crear " + cuentas);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
