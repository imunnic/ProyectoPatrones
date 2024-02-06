package baloncesto;

import java.util.List;



public abstract class DatosEquipo {

  protected List<BaloncestoListener> listeners;

  public DatosEquipo() {
    super();
  }

  public abstract int getTotal();

  public void agregar(BaloncestoListener data) {
    listeners.add(data);
  }

  public void eliminar(BaloncestoListener data) {
    listeners.remove(data);
  }

}
