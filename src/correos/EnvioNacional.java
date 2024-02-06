package correos;

public class EnvioNacional extends Envio {

  @Override
  public float getCoste() {
    // TODO Auto-generated method stub
    return super.getCoste();
  }

  public EnvioNacional() {
    super();
  }
  public EnvioNacional(int id, float coste, String lugarEnvio) {
    super(id, coste, lugarEnvio);
    // TODO Auto-generated constructor stub
  }

  @Override
  public String envioToString() {
    // TODO Auto-generated method stub
    return "Envío Nacional";
  }

  
}
