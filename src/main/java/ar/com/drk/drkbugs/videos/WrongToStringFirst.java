package ar.com.drk.drkbugs.videos;

import lombok.RequiredArgsConstructor;

public class WrongToStringFirst {

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
    final AuthenticatedUser aUser = new AuthenticatedUser("juan");
    final String name = aUser.toString();
    System.out.println(name);
  }
}
