# mapper package

This package should only contains classes that represents mappers of data classes.

Ex.:

```kotlin

    data class User(val id: Long?, val name: String, val email: String, val phone: String)
    
    data class UserEntity(
        @PrimaryKey val id: Long?,
        @ColumnInfo(name = "name") val name: String,
        @ColumnInfo(name = "email") val email: String,
        @ColumnInfo(name = "phone") val phone: String
    )
    
    // Mappers
    
    fun User.toEntity() = UserEntity(id = this.id, name = this.name, email = this.email, phone = this.phone)
    
    fun UserEntity.toModel() = User(id = this.id, name = this.name, email = this.email, phone = this.phone)

```