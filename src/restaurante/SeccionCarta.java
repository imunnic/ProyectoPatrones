package restaurante;

import java.util.ArrayList;
import java.util.List;

public class SeccionCarta implements ProductoCarta {
  private List<ProductoCarta> productos;
  private String id;
  private String nombre;
  
  public SeccionCarta(String id, String nombre) {
    productos = new ArrayList<ProductoCarta>();
    this.nombre = nombre;
    this.id = id;
  }
  
  public void agregarProducto(ProductoCarta producto) {
    productos.add(producto);
  }
  
  public void eliminarProducto(ProductoCarta producto) {
    productos.remove(producto);
  }
  
  @Override
  public int getSubProductos() {
    return productos.size();
  }
  
  @Override
  public String stringProducto() {
    String retorno = nombre + ":\n";
    for (ProductoCarta productoCarta : productos) {
      retorno += "  - " + productoCarta.stringProducto() + "\n";
    }
    return retorno;
  }

}
