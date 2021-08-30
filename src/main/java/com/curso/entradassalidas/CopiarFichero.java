package com.curso.entradassalidas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarFichero {
	
	public static void main(String[] args) {
		
		// definir un fichero
		
		File miFichero = new File("Datos.txt");
		File miDir = new File("C:/midir");
		FileWriter fw = null;
		BufferedWriter bw  = null;
		
		File miFicheroLectura = new File("DatosALeer.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// crear fichero. 
			//si existe no lo crea y devuelve false
			miFichero.createNewFile();
			//miDir.mkdir();
			//miDir.isDirectory();
			
			//definir FileWriter
			 fw = new FileWriter(miFichero,false);  //sobreecribe el fichero //"nombrefichero.txt"
			 fw = new FileWriter(miFichero,true);  //añade al final del fichero

			//definir Buffer para escribir  linea a linea
			 bw  = new BufferedWriter(fw);
			 
			//fw.write("hola mundo \n");
			bw.write("Hola Mundo");
			bw.newLine();
			bw.write("Hola Mundo2");
	
			fw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				if(bw != null) bw.close();
				if(fw != null)fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
	
		
		
		
		
		
		
		
		
	}//fin main
	

}
