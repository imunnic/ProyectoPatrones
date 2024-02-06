package baloncesto;

public class Estadistica implements BaloncestoListener{
  private DatosEquipoBaloncesto datosEquipo;
  
  public Estadistica(DatosEquipoBaloncesto datos) {
    datosEquipo = datos;
  }
  @Override
  public void mostrar() {
    int porcentaje = (int) datosEquipo.getCanastas() * 200 / datosEquipo.getTotal();
    System.out.println("Porcentaje de puntos por canastas: " + porcentaje + "%");
    porcentaje = (int) datosEquipo.getTriples() * 300 / datosEquipo.getTotal();
    System.out.println("Porcentaje de puntos por canastas: " + porcentaje + "%");
    
  }

}
