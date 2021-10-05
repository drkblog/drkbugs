package ar.com.drk.drkbugs.misc;

import lombok.Value;

import java.util.List;

public class VariableNames {

    @Value
    static class User {
        String name;
        int age;
    }

    public int calculateAegAverage(final List<User> userList) {
        int accumulatedAge = 0;
        int userCount = 0;
        for (final User user : userList) {
            accumulatedAge += user.getAge();
            userCount++;
        }
        return accumulatedAge/userCount;
    }
}
