package ar.com.drk.drkbugs.misc;

public class PassEnumClass {

  interface AnInterface {
    int aMethod();
  }

  enum FirstEnum implements AnInterface {
    A, B;

    @Override
    public int aMethod() {
      return 1;
    }
  }

  enum SecondEnum implements AnInterface {
    A, B;

    @Override
    public int aMethod() {
      return 2;
    }
  }

  public static <T extends Enum<E>, E extends Enum<E> & AnInterface> void listValues(final Class<T>... enums) {
    for (final Class<T> clazz : enums) {
      for (final Enum<E> constant : clazz.getEnumConstants()) {
        ((AnInterface) constant).aMethod();
      }
    }
  }

  public static void main(final String[] args) {
    listValues(FirstEnum.class);
  }
}
