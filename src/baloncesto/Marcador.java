package baloncesto;

public class Marcador implements BaloncestoListener {
  private DatosEquipo datosEquipo;
  
  public Marcador(DatosEquipo datos) {
    datosEquipo = datos;
  }
  
  @Override
  public void mostrar() {
    System.out.println("Marcador total: " + datosEquipo.getTotal());
  }

}
