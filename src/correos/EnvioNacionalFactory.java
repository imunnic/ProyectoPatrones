package correos;

public class EnvioNacionalFactory extends EnvioFactory {

  public EnvioNacionalFactory() {
    super.envio = new EnvioNacional();
  }
  
  @Override
  public EnvioWrapper crearEnvio(int numEnvio) {
    float precio=0f;
    boolean precioOk;
    do {
      try {
        precio = super.solicitarPrecioBasico();        
        precioOk = true;
      } catch (Exception e) {
        precioOk = false;
      }
    } while (!precioOk);
    envio = new EnvioNacional(numEnvio, precio, "");
    envio = super.solicitarComplementos(envio);
    return envio;
  }

}
