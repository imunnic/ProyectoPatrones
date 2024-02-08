package restaurante;

import java.util.ArrayList;
import java.util.List;

public class SeccionCarta extends ComponenteCarta{
  private List<ComponenteCarta> componentes;
  
  public SeccionCarta() {
    super("c","carta");
    componentes = new ArrayList<ComponenteCarta>();
  }
  
  public SeccionCarta(ComponenteCarta componente, String nombre) {
    super(componente, nombre);
    super.setIdNum(componente.tamanoComponente() + 1);
    super.setId(componente.getId() + "-s" + String.format("%03d", super.getIdNum()));
    componentes = new ArrayList<ComponenteCarta>();
  }

  @Override
  public void agregar(ComponenteCarta componente) {
    if (componentes.contains(componente)) {
      System.err.println("Este componente del menú ya está agregado");
    } else {
      componentes.add(componente);
    }
  }

  @Override
  public void eliminar(ComponenteCarta componente) { 
    if(componentes.contains(componente)) {
      componentes.remove(componente);
    } else {
      for (ComponenteCarta componenteCarta : componentes) {
        componenteCarta.eliminar(componente);
      }
    }
  }

  @Override
  public ComponenteCarta recuperar(String id) {
    if (this.getId().equals(id)) return this;
    else {
      for (ComponenteCarta componente : componentes)
        if (componente.recuperar(id) != null)
          if (componente.recuperar(id).getId().equals(id))
            return componente.recuperar(id);
      return null;
    }
  }

  @Override
  public int tamanoComponente() {
    return componentes.size();
  }

  @Override
  public String mostrarInformacion() {
    String retorno = super.getId() + " - Sección de " + super.getNombre() + ":\n";
    for (ComponenteCarta componenteCarta : componentes) {
      retorno += componenteCarta.mostrarInformacion();
    }
    return retorno;
    
  }

}
