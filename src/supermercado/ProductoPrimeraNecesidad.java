package supermercado;


public class ProductoPrimeraNecesidad extends Producto {
	private Double descuento;
	
	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esParteDePreciosCuidados, Double descuento) {
		super(nombre, precio, esParteDePreciosCuidados);
		this.descuento = descuento;
	}
	
	public Double getPrecio(){
		return super.getPrecio() * this.getDescuento();
	}
	
}
