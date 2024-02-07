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
  public String descripcion() {
    return "Envio nº " + super.getId() + ": envio internacional" ;
  }
  
  @Override
  public String toString() {
    return "Envio Internacional";
  }
  
  
  
  
}

