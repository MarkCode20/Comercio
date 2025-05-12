package com.unpaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Repository {
	 
	 public static List<String> CargarDatos() {
		  List<String> dato = new ArrayList<>();
		  String rutaArchivo = "C:\\Users\\yonid\\OneDrive\\Escritorio\\office\\ventas.txt";
			
	     try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
	         String linea;
	         while ((linea = br.readLine()) != null) {
	             // Separar por coma
	        	 String [] parte = linea.split(",");
                 dato.add(linea);
	         }

	     } catch (IOException e) {
	         System.out.print("Error al leer el archivo: " + e.getMessage());
	     }
	        return dato;
	    }
}
