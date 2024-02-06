package correos;

import java.util.ArrayList;
import java.util.List;

public class OficinaCorreos {
  private int numEnvios;
  private List<EnvioWrapper> envios;
  private List<Envio> tiposEnvio;
  
  public OficinaCorreos() {
    reiniciarEnvios();
    tiposEnvio = new ArrayList<Envio>();
    envios = new ArrayList<EnvioWrapper>();
    tiposEnvio.add(new EnvioNacional());
    tiposEnvio.add(new EnvioInternacional());
  }
  
  public void abrirOficina() {
    reiniciarEnvios();
    System.out.println("Bienvenido a la oficina de correos");
    System.out.println("¿Quiere realizar un envio?");
    while (MyInput.readString().equals("s")) {
      envios.add(crearEnvio());
      System.out.println("¿Quiere realizar otro envío?");
    }
    for (EnvioWrapper envioWrapper : envios) {
      System.out.println(envioWrapper.getCoste()); //TODO imprimir correctamente los envíos
    }
    System.out.println("Que tenga un buen día");
  }

  private void reiniciarEnvios() {
    numEnvios = 1;
  }

  private EnvioWrapper crearEnvio() {
    EnvioWrapper envio = new EnvioNacional();
    String tipoEnvio = solicitarEnvio();
    System.out.println(tipoEnvio);
    if (Integer.parseInt(tipoEnvio) == 1) {
      envio = crearEnvioNacional();//TODO implementar factory
    } else if (Integer.parseInt(tipoEnvio) == 2) {
      envio = crearEnvioInternacional(); //TODO implementar factory
    }
    envio = solicitarComplementos(envio);
    return envio;
  }

  private EnvioWrapper solicitarComplementos(EnvioWrapper envio) {
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

  private boolean validarTipoEnvio(String tipo, List tipos) {
    try {
      int type = Integer.parseInt(tipo);
      if (type > 0 && type <= tipos.size()) {
        return true;
      } else {
        System.err.println("Opción no válida, elija de nuevo");
        return false;
      }
    } catch (Exception e) {
      System.err.println("Por favor, introduzca un número");
      return false;
    }
  }

  private String solicitarEnvio() {
    String respuesta;
    do {
      System.out.println("Indique el número correspondiente:");
      int i = 1;
      for (Envio tipo : tiposEnvio) {
        System.out.println(i + ". " + tipo.envioToString());
        i++;
      }
      respuesta = MyInput.readString();
    } while (!validarTipoEnvio(respuesta, tiposEnvio));
    return respuesta;
  }
  
  private float solicitarPrecioBasico() {
    System.out.println("Indique el precio básico");
    return MyInput.readFloat();
  }
  
  private float solicitarPeso() {
    System.out.println("Indique el peso");
    return MyInput.readFloat();
  }
  
  private EnvioWrapper crearEnvioNacional() {
    float precio=0f;
    boolean precioOk;
    do {
      try {
        precio = solicitarPrecioBasico();        
        precioOk = true;
      } catch (Exception e) {
        precioOk = false;
      }
    } while (!precioOk);
    return new EnvioNacional(this.numEnvios, precio, "");
  }
  
  private EnvioWrapper crearEnvioInternacional() {
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
    return new EnvioInternacional(this.numEnvios, precio, "",peso);
  }
}
