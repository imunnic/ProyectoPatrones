package correos;

public class EnvioInternacional extends Envio {
  private final float SOBRECARGO = 10.00f;
  private float peso;
  
  @Override
  public float getCoste() {
    return (peso > 2.0f) ? super.getCoste() + SOBRECARGO:super.getCoste();
  }

  public EnvioInternacional() {
    super();
  }
  
  public EnvioInternacional(int id, float coste, String lugarEnvio, float peso) {
    super(id, coste, lugarEnvio);
    this.peso = peso;
  }

  @Override
  public String envioToString() {
    // TODO Auto-generated method stub
    return "Envío Internacional";
  }
  
  
  
}

