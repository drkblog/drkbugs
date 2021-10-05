package ar.com.drk.drkbugs.codility;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.List;

public class VariableNames {

    @Value
    static class User {
        final String name;
        final int age;
    }

    public int calculateAegAverage(final List<User> userList) {
        int accumulatedAge = 0;
        int userCount = 0;
        for (User user : userList) {
            accumulatedAge += user.getAge();
            userCount++;
        }
        return accumulatedAge/userCount;
    }
}
