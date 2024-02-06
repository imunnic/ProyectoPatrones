package correos;

public abstract class Envio implements EnvioWrapper {
  private int id;
  private float coste;
  private String lugarEnvio;
  
  public String getLugarEnvio() {
    return lugarEnvio;
  }
  
  public int getId() {
    return id;
  }
  
  public float getCoste() {
    return coste;
  }
  
  public Envio() {
  }
  
  public Envio(int id, float coste, String lugarEnvio) {
    this.id = id;
    this.coste = coste;
    this.lugarEnvio = lugarEnvio;
  }
  
  public abstract String envioToString();
}
