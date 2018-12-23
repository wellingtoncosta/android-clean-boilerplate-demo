package br.com.wellingtoncosta.androidcleanboilerplate.data.repository

import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runJobOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.mapper.toDomain
import br.com.wellingtoncosta.androidcleanboilerplate.data.mapper.toEntity
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao.MovieDao
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Movie
import br.com.wellingtoncosta.androidcleanboilerplate.domain.repository.MovieRepository

/**
 * @author Wellington Costa on 23/12/18
 */
class MovieDataRepository(
    private val dao: MovieDao
) : MovieRepository {

    override suspend fun findByName(name: String) = runAsyncOnIo {
        dao.findByTitle(name).map { it.toDomain() }
    }

    override suspend fun findAll() = runAsyncOnIo {
        dao.findAll().map { it.toDomain() }
    }

    override suspend fun findById(id: Long) = runAsyncOnIo {
        dao.findById(id)?.toDomain()
    }

    override suspend fun save(model: Movie) = runAsyncOnIo {
        val id = dao.insert(model.toEntity())
        model.copy(id = id)
    }

    override suspend fun update(model: Movie) = runAsyncOnIo {
        dao.update(model.toEntity())
        model
    }

    override suspend fun delete(id: Long) = runJobOnIo { dao.delete(id) }

}