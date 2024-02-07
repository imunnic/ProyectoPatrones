package correos;

public class EnvioUrgente implements EnvioWrapper {
  private EnvioWrapper envio;
  private final float SOBRECARGO = 40.0f;
  
  @Override
  public float getCoste() {
    // TODO Auto-generated method stub
    return envio.getCoste() + SOBRECARGO;
  }

  public EnvioUrgente(EnvioWrapper envio) {
    this.envio = envio;
  }

  @Override
  public String descripcion() {
    // TODO Auto-generated method stub
    return envio.descripcion() + ", urgente";
  }

  
}
