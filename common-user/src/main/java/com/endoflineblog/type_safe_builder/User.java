package com.endoflineblog.type_safe_builder;

/**
 * This is the simple User class used in several
 * of the examples. It has public final fields
 * instead of getters for brevity.
 */
public final class User {
    public final String email, username, firstName, lastName, displayName;

    public User(String email, String username, String firstName,
                String lastName, String displayName) {
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
    }
}
