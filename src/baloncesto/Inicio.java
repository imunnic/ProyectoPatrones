package baloncesto;

public class Inicio {

  public static void main(String[] args) {
    DatosEquipoBaloncesto c = new DatosEquipoBaloncesto();
    System.out.println("Marcador inicial " + c.getTotal());
    c.setCanasta();
    Marcador m = new Marcador(c);
    c.agregar(m);
    Estadistica e = new Estadistica(c);
    c.agregar(e);
    c.setCanasta();
    c.setCanasta();
    c.setTriple();
    c.eliminar(e);
    c.setCanasta();
  }

}
