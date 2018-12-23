package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.fuel

import awaitStringResult
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.MovieApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Movie
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.result.map
import com.github.kittinunf.result.mapError
import kotlinx.serialization.json.JSON
import kotlinx.serialization.list

/**
 * @author Wellington Costa on 18/12/2018.
 **/
class MovieFuelApi : MovieApi {

    override suspend fun save(movie: Movie) = runAsyncOnIo {
        Fuel.post("/api/movies")
            .jsonBody(JSON.stringify(Movie.serializer(), movie))
            .awaitStringResult().get()
            .let { JSON.parse(Movie.serializer(), it) }
    }

    override suspend fun update(id: Long, movie: Movie) = runAsyncOnIo {
        Fuel.put("/api/movies/$id")
            .jsonBody(JSON.stringify(Movie.serializer(), movie))
            .awaitStringResult().get()
            .let { JSON.parse(Movie.serializer(), it) }
    }

    override suspend fun delete(id: Long) = runAsyncOnIo {
        Fuel.delete("/api/movies/$id")
            .awaitStringResult().get()
            .let { Unit }
    }

    override suspend fun listAllByUser(userId: Long) = runAsyncOnIo {
        Fuel.get("/api/books/user/$userId")
            .awaitStringResult().get()
            .let { JSON.parse(Movie.serializer().list, it) }
    }

}