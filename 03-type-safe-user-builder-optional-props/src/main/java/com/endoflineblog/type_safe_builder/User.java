package com.endoflineblog.type_safe_builder;

import static java.util.Objects.requireNonNull;

/**
 * This is the version of the User class with the
 * {@code username} and {@code displayName} properties
 * being optional.
 * Once again, we are using public fields instead of getters for brevity.
 */
public final class User {
    public final String email, username, firstName, lastName, displayName;

    public User(String email, String username, String firstName,
                String lastName, String displayName) {
        this.email = requireNonNull(email);
        this.username = username == null ? email : username;
        this.firstName = requireNonNull(firstName);
        this.lastName = requireNonNull(lastName);
        this.displayName = displayName == null
            ? firstName + " " + lastName
            : displayName;
    }
}
