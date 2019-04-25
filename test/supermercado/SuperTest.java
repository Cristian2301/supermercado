package supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class SuperTest {
	
	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		detergente = new Producto("Detergente", 75d, false);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.getCantidadDeProductos());
	}
	
//	@SuppressWarnings("deprecation")
//	@Test
//	public void testPrecioTotal() {
//		assertEquals(new Double(0), supermercado.getPrecioTotal());
//		supermercado.agregarProducto(arroz);
//		supermercado.agregarProducto(detergente);
//		assertEquals(new Double(93.9), supermercado.getPrecioTotal());
//	}
}