package supermercado;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private Integer direccion;
	private ArrayList <Producto> productos;

	private String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private Integer getDireccion() {
		return direccion;
	}
	
	private void setDireccion(Integer direccion) {
		this.direccion = direccion;
	}
	
	
	private Supermercado(String nombre, Integer direccion, Producto productos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	
	private Integer cantTotalProductos(){
		return productos.size();
	}
	
	
	private Integer sumaDePreciosDeProductos() {
		Integer precioTotal = 0;
			for (Producto p : productos) {
				precioTotal += p.getPrecio();
			}
			return precioTotal;
	}
	
}
