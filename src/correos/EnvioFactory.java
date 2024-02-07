package correos;

public abstract class EnvioFactory {
  protected EnvioWrapper envio;
  public abstract EnvioWrapper crearEnvio(int numEnvio);
  
   protected float solicitarPrecioBasico() {
    System.out.println("Indique el precio básico");
    return MyInput.readFloat();
  }
   
   protected EnvioWrapper solicitarComplementos(EnvioWrapper envio) {
     EnvioWrapper envioFinal = envio;
     String respuesta;
     System.out.println("¿Quiere que el envío sea certificado?");
     respuesta = MyInput.readString();
     if (respuesta.equals("s")){
       envioFinal = new EnvioCertificado(envioFinal);
     }
     System.out.println("¿Quiere que el envío sea urgente?");
     respuesta = MyInput.readString();
     if (respuesta.equals("s")){
       envioFinal = new EnvioUrgente(envioFinal);
     }
     System.out.println("¿Quiere asegurar el envío?");
     respuesta = MyInput.readString();
     if (respuesta.equals("s")){
       System.out.println("Introduzca el valor aproximado del envio");
       float valor = MyInput.readFloat();//TODO asegurar el contenido de valor;
       envioFinal = new EnvioAsegurado(envioFinal,valor);
     }
     return envioFinal;
   }
}
