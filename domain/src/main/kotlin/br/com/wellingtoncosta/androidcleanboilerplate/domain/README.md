# domain layer

This layer represents the domain elements of application, such as domain classes and contracts.

### exception package

This package should only contains exception classes.

### model package

This package should only contains data classes.

Ex.:

```kotlin
    data class User(val name: String, val email: String, val phone: String)
```

### repository package

This package should only contains repository contracts (interfaces).

Ex.:

```kotlin
    interface PersonRepository {
        
        fun findAll(): List<Person>
        
        fun findById(id: Long): Person
        
        fun save(): Person
        
        fun update(): Person
        
        fun delete(id: Long)
        
    }
```