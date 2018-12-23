package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Movie

/**
 * @author Wellington Costa on 18/12/2018.
 **/
interface MovieApi {

    suspend fun save(movie: Movie): Movie

    suspend fun update(id: Long, movie: Movie): Movie

    suspend fun delete(id: Long)

    suspend fun listAllByUser(userId: Long): List<Movie>

}