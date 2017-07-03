package com.endoflineblog.type_safe_builder.submodule_03;

import org.jilt.Builder;
import org.jilt.BuilderStyle;
import org.jilt.Opt;

import static java.util.Objects.requireNonNull;

/**
 * This is exactly equivalent to the Type-Safe Builder for
 * {@code User} from the {@code 03-type-safe-user-builder-optional-props} submodule
 * (the one where {@code username} and {@code displayName} were optional).
 */
public final class User {
    public final String email, username, firstName, lastName, displayName;

    @Builder(style = BuilderStyle.TYPE_SAFE)
    public User(String email, @Opt String username, String firstName,
                String lastName, @Opt String displayName) {
        this.email = requireNonNull(email);
        this.username = username == null ? email : username;
        this.firstName = requireNonNull(firstName);
        this.lastName = requireNonNull(lastName);
        this.displayName = displayName == null
            ? firstName + " " + lastName
            : displayName;
    }
}
