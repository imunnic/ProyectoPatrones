package correos;

import java.util.ArrayList;
import java.util.List;

public class OficinaCorreos {
  private int numEnvios;
  private List<EnvioWrapper> envios;
  private List<Envio> tiposEnvio;
  private EnvioFactory envioNacional;
  private EnvioFactory envioInternacional;
  
  public OficinaCorreos() {
    reiniciarEnvios();
    tiposEnvio = new ArrayList<Envio>();
    envios = new ArrayList<EnvioWrapper>();
    envioNacional = new EnvioNacionalFactory();
    envioInternacional = new EnvioInternacionalFactory();
    tiposEnvio.add(new EnvioNacional());
    tiposEnvio.add(new EnvioInternacional());
  }
  
  public void abrirOficina() {
    reiniciarEnvios();
    System.out.println("Bienvenido a la oficina de correos");
    System.out.println("¿Quiere realizar un envio?");
    while (MyInput.readString().equals("s")) {
      envios.add(crearEnvio());
      numEnvios++;
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
      envio = envioNacional.crearEnvio(numEnvios);
    } else if (Integer.parseInt(tipoEnvio) == 2) {
      envio = envioInternacional.crearEnvio(numEnvios);
    }
    return envio;
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
  
}
