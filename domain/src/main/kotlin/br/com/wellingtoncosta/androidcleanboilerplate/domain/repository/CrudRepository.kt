package br.com.wellingtoncosta.androidcleanboilerplate.domain.repository

/**
 * @author Wellington Costa on 17/12/2018.
 **/
interface CrudRepository<T, ID> {

    suspend fun findAll(): List<T>

    suspend fun findById(id: ID): T?

    suspend fun save(model: T): T

    suspend fun update(model: T): T

    suspend fun delete(id: ID)

}