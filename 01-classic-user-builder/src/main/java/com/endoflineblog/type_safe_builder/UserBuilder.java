package com.endoflineblog.type_safe_builder;

public class UserBuilder {
    public static UserBuilder user() {
        return new UserBuilder();
    }

    private String email, username, firstName, lastName, displayName;

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public User build() {
        return new User(email, username, firstName, lastName, displayName);
    }
}
