package restaurante;

public class Restaurante {
  private ProductoCarta carta;
  
  public Restaurante() {
    carta = new SeccionCarta("s000", "carta");
  }
  
  public void nuevaSeccion(String id, String nombre) {
    String idSeccion = id + "-" + nombre.substring(0, 1) + carta.getSubProductos();
    ProductoCarta nuevaSeccion = new SeccionCarta(idSeccion, nombre);
    carta.
  }
}
