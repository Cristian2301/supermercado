package supermercado;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList <Producto> productos = new ArrayList <Producto>();

	private String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private String getDireccion() {
		return direccion;
	}
	
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	public Integer getCantidadDeProductos() {
		return this.cantTotalProductos();
	}
	
	
	private Integer cantTotalProductos(){
		return productos.size();
	}
	
	
	public Double getPrecioTotal() {
		return sumaDePreciosDeProductos();
	}
	
	
	private Double sumaDePreciosDeProductos() {
		Double precioTotal = 0.0;
			for (Producto p : productos) {
				precioTotal += p.getPrecio();
			}
			return precioTotal;
	}
	
}
