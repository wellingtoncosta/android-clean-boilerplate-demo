package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Book

/**
 * @author Wellington Costa on 18/12/2018.
 **/
interface BookApi {

    suspend fun save(book: Book): Book

    suspend fun update(id: Long, book: Book): Book

    suspend fun delete(id: Long)

    suspend fun listAllByUser(userId: Long)

}