package correos;

public class EnvioCertificado implements EnvioWrapper {
  private EnvioWrapper envio;
  private final float SOBRECARGO = 10.0f;
  
  @Override
  public float getCoste() {
    // TODO Auto-generated method stub
    return envio.getCoste() + SOBRECARGO;
  }
  
  public EnvioCertificado(EnvioWrapper envio) {
    this.envio = envio;
  }

}
