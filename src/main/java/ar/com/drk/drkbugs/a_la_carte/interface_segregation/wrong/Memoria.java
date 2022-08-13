package ar.com.drk.drkbugs.a_la_carte.interface_segregation.wrong;

public interface Memoria {
  byte[] leer(int posicion, int count);

  void escribir(final int posicion, final byte[] datos);
}
