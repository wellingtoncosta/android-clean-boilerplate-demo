package br.com.wellingtoncosta.androidcleanboilerplate.domain.repository

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Book

/**
 * @author Wellington Costa on 17/12/2018.
 **/
interface BookRepository : CrudRepository<Book, Long> {

    suspend fun findByTitle(title: String): List<Book>

}