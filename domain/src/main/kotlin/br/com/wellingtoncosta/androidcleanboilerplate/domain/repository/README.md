# repository package

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