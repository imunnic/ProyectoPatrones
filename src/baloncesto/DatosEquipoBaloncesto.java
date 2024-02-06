package baloncesto;

import java.util.ArrayList;

public class DatosEquipoBaloncesto extends DatosEquipo {
  int canastas;
  int triples;
  
  public int getCanastas() {
    return canastas;
  }
  
  public int getTriples() {
    return triples;
  }
  
  public DatosEquipoBaloncesto() {
    super();
    listeners = new ArrayList<BaloncestoListener>();
    canastas = 0;
    triples = 0;
  }
  
  public void setCanasta() {
    canastas++;
    listeners.forEach(BaloncestoListener::mostrar);
    
  }
  public void setTriple() {
    triples++;
    listeners.forEach(BaloncestoListener::mostrar);
  }

  @Override
  public int getTotal() {
    // TODO Auto-generated method stub
    return getTriples() * 3 + getCanastas() * 2;
  }
}
