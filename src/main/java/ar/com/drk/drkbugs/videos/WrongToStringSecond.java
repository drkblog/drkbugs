package ar.com.drk.drkbugs.videos;

import lombok.RequiredArgsConstructor;

public class WrongToStringSecond {

  @RequiredArgsConstructor
  static class AuthenticatedUser {
    private final String username;

    @Override
    public String toString() {
      return username;
    }
  }

  @RequiredArgsConstructor
  static class AnonymousUser {
    private final String nickname;
  }

  public static void main(final String[] args) {
    final AnonymousUser aUser = new AnonymousUser("juan");
    final String name = aUser.toString();
    System.out.println(name);
  }
}
