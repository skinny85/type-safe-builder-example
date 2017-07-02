package com.endoflineblog.type_safe_builder;

public interface UserBuilders {
    interface Email {
        FirstName email(String email);
    }

    interface FirstName {
        LastName firstName(String firstName);
    }

    interface LastName {
        Build lastName(String lastName);
    }

    interface Build {
        Build username(String username);

        Build displayName(String displayName);

        User build();
    }
}
