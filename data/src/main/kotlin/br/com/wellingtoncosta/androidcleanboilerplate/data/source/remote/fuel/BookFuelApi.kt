package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.fuel

import awaitStringResult
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.BookApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Book
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.result.map
import com.github.kittinunf.result.mapError
import kotlinx.serialization.json.JSON
import kotlinx.serialization.list

/**
 * @author Wellington Costa on 18/12/2018.
 **/
class BookFuelApi : BookApi {

    override suspend fun save(book: Book) = runAsyncOnIo {
        Fuel.post("/api/books")
            .jsonBody(JSON.stringify(Book.serializer(), book))
            .awaitStringResult()
            .map { data -> JSON.parse(Book.serializer(), data) }
            .mapError { error -> error.exception }
    }

    override suspend fun update(id: Long, book: Book) = runAsyncOnIo {
        Fuel.put("/api/books/$id")
            .jsonBody(JSON.stringify(Book.serializer(), book))
            .awaitStringResult()
            .map { data -> JSON.parse(Book.serializer(), data) }
            .mapError { error -> error.exception }
    }

    override suspend fun delete(id: Long) = runAsyncOnIo {
        Fuel.delete("/api/books/$id")
            .awaitStringResult()
            .map { Unit }
            .mapError { error -> error.exception }
    }

    override suspend fun listAllByUser(userId: Long) = runAsyncOnIo {
        Fuel.get("/api/books/user/$userId")
            .awaitStringResult()
            .map { data -> JSON.parse(Book.serializer().list, data) }
            .mapError { error -> error.exception }
    }

}