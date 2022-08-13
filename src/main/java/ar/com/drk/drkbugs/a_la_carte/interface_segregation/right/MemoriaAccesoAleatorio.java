package ar.com.drk.drkbugs.a_la_carte.interface_segregation.right;

public class MemoriaAccesoAleatorio implements MemoriaModificable {
  @Override
  public byte[] leer(final int posicion, final int count) {
    // Lógica
    return new byte[0];
  }

  @Override
  public void escribir(final int posicion, final byte[] datos) {
    // Lógica
  }
}
