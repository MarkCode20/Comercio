package com.unpaz;


public class Venta {
	public enum medioPago { Efectivo, Tarjeta, Transferencia};
	
	private int numVenta;
	private String cliente;
	private double importe;
	private String medioPagos;
	
	
	Venta(int numVenta, String cliente, double importe, String medioPagos) {
		this.numVenta = numVenta;
		this.cliente = cliente;
		this.importe = importe;
		this.medioPagos = medioPagos;
	}
	
	//getter
	public int getNumVenta() {
		return numVenta;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public double getImporte() {
		return importe;
	}
	
	public String getMedioPagos() {
		return medioPagos;
	}
	
	//setter
	
	public void setNumVenta(int numVenta) {
		this.numVenta = numVenta;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void setImporte(double nimporte) {
		this.importe = importe;
	}
	
	public void setMedioPago(String medioPagos) {
		this.medioPagos = medioPagos;
	}
}
