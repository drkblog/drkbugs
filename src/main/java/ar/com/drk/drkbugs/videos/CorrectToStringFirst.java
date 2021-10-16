package ar.com.drk.drkbugs.videos;

import lombok.RequiredArgsConstructor;

public class CorrectToStringFirst {

  @RequiredArgsConstructor
  static class AuthenticatedUser {
    private final String username;

    public String getDisplayName() {
      return username;
    }
  }

  @RequiredArgsConstructor
  static class AnonymousUser {
    private final String nickname;
  }

  public static void main(final String[] args) {
    final AuthenticatedUser aUser = new AuthenticatedUser("juan");
    final String name = aUser.getDisplayName();
  }
}
