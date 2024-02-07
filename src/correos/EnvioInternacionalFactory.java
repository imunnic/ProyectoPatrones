package correos;

public class EnvioInternacionalFactory extends EnvioFactory {

  public EnvioInternacionalFactory() {
    super.envio = new EnvioInternacional(); 
  }
  
  @Override
  public EnvioWrapper crearEnvio(int numEnvio) {
    float precio = 0f;
    float peso = 0f;
    boolean floatOk;
    do {
      try {
        precio = solicitarPrecioBasico();        
        floatOk = true;
      } catch (Exception e) {
        floatOk = false;
      }
    } while (!floatOk);
    do {
      try {
        peso = solicitarPeso();        
        floatOk = true;
      } catch (Exception e) {
        floatOk = false;
      }
    } while (!floatOk);
    envio = new EnvioInternacional(numEnvio, precio, "",peso);
    envio = solicitarComplementos(envio);
    return envio;
  }
  
  private float solicitarPeso() {
    System.out.println("Indique el peso");
    return MyInput.readFloat();
  }

}
