package com.curso.ecommerce.model;

public class DetalleOrden {
	private Integer id;
	private double cantidad;
	private double precio;
	private double total;
	
	public DetalleOrden() {
		
	}

	public DetalleOrden(Integer id, double cantidad, double precio, double total) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total + "]";
	}
}
