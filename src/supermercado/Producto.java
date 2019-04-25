package supermercado;

public class Producto {
	public String nombre;
	public Double precio;
	public Boolean esParteDePreciosCuidados;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Boolean getEsParteDePreciosCuidados() {
		return esParteDePreciosCuidados;
	}
	
	
	public Boolean esPrecioCuidado() {
		return getEsParteDePreciosCuidados();
	}
	
	
	public void setEsParteDePreciosCuidados(Boolean esParteDePreciosCuidados) {
		this.esParteDePreciosCuidados = esParteDePreciosCuidados;
	}
	
	
	public Producto(String nombre, Double precio, Boolean esParteDePreciosCuidados) {
		this.nombre = nombre;
		this.precio = precio;
		this.esParteDePreciosCuidados = esParteDePreciosCuidados;
	}
	
	
	public void aumentarPrecio(Double n) {
		precio += n;
	}
	
	
	
}
