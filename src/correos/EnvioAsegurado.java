package correos;

public class EnvioAsegurado implements EnvioWrapper {
  private EnvioWrapper envio;
  private float valorAproximado;
  @Override
  public float getCoste() {
    return envio.getCoste() + valorAproximado * 0.1f;
  }

  public EnvioAsegurado(EnvioWrapper envio, float valorAproximado) {
    this.envio = envio;
    this.valorAproximado = valorAproximado;
  }

  
}
