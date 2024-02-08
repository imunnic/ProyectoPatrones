package restaurante;

public class Restaurante {
  private SeccionCarta carta;
  
  public SeccionCarta getCarta() {
    return carta;
  }
  
  public Restaurante() {
    carta = new SeccionCarta();
  }
  
  public void agregarSeccionCarta(SeccionCarta seccion) {
    carta.agregar(seccion);
  }
  
  public void agregarComponenteCarta(String idSeccion, String nombre, float coste) {
    carta.recuperar(idSeccion).agregar(new  Producto(carta.recuperar(idSeccion), nombre, coste));
  }
  
  public void eliminarComponenteCarta(String id) {
    carta.eliminar(carta.recuperar(id));
  }
  
  public void mostrarCarta() {
    carta.mostrarInformacion();
  }

}
