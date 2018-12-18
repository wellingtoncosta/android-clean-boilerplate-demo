package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.fuel

import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.MovieApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Movie

/**
 * @author Wellington Costa on 18/12/2018.
 **/
class MovieFuelApi : MovieApi {

    override suspend fun save(movie: Movie): Movie {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun update(id: Long, movie: Movie): Movie {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun delete(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun listAllByUser(userId: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}