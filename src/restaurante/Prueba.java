package restaurante;

public class Prueba {

  public static void main(String[] args) {
    Restaurante michelin = new Restaurante();
    michelin.agregarSeccionCarta(new SeccionCarta(michelin.getCarta(), "Platos"));
    michelin.agregarSeccionCarta(new SeccionCarta(michelin.getCarta(), "Platos"));
    System.out.println(michelin.getCarta().mostrarInformacion());
    System.out.println("-----------------");
    michelin.getCarta().recuperar("c-s001");
    michelin.agregarComponenteCarta("c-s001", "Macarrones", 15.0f);
    michelin.agregarComponenteCarta("c-s001", "Bistec", 25.0f);
    michelin.agregarComponenteCarta("c-s002", "Natillas", 15.0f);
    michelin.agregarComponenteCarta("c-s002", "Fruta", 10.0f);
    System.out.println(michelin.getCarta().mostrarInformacion());
    System.out.println("-----------------");
    michelin.eliminarComponenteCarta("c-s002-p001");
    System.out.println(michelin.getCarta().mostrarInformacion());

  }

}
