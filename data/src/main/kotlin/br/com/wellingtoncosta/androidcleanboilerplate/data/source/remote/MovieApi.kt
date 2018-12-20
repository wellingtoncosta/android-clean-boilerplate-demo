package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Movie
import com.github.kittinunf.result.Result

/**
 * @author Wellington Costa on 18/12/2018.
 **/
interface MovieApi {

    suspend fun save(movie: Movie): Result<Movie, Exception>

    suspend fun update(id: Long, movie: Movie): Result<Movie, Exception>

    suspend fun delete(id: Long): Result<Unit, Exception>

    suspend fun listAllByUser(userId: Long): Result<List<Movie>, Exception>

}