package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.fuel

import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.BookApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Book

/**
 * @author Wellington Costa on 18/12/2018.
 **/
class BookFuelApi : BookApi {

    override suspend fun save(book: Book): Book {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun update(id: Long, book: Book): Book {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun delete(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun listAllByUser(userId: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}