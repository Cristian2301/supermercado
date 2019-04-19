package supermercado;

public class Producto {
	public String nombre;
	public Integer precio;
	public Boolean esParteDePreciosCuidados;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getPrecio() {
		return precio;
	}
	
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	public Boolean getEsParteDePreciosCuidados() {
		return esParteDePreciosCuidados;
	}
	
	public void setEsParteDePreciosCuidados(Boolean esParteDePreciosCuidados) {
		this.esParteDePreciosCuidados = esParteDePreciosCuidados;
	}
	
	
	public Producto(String nombre, Integer precio, Boolean esParteDePreciosCuidados) {
		this.nombre = nombre;
		this.precio
		this.esParteDePreciosCuidados = esParteDePreciosCuidados;
	}
	
}
