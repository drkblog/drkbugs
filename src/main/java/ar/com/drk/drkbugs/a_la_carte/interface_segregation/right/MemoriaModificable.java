package ar.com.drk.drkbugs.a_la_carte.interface_segregation.right;

public interface MemoriaModificable extends Memoria {
  void escribir(final int posicion, final byte[] datos);
}
