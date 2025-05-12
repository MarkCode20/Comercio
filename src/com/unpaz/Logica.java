package com.unpaz;

import java.util.ArrayList;
import java.util.List;

public class Logica {
	 public List<Venta> ventas = new ArrayList<>();
   
	 public void CargarDatos() {  
	   List<String> dato = Repository.CargarDatos();
	   for(String linea: dato) {
		   String [] parte = linea.split(",");
		   int i = Integer.parseInt(parte[0].trim());
		   String nombre = parte[1];
		   double importe = Double.parseDouble(parte[2].trim());
		   String medioPago = parte[3];
		   Venta venta = new Venta(i,nombre,importe, medioPago);
		   ventas.add(venta);
	   }
	   
	   for(Venta venta1: ventas) {
		   System.out.println(venta1.getImporte());
	   }
   }
	 
	 
}
