package br.com.wellingtoncosta.androidcleanboilerplate.data.repository

import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runJobOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.mapper.toDomain
import br.com.wellingtoncosta.androidcleanboilerplate.data.mapper.toEntity
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao.BookDao
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Book
import br.com.wellingtoncosta.androidcleanboilerplate.domain.repository.BookRepository

/**
 * @author Wellington Costa on 23/12/18
 */
class BookDataRepository(
    private val dao: BookDao
) : BookRepository {

    override suspend fun findByTitle(title: String) = runAsyncOnIo {
        dao.findByTitle(title).map { it.toDomain() }
    }

    override suspend fun findAll() = runAsyncOnIo {
        dao.findAll().map { it.toDomain() }
    }

    override suspend fun findById(id: Long) = runAsyncOnIo {
        dao.findById(id)?.toDomain()
    }

    override suspend fun save(model: Book) = runAsyncOnIo {
        val id = dao.insert(model.toEntity())
        model.copy(id = id)
    }

    override suspend fun update(model: Book) = runAsyncOnIo {
        dao.update(model.toEntity())
        model
    }

    override suspend fun delete(id: Long) = runJobOnIo { dao.delete(id) }

}