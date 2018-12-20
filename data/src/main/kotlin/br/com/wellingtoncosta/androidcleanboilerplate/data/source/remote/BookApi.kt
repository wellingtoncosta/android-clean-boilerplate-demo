package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Book
import com.github.kittinunf.result.Result

/**
 * @author Wellington Costa on 18/12/2018.
 **/
interface BookApi {

    suspend fun save(book: Book): Result<Book, Exception>

    suspend fun update(id: Long, book: Book): Result<Book, Exception>

    suspend fun delete(id: Long): Result<Unit, Exception>

    suspend fun listAllByUser(userId: Long): Result<List<Book>, Exception>

}