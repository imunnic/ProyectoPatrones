package restaurante;

public class Producto extends ComponenteCarta{
  private float coste;
  
  public float getCoste() {
    return coste;
  }
  
  public Producto(ComponenteCarta componente, String nombre, float coste) {
    super(componente, nombre);
    super.setIdNum(componente.tamanoComponente() + 1);
    super.setId(componente.getId() + "-p" + String.format("%03d", super.getIdNum()));
    this.coste = coste;
  }
  
  @Override
  public void agregar(ComponenteCarta componente) {
    System.err.println("No puede agregar componentes a un plato");
  }

  @Override
  public void eliminar(ComponenteCarta componente) {
    
  }

  @Override
  public ComponenteCarta recuperar(String id) {
    return (getId().equals(id)) ? this:null;
  }

  @Override
  public int tamanoComponente() {
    return 0;
  }

  @Override
  public String mostrarInformacion() {
    return "  - " + super.getNombre() + ". Precio: " + getCoste() + " €\n";
  }

}
