package com.endoflineblog.type_safe_builder;

public class UserBuilder implements
        UserBuilders.Email,
        UserBuilders.FirstName,
        UserBuilders.LastName,
        UserBuilders.Build {
    public static UserBuilders.Email user() {
        return new UserBuilder();
    }

    private String email, username, firstName, lastName, displayName;

    private UserBuilder() {
    }

    @Override
    public UserBuilders.FirstName email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserBuilders.Build username(String username) {
        this.username = username;
        return this;
    }

    @Override
    public UserBuilders.LastName firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserBuilders.Build lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserBuilders.Build displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @Override
    public User build() {
        return new User(email, username, firstName, lastName, displayName);
    }
}
