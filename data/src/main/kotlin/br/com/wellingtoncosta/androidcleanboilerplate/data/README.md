# data layer

This layer represents all of things that deal with data access, and the data can be provided from a local source, such as database, shared preferences or filesystem, or a remote source from some web service.

### mapper package

This package should only contains classes that represents mappers of data classes.

Ex.:

```kotlin

    fun User.toEntity() = UserEntity(id = this.id, name = this.name, email = this.email, phone = this.phone)

    fun UserEntity.toModel() = User(id = this.id, name = this.name, email = this.email, phone = this.phone)

```

### repository package

This package should only contains the implementations of repository contracts defined in domain layer. These repository implementations must be the entry point for data access.

### source package

This package should only contains classes that encapsulates data access from local or remote source.