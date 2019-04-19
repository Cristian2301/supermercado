package supermercado;


public class DePrimeraNecesidad extends Producto {
	
	public DePrimeraNecesidad(String nombre, Integer precio, Boolean esParteDePreciosCuidados) {
		super(nombre, precio, esParteDePreciosCuidados);
	}
	
	public Integer getPrecio(){
		return precio * 9;         // como uso super
	}
	
}
