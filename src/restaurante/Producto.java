package restaurante;

public class Producto implements ProductoCarta {
  private String nombre;
  private float precio;
  private int id;
  
  public Producto(int id, String nombre, float precio) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
  }
  
  public float getPrecio() {
    return precio;
  }
  
  @Override
  public String stringProducto() {
    return nombre + " - Precio:" + Float.toString(precio) + "€";
  }

  @Override
  public int getSubProductos() {
    // TODO Auto-generated method stub
    return 0;
  }

}
