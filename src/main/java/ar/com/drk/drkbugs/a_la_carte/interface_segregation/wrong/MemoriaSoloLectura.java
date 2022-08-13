package ar.com.drk.drkbugs.a_la_carte.interface_segregation.wrong;

public class MemoriaSoloLectura implements Memoria {
  @Override
  public byte[] leer(final int posicion, final int count) {
    // Lógica
    return new byte[0];
  }

  @Override
  public void escribir(final int posicion, final byte[] datos) {
    throw new UnsupportedOperationException();
  }
}
