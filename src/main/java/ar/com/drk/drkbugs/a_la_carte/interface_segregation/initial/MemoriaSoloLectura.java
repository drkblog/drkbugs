package ar.com.drk.drkbugs.a_la_carte.interface_segregation.initial;

public class MemoriaSoloLectura implements Memoria {
  @Override
  public byte[] leer(final int posicion, final int count) {
    // Lógica
    return new byte[0];
  }
}
