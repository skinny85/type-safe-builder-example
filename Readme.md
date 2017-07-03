This repository is the example code used in my
[blog article about the Type-Safe Builder pattern](http://endoflineblog.com/type-safe-builder-pattern-in-java-and-the-jilt-library).

It's organized into Gradle submodules,
each corresponding to a different part of the blog post.
They are numbered in the order they appear in the article:

* [01-classic-user-builder](01-classic-user-builder)
    shows an example of a "classic" Builder for the `User` class
    (the version with all required properties).
* [02-type-safe-agreement-version-builder](02-type-safe-agreement-version-builder)
    shows an example of a Type-Safe Builder for the `AgreementVersion` class.
* [03-type-safe-user-builder-optional-props](03-type-safe-user-builder-optional-props)
    shows an example of a Type-Safe Builder for a class with optional properties
    (the `User` class with the `username` and `displayName` properties being optional).
* [04-jilt-builders](04-jilt-builders)
    re-implements all of the previous examples, but this time using the
    [Jilt library](https://github.com/skinny85/jilt)
    instead of writing the Builders by hand.
