package ar.com.drk.drkbugs.a_la_carte.interface_segregation.initial;

public class Main {
  public static void main(final String[] args) {
    final Memoria memoria = new MemoriaSoloLectura();
    final byte[] datos = memoria.leer(5);
  }
}
