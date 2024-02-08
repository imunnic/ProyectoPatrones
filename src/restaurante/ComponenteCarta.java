package restaurante;

public abstract class ComponenteCarta {
  private String nombre;
  private String id;
  private int idNum;
  
  public String getNombre() {
    return nombre;
  }
  
  public String getId() {
    return id;
  }
  
  protected void setId(String id) {
    this.id = id;
  }
  
  public int getIdNum() {
    return idNum;
  }
  
  protected void setIdNum(int idNum) {
    this.idNum = idNum;
  }
  
  public ComponenteCarta(String id, String nombre) {
    setId(id);
    setIdNum(0);
    this.nombre = nombre;
  }

  public ComponenteCarta(ComponenteCarta componenteCartaPadre, String nombre) {
    this.nombre = nombre;
    idNum = 0;
    id = "s000";
  }
  
  @Override
  public int hashCode() {
    return id.hashCode();
  }
  
  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
  
  public abstract String mostrarInformacion();
  public abstract void agregar(ComponenteCarta componente);
  public abstract void eliminar(ComponenteCarta componente);
  public abstract ComponenteCarta recuperar(String id);
  public abstract int tamanoComponente();
  
}
