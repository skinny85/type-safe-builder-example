package com.endoflineblog.type_safe_builder.submodule_01;

import org.jilt.Builder;

/**
 * This is exactly equivalent to the Builder for {@code User}
 * implemented in module {@code 01-classic-user-builder}.
 */
@Builder
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
