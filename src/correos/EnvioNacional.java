package correos;

public class EnvioNacional extends Envio {

  @Override
  public float getCoste() {
    return super.getCoste();
  }

  public EnvioNacional() {
    super();
  }
  public EnvioNacional(int id, float coste, String lugarEnvio) {
    super(id, coste, lugarEnvio);
  }

  @Override
  public String descripcion() {
    return "Envio nº " + super.getId() + ": envio nacional" ;
  }
  
  @Override
  public String toString() {
    return "Envio Nacional";
  }
  
}
