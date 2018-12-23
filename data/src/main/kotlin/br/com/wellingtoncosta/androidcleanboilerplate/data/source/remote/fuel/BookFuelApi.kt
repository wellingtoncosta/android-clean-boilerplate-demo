package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.fuel

import awaitStringResult
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.BookApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Book
import com.github.kittinunf.fuel.Fuel
import kotlinx.serialization.json.JSON
import kotlinx.serialization.list

/**
 * @author Wellington Costa on 18/12/2018.
 **/
class BookFuelApi : BookApi {

    override suspend fun save(book: Book) = runAsyncOnIo {
        Fuel.post("/api/books")
            .jsonBody(JSON.stringify(Book.serializer(), book))
            .awaitStringResult().get()
            .let { JSON.parse(Book.serializer(), it) }
    }

    override suspend fun update(id: Long, book: Book) = runAsyncOnIo {
        Fuel.put("/api/books/$id")
            .jsonBody(JSON.stringify(Book.serializer(), book))
            .awaitStringResult().get()
            .let { JSON.parse(Book.serializer(), it) }
    }

    override suspend fun delete(id: Long) = runAsyncOnIo {
        Fuel.delete("/api/books/$id")
            .awaitStringResult().get()
            .let { Unit }
    }

    override suspend fun listAllByUser(userId: Long) = runAsyncOnIo {
        Fuel.get("/api/books/user/$userId")
            .awaitStringResult().get()
            .let { JSON.parse(Book.serializer().list, it) }
    }

}