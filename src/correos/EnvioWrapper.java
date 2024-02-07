package correos;

public interface EnvioWrapper {
  public String descripcion();
  public float getCoste();
  public default String envioToString() {
    return descripcion() + ". Precio: " + getCoste() + "€";
  }
}
