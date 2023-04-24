package libreriavirtual;

import java.util.ArrayList;

public class CarritoCompras {

	public ArrayList<Producto> productos = new ArrayList<>();
	Producto producto;
	
	public void agregarProducto (Producto producto) {
	productos.add(producto);
	}
	
	public void eliminarProducto (Producto producto) {
		productos.remove(producto);
	}
	public void mostrarProductos() {
		System.out.println("Productos en el carrito: ");
		for (Producto producto : productos) {
			
					System.out.println(producto); }
		System.out.println("El total del carrito es $"+ totalCarrito());
			
	}
	public double totalCarrito() {
		double totalCarrito = 0;
		for (Producto producto : productos) {
			totalCarrito += producto.calcularPrecio();
		}
		return totalCarrito;
	}
}
