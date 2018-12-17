package br.com.wellingtoncosta.androidcleanboilerplate.domain.repository

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Movie

/**
 * @author Wellington Costa on 17/12/2018.
 **/
interface MovieRepository : CrudRepository<Movie, Long> {

    suspend fun findByName(name: String): List<Movie>

}